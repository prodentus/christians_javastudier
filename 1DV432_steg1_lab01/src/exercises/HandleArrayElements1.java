package exercises;

public class HandleArrayElements1 {
	
	private HandleArrayElements1() {
	}

	public static void addOneToEachElement(int[] inputArray) {
		for (int i = 0 ; i < inputArray.length ; i++) {
			inputArray[i] += 1;
		}
	}

}