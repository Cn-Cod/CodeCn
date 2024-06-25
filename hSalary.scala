object hSalary {
  var nWork_hours =40;
  var OTW_hours =30;

 
  
  def main(args: Array[String]): Unit = {

	print("home salary is Rs.");
	print((nWork_hours*250.00 + OTW_hours*85.00)*88/100);
	}
}