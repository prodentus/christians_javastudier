package exercises;

/** Creates an array of integers, sets each element value to its index
 * and uses the static addOneToEachElement method to increase the value of each array element by one.
 * 
 * @author christian
 *
 */

public class HandleArrayElementsDemo1 {

	public static void main(String[] args) {
		int[] testArray = new int[9];
		for (int i = 0 ; i < testArray.length ; i++) {
			testArray[i] = i;
			System.out.print(testArray[i]);
		}
		System.out.println();
		HandleArrayElements1.addOneToEachElement(testArray);
		for (int i = 0 ; i < testArray.length ; i++) {
			System.out.print(testArray[i]);
		}
		System.out.println();
	}

}