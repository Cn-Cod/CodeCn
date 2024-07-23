object totalCost {
  var coverPrice = 24.95;
  var total = (coverPrice * 60 * 0.6) + (3 + 10 * 0.75);

  def main(args: Array[String]): Unit = {
    println();
    println(f"Total cost is Rs. $total%.2f");
  }
}
