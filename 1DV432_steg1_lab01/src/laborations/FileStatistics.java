package laborations;

/**
 * Steg3_lab10
 * Analyzes the integers in a file with filename taken as a parameter in the constructor.
 * Calculates the sum, the mean value and the largest value.
 * Outputs a report with the results.
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileStatistics {
	
	private String fileName = null;
	private Scanner inputStream = null;
	private int sum = 0;
	private int count = 0;
	private int meanValue = 0;
	private int maxValue = 0;
	
	public FileStatistics(String fileName) {
		this.fileName = fileName;
	}
	
	public void openFile() {
		try {
			inputStream = new Scanner(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Kunde inte öppna filen \"" + fileName + "\".");
			System.exit(0);
		}
	}
	
	public void analyzeIntegersInFileAndCloseStream() {
		while(inputStream.hasNextInt()) {
			analyzeFoundInteger(inputStream.nextInt());
		}
		inputStream.close();
	}

	private void analyzeFoundInteger(int foundInteger) {
		sum += foundInteger;
		count ++;
		if (foundInteger > maxValue) {
			maxValue = foundInteger;
		}
	}
	
	public void writeReport() {
		System.out.println("Statistisk bedömning från filen \"" + fileName + "\":");
		System.out.println("Summa: " + sum);
		meanValue = sum / count;
		System.out.println("Medelvärde: " + meanValue);
		System.out.println("Maxvärde: " + maxValue);
	}
	
}