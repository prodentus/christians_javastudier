package laborations;

/**
 * Reads the file "krypto.txt" which consists of one line of binary code.
 * Then converts each byte of eight bits to chars and prints the encrypted
 * message on the screen.
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BinaryTextDecrypter {
	
	public static final int BYTE_LENGTH = 8;

	public static void main(String[] args) {
		String fileName = "krypto.txt";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Kunde inte öppna filen.");
			System.exit(0);
		}
		String cryptoText = inputStream.nextLine();
		inputStream.close();
		System.out.println("Dekrypterat meddelande från filen " + fileName + " följer:");
		System.out.println();
		printCharsFromCryptoText(cryptoText);
	}
	
	private static void printCharsFromCryptoText(String cryptoText) {
		int messageCharacterCount = cryptoText.length() / BYTE_LENGTH;
		for (int i = 0 ; i < messageCharacterCount ; i++) {
			String binaryCode = cryptoText.substring(i*BYTE_LENGTH, (i+1)*BYTE_LENGTH);
			int binaryCodeValue = Integer.parseInt(binaryCode, 2);
			System.out.print((char)binaryCodeValue);
		}
	}
		
}