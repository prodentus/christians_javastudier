package exercise_step3_608;

/** Using constructor and non-static methods to create an array of integers, 
 * set each element to its index and increase the value of each array element by one.
 * 
 * @author christian
 *
 */

public class HandleArrayElementsDemo2 {

	public static void main(String[] args) {
		HandleArrayElements2 testArray = new HandleArrayElements2(9);
		System.out.println(testArray.toString());
		testArray.addOneToEachElement();
		System.out.println(testArray.toString());
		testArray.addOneToEachElement();
		System.out.println(testArray.toString());
	}

}