package exercises;

/**
 * Code from Display 10.1 in the book.
 * The constructor for PrintWriter requires an object of the class FileOutputStream.
 * The constructor for FileOutputStream requires a String filename as parameter.
 * Declaration of the outputStream variable needs to be done outside the try block.
 * Otherwise, it would be a local variable and not accessible for printing.
 * Using FileOutputStream("Stream10_1.txt", true) will append text (add to) an existing file.
 */

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class TextFileOutputDemo {

	public static void main(String[] args) {
		PrintWriter outputStream = null; //Needs to be declared outside the try block.
		try {
			outputStream = new PrintWriter(new FileOutputStream("Stream10_1.txt", true));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file stuff.txt.");
			System.exit(0);
		}
		System.out.println("Writing to file.");
		String text1 = "The quick brown fox";
		String text2 = "jumps over the lazy dog.";
		outputStream.println(text1);
		outputStream.println(text2);
		outputStream.close();
		System.out.println("End of program.");
	}

}