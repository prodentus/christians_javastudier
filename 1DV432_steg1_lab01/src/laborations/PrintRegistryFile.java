package laborations;

/**
 * Asks the user to input register lines with first name, family name and phone number
 * for a number of persons.
 * Then adds the data to a registry text file
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class PrintRegistryFile {
	
	public static final String FILE_NAME = "nameregistry.txt";

	public static void main(String[] args) {
		System.out.println("Registry input to the file: \"" + FILE_NAME + "\".");
		System.out.println("Please input register lines with first name, family name and phone number.");
		System.out.println("End the input with an empty line.");
		Scanner scanner = new Scanner(System.in);
		Boolean hasFinishedInput = false;
		while (!hasFinishedInput) {
			String inputTextLine = scanner.nextLine();
			if (!inputTextLine.equals("")) {
				printTextLineToFile(inputTextLine);
			} else {
				hasFinishedInput = true;
			}
		}
		scanner.close();
		System.out.println("Thank you! Your input has been added to the registry.");
	}
		
	private static void printTextLineToFile(String inputTextLine) {
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter (new FileOutputStream(FILE_NAME, true));
		} catch(FileNotFoundException e) {
			System.out.println("Could not write to file: " + FILE_NAME);
			System.exit(0);
		}
		outputStream.println(inputTextLine);
		outputStream.close();
	}
		
}