package exercises;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Precondition: scanner is an object of the class Scanner that
 * has been set up for keyboard input.
 * Returns: an int value entered at the keyboard.
 * If the user enters an incorrectly formed input,
 * he is prompted to re-enter the value.
 * 
 * @author christian
 *
 */

public class KeyboardInputWithExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		boolean done = false;
		System.out.println("Please input a whole number.");
		while (!done) {
			try {
				inputNumber = scanner.nextInt();
				done = true;
			} catch(InputMismatchException exception) {
				scanner.nextLine();
				System.out.println("That is not a correctly written whole number.");
				System.out.println("Please try again.");
			}
		}
		System.out.println("You entered: " + inputNumber);
		scanner.close();
	}
	
}