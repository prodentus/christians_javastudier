package exercises_step2;

public class DateFirstTryDemo {

	public static void main(String[] args) {
		DateFirstTry date1 = new DateFirstTry();
		DateFirstTry date2 = new DateFirstTry();
		date1.year = "2012";
		date1.month = "01";
		date1.day = "22";
		System.out.println("First date: ");
		date1.writeOutput();
		
		// Exercise 401
		date1.makeItNewYears();
		date1.writeOutput();
	}

}
