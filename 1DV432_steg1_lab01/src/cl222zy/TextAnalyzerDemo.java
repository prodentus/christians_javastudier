package cl222zy;

import java.util.Scanner;

public class TextAnalyzerDemo {

	public static void main(String[] args) {
		System.out.println("HUR MÅNGA VERSALER?");
		System.out.println();
		System.out.println("Ange text som ska analyseras:");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int upperCaseCount = TextAnalyzer.getUpperCaseCount(text);
		System.out.println("Den inmatade texten innehåller " + upperCaseCount + " versaler.");
		scanner.close();
	}

}