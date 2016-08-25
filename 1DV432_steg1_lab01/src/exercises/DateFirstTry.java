package exercises;

public class DateFirstTry {
	public String year;
	public String month;
	public String day;
	
	public void writeOutput(){
		System.out.println(year + "-" + month + "-" + day);
	}
	
	// Exercise 401
	public void makeItNewYears(){
		month = "01";
		day = "01";
	}
	
	// Exercise 402
	public void celebrateIfNewYear(){
		if ( month.equals("01") && day.equals("01") ) {
			System.out.println("Happy New Year " + year + "!");
		} else {
			System.out.println("Sorry, it is not New Year's Day");
		}
	}
	
}