package cl222zy;

/**
 * A simple test of the equals method in the Rectangle class.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

public class RectangleEqualsTest {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10, 20);
		Rectangle rectangle2 = new Rectangle(10, 30);
		RectangleImproved rectangleImproved1 = new RectangleImproved(10, 20);
		RectangleImproved rectangleImproved2 = new RectangleImproved(10, 20);
		boolean isEqual1 = rectangle1.equals(rectangleImproved1);
		boolean isEqual2 = rectangleImproved1.equals(rectangle1);
		boolean isEqual3 = rectangle1.equals(rectangle2);
		boolean isEqual4 = rectangleImproved1.equals(rectangleImproved2);
		System.out.println(isEqual1);
		System.out.println(isEqual2);
		System.out.println(isEqual3);
		System.out.println(isEqual4);
	}

}