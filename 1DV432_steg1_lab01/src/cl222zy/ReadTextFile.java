package cl222zy;

/**
 * Reads all integers in the file "heltal.txt".
 * Calculates and outputs the sum, the mean value and the largest value.
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadTextFile {
	
	public static final String FILE_NAME = "heltal.txt";

	public static void main(String[] args) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream(FILE_NAME));
		} catch (FileNotFoundException e) {
			System.out.println("Kunde inte öppna filen " + FILE_NAME + ".");
			System.exit(0);
		}
		int sum = 0;
		int count = 0;
		int meanValue = 0;
		int maxValue = 0;
		while(inputStream.hasNextInt()) {
			int foundInteger = inputStream.nextInt();
			sum += foundInteger;
			count ++;
			if (foundInteger > maxValue) {
				maxValue = foundInteger;
			}
		}
		inputStream.close();
		System.out.println("Statistisk bedömning från filen \"" + FILE_NAME + "\":");
		System.out.println("Summa: " + sum);
		meanValue = sum / count;
		System.out.println("Medelvärde: " + meanValue);
		System.out.println("Maxvärde: " + maxValue);
	}
	
}