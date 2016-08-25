package exercises;

import java.util.Scanner;

public class DateSecondTry {
	private String year;
	private String month;
	private String day;
	
	public void writeOutput(){
		System.out.println(this.year + "-" + this.month + "-" + this.day );
	}
	
	public void readInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter year, month and day.");
		this.year = scanner.next();
		this.month = scanner.next();
		this.day = scanner.next();
		scanner.close();
	}
	
	public String getYear() {
		return this.year;
	}
		
	public String genMonth() {
		return this.month;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public String getNextYear() {
		int yearValue = Integer.valueOf(this.year);
		int nextYearValue = yearValue + 1;
		return String.valueOf(nextYearValue);
	}
	
	public void happyGreeting() {
		for (int i = 1 ; i <= Integer.valueOf(this.day) ; i++) {
			System.out.println("Happy Day " + i + "!");
		}
	}

}