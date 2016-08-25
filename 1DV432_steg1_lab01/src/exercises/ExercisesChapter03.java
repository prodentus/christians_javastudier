package exercises;

import java.util.Scanner;
import java.util.Random;

public class ExercisesChapter03 {

	public static void main(String[] args) {
		runExercise317();
	}
	
	private static void runExercise301() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your score as an integer.");
		int score = scanner.nextInt();
		int scoreHighLevel = 100;
		if (score > scoreHighLevel){
			System.out.println("High score, congratulations!");
		} else{
			System.out.println("Low score, sorry!");
		}
		scanner.close();
	}
	
	private static void runExercise302() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your savings and expenses as doubles.");
		double savings = scanner.nextDouble();
		double expenses = scanner.nextDouble();
		if (savings >= expenses){
			savings = savings - expenses;
			expenses = 0;
			System.out.printf("You are solvent with a positive balance of %6.2f", savings);
		} else {
			System.out.println("Warning! You are bankrupt!");
		}
		scanner.close();
	}
	private static void runExercise308() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input an int variable.");
		int input = scanner.nextInt();
		if(input<0) {
			System.out.println(input + " is a negative integer.");
		} else if( input < 100 ) {
			System.out.println(input + " is an integer between 0 and 99.");
		} else {
			System.out.println(input + " is an integer equal to or higher than 100.");
		}
		scanner.close();
	}
	
	private static void runExercise317() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your exam score and number of programs, as integers.");
		int examScore = scanner.nextInt();
		int examScorePassLimit = 60;
		boolean hasPassedExam = examScore >= examScorePassLimit;
		int programsDone = scanner.nextInt();
		int programsDoneEnoughLimit = 10;
		boolean hasDoneEnoughPrograms = programsDone >= programsDoneEnoughLimit; 
		if (hasPassedExam && hasDoneEnoughPrograms){
			System.out.println("Congratulations, you have passed!");
		} else{
			System.out.println("Sorry, you have failed!");
		}
		scanner.close();
	}
	
	private static void runExercise3Random(){
		Random randomGenerator = new Random();
		int randomInteger = randomGenerator.nextInt(1);
		System.out.println("The random integer is " + randomInteger);
	}
	
}