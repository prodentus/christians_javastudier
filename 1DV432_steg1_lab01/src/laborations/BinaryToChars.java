package laborations;

/**
 * Steg3_lab13
 * Reads a file which consists of one line of binary code.
 * Then converts each byte of eight bits to chars and prints the encrypted
 * message on the screen.
 * 
 * @author Christian Löwendahl
 * 2016-07-03
 * 2016-07-04 Quick refactoring, input from Karl Rystedt.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BinaryToChars {
	
	private static final int BYTE_LENGTH = 8;
	private static final int BINARY_RADIX = 2;
	private String fileName = null;
	private String cryptoText = null;

	public BinaryToChars(String fileName) {
		this.fileName = fileName;
	}
	
	public void getCryptoText() {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream(fileName));
			cryptoText = inputStream.nextLine();
		} catch (FileNotFoundException e) {
			System.out.println("Kunde inte öppna filen \"" + fileName + "\".");
			System.exit(0);
		} finally {
			inputStream.close();
		}
	}
	
	public void presentDecryptedMessage() {
		System.out.println("Dekryptering genomförd av binärkod i filen \"" + fileName + "\".");
		System.out.println("Meddelandet följer i klartext:");
		System.out.println();
	}
	
	public void printCharsFromCryptoText() {
		int messageCharacterCount = cryptoText.length() / BYTE_LENGTH;
		for (int i = 0 ; i < messageCharacterCount ; i++) {
			String binaryCode = findBinaryCode(i);
			char decryptedChar = binaryToChar(binaryCode);
			System.out.print(decryptedChar);
		}
	}

	private String findBinaryCode(int i) {
		int characterStartPosition = i*BYTE_LENGTH;
		int characterEndPosition = (i+1)*BYTE_LENGTH;
		String binaryCode = cryptoText.substring(characterStartPosition, characterEndPosition);
		return binaryCode;
	}
	
	private char binaryToChar(String binaryCode) {
		int binaryCodeValue = Integer.parseInt(binaryCode, BINARY_RADIX);
		return (char)binaryCodeValue;
	}

}