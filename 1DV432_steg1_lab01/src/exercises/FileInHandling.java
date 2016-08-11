package exercise_step3_10_08;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInHandling {

	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("sally.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening file");
			System.exit(0);
		}
		String textLine = null;
		int lineCount = 0;
		while (fileIn.hasNextLine()) {
			textLine = fileIn.nextLine();
			lineCount ++;
			System.out.println(lineCount + " " + textLine);
		}
		fileIn.close();
	}
}