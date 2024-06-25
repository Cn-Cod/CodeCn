import scala.io.StdIn.readLine

object ownerProfit {
  def main(args: Array[String]): Unit = {
    // Function to calculate attendance based on ticket price
    def attendance(price: Double): Int = {
      val basePrice = 15.0
      val baseAttendance = 120
      val priceChange = price - basePrice
      baseAttendance - ((priceChange / 5) * 20).toInt
    }

    // Function to calculate revenue based on ticket price
    def revenue(price: Double): Double = {
      price * attendance(price)
    }

    // Function to calculate total cost based on the number of attendees
    def totalCost(attendance: Int): Double = {
      val ownerCost = 500
      val CostPerAttendee = 3
      ownerCost + (attendance * CostPerAttendee)
    }

    // Function to calculate profit based on ticket price
    def profit(price: Double): Double = {
      val currentAttendance = attendance(price)
      revenue(price) - totalCost(currentAttendance)
    }

    // Take user input for ticket price
    println("Enter the ticket price (Rs.):")
    val ticketPrice = readLine().toDouble

    // Calculate and print the profit
    val profitAmount = profit(ticketPrice)
    println(f"The profit at ticket price Rs. $ticketPrice%.2f is Rs. $profitAmount%.2f")
  }
}
