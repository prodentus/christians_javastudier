package exercise_step3_611;

public class ChangeArrayDemo2 {

	public static void main(String[] args) {
		double [] inputArray = new double [11];
		for (int i = 0 ; i < inputArray.length ; i++) {
			inputArray[i] = i * 10.0;
		}
		ChangeArray.printArray(inputArray);
		inputArray = ChangeArray.halfArray(inputArray);
		ChangeArray.printArray(inputArray);
	}

}