package laborations;

/**
 * Steg3_lab11
 * Asks the user to input register lines with first name, family name and phone number
 * for a number of persons.
 * Then adds the data to a registry text file. Filename taken as parameter in the constructor.
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class RegistryHandler {
	
	private String fileName = null;
	
	public RegistryHandler(String fileName) {
		this.fileName = fileName;
	}
	
	public void introduceUser() {
		System.out.println("Registry input to the file: \"" + fileName + "\".");
		System.out.println("Please input registry lines with first name, family name and phone number.");
		System.out.println("End the input with an empty line.");
	}
	
	public void inputTextLineAndPrintToFile() {
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
	
	public void printTextLineToFile(String inputTextLine) {
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter (new FileOutputStream(fileName, true));
		} catch(FileNotFoundException e) {
			System.out.println("Could not write to file: \"" + fileName + "\".");
			System.exit(0);
		}
		outputStream.println(inputTextLine);
		outputStream.close();
	}
	
}