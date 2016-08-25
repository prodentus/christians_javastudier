package laborations;

/**
 * Steg4_lab01
 * Takes input from the keyboard for width and height of a rectangle.
 * Describes the rectangle with measurement and area.
 * 
 * Handles two kinds of exceptions:
 * 1. The input string cannot be parsed to int.
 * 2. The input can be parsed to int but is below zero.
 * It would be better to have the error handling in the Rectangle class.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

import java.util.Scanner;

public class RectangleDemo {
	
	public static final String RUNTIME_EXCEPTION_MESSAGE = "Inmatningen utgör inte något heltal!";

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		inputAndSetMeasurements(rectangle);
		describeRectangle(rectangle);
	}

	public static void inputAndSetMeasurements(Rectangle rectangle) {
		Scanner scanner = new Scanner(System.in);
		inputAndSetWidth(scanner, rectangle);
		System.out.println("Tack! Bredden är nu satt till: " + rectangle.getWidth() + " längdenheter.");
		System.out.println();
		inputAndSetHeight(scanner, rectangle);
		System.out.println("Tack! Höjden är nu satt till: " + rectangle.getHeight() + " längdenheter.");
		System.out.println();
		scanner.close();
	}
		
	public static void inputAndSetWidth(Scanner scanner, Rectangle rectangle) {
		boolean hasDoneInput = false;
		while (!hasDoneInput) {
			System.out.println("Ange rektangelns bredd som ett positivt heltal: ");
			try {
				int InputWidth = Integer.parseInt(scanner.next());
				if (InputWidth < 0) {
					System.out.println("Bredden kan inte vara mindre än noll!");
					scanner.nextLine();
				} else {
					rectangle.setWidth(InputWidth);
					hasDoneInput = true;
				}
			} catch (RuntimeException runtimeException) {
				System.out.println(RUNTIME_EXCEPTION_MESSAGE);
				scanner.nextLine();
			}
		}
	}
		
	public static void inputAndSetHeight(Scanner scanner, Rectangle rectangle) {
		boolean hasDoneInput = false;
		while (!hasDoneInput) {
			System.out.println("Ange rektangelns höjd som ett positivt heltal: ");
			try {
				int InputHeight = Integer.parseInt(scanner.next());
				if (InputHeight < 0) {
					System.out.println("Höjden kan inte vara mindre än noll!");
					scanner.nextLine();
				} else {
					rectangle.setHeight(InputHeight);
					hasDoneInput = true;
				}
			} catch (RuntimeException runtimeException) {
				scanner.nextLine();
				System.out.println(RUNTIME_EXCEPTION_MESSAGE);
			}
		}
	}

	public static void describeRectangle(Rectangle rectangle) {
		System.out.println(rectangle);
		System.out.println();
		System.out.println("Arean beräknas nu till: " + rectangle.computeArea() + " areaenheter.");
	}

	
}