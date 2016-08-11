package exercise_step3_10_26;

import java.io.File;

public class TestForDirectory {

	public static void main(String[] args) {
		String fileName = "sally.txt";
		File testFile = new File(fileName);
		if (testFile.exists()) {
			System.out.println("OK, " + fileName + " exists.");
		} else {
			System.out.println("No, " + fileName + " does not exist.");
		}
	}

}
