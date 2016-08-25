package exercises;

public class ExercisesChapter04 {

	public static void main(String[] args) {
		runExercise404();
	}
	
	private static void runExercise401() {
		DateFirstTry date1 = new DateFirstTry();
		date1.year = "2016";
		date1.makeItNewYears();
		date1.writeOutput();
	}
	
	private static void runExercise402() {
		DateFirstTry date1 = new DateFirstTry();
		date1.year = "2016";
		date1.makeItNewYears();
		date1.writeOutput();
		date1.celebrateIfNewYear();
	}
	
	private static void runExercise403() {
		DateSecondTry date = new DateSecondTry();
		date.readInput();
		date.writeOutput();
		System.out.println("Next year is " + date.getNextYear());
	}
	
	private static void runExercise404() {
		DateSecondTry date = new DateSecondTry();
		date.readInput();
		date.writeOutput();
		date.happyGreeting();
	}
	
}