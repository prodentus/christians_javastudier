package cl222zy;

public class BinaryToCharsDemo {

	public static void main(String[] args) {
		BinaryToChars binaryToChars = new BinaryToChars("krypto.txt");
		binaryToChars.getCryptoText();
		binaryToChars.presentDecryptedMessage();
		binaryToChars.printCharsFromCryptoText();
	}

}