package exercises_step1;

import java.util.Scanner;

public class ExercisesChapter02 {

	public static void main(String[] args) {	
		runExercise214();
	}
	
	private static void runExercise201() {
		double celsius = 20.0;
		double multiplierCelciusToFahrenheit = 1.8;
		double additionCelciusToFahrenheit = 32.0;
		double fahrenheit;
		fahrenheit = celsius * multiplierCelciusToFahrenheit + additionCelciusToFahrenheit;
		System.out.println(fahrenheit);
	}
	
	private static void runExercise207() {
		double OutputVariable = 2.547;
		System.out.printf("%15.3e",OutputVariable);
	}

	private static void runExercise213() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Please enter two numbers.");
		int firstInput = scannerObject.nextInt();
		int secondInput = scannerObject.nextInt();
		int result = firstInput + secondInput;
		System.out.println(firstInput + " plus " + secondInput + " equals " + result);
		scannerObject.close();
	}
	
	private static void runExercise214() {
		System.out.println("Please enter three words.");
		// Scanner scanner = new Scanner(System.in)
		Scanner scanner = null;
		// Tänk på att scanner är en (hittills tom) variabel, inte ett objekt
		scanner = new Scanner(System.in);
		// Nu tog variabeln scanner tag i ett objekt av klassen Scanner
		Scanner anotherScannerVariable = scanner;
		// Nu har vi två variabler (scanner och anotherScannerVariable) som pekar
		// samma objekt.
		int wordCountTotal = 3;
		String[] inputWords = new String[wordCountTotal];
		for (int wordCount = 1; wordCount <= wordCountTotal; wordCount++){
			inputWords[wordCount-1] = anotherScannerVariable.next(); 
		}
		for (int wordCount = 1 ; wordCount <= wordCountTotal ; wordCount++){
			System.out.print(inputWords[wordCount-1]);
			if (wordCount != wordCountTotal) {
				System.out.print(" ");
			}
		}
		scanner.close();
	}
	
}
