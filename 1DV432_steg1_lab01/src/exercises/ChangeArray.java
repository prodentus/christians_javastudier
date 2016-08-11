package exercise_step3_611;

public class ChangeArray {
	
	double[] instanceArray;
	
	public ChangeArray(int arrayLength) {
		this.instanceArray = new double[arrayLength];
		for (int i=0 ; i < arrayLength ; i++) {
			this.instanceArray[i] = i*10;
		}
	}
	
	public static double[] halfArray(double[] inputArray) {
		double[] tempArray = new double[inputArray.length];
		for (int i = 0 ; i < inputArray.length ; i++) {
			tempArray[i] = inputArray[i] / 2.0;
		}
		/* for (double element : inputArray) {
			element = element / 2.0;
		}*/
		return tempArray;
	}
	
	public void halfArray() {
		for (int i = 0 ; i < instanceArray.length ; i++) {
			instanceArray[i] = instanceArray[i] / 2.0;
		}
		/* for (double element : instanceArray) {
			element = element / 2.0;
		} */
	}
	
	
	public static void printArray(double[] inputArray) {
		/* for (int i = 0 ; i < inputArray.length ; i++) {
			System.out.print(inputArray[i] + " ");
		} */
		for (double element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public void printArray() {
		/* for (int i = 0 ; i < instanceArray.length ; i++) {
			System.out.print(instanceArray[i] + " ");
		} */
		for (double element : instanceArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	
}