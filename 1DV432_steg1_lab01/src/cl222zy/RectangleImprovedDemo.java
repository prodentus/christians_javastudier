package cl222zy;

/**
 * Steg4_lab03
 * 
 * Takes input from the keyboard for width and height of a rectangle.
 * Describes the rectangle with measurement and area.
 * 
 * Catches two kinds of errors which are thrown from the RectangleImproved class:
 * 1. The input string cannot be parsed to int.
 * 2. The input can be parsed to int but is below zero.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

import java.util.Scanner;

public class RectangleImprovedDemo {
	
	public static final String RUNTIME_EXCEPTION_MESSAGE = "Inmatningen utgör inte något heltal!";
	
	public static void main(String[] args) {
		RectangleImproved rectangleImproved = new RectangleImproved();
		inputAndSetMeasurements(rectangleImproved);
		describeRectangle(rectangleImproved);
	}

	public static void inputAndSetMeasurements(RectangleImproved rectangleImproved) {
		Scanner scanner = new Scanner(System.in);
		inputAndSetWidth(scanner, rectangleImproved);
		System.out.println("Tack! Bredden är nu satt till: " + rectangleImproved.getWidth() + " längdenheter.");
		System.out.println();
		inputAndSetHeight(scanner, rectangleImproved);
		System.out.println("Tack! Höjden är nu satt till: " + rectangleImproved.getHeight() + " längdenheter.");
		System.out.println();
		scanner.close();
	}
	
	public static void inputAndSetWidth(Scanner scanner, RectangleImproved rectangleImproved) {
		boolean hasDoneInput = false;
		while (!hasDoneInput) {
			System.out.println("Ange rektangelns bredd som ett positivt heltal: ");
			try {
				String strInputWidth = scanner.next();
				rectangleImproved.setWidth(strInputWidth);
				hasDoneInput = true;
			} catch (RectangleException rectangleException) {
				scanner.nextLine();
				System.out.println(rectangleException.getMessage());
			} catch (RuntimeException runtimeException) {
				scanner.nextLine();
				System.out.println(RUNTIME_EXCEPTION_MESSAGE);
			}
		}
	}
	
	public static void inputAndSetHeight(Scanner scanner, RectangleImproved rectangleImproved) {
		boolean hasDoneInput = false;
		while (!hasDoneInput) {
			System.out.println("Ange rektangelns höjd som ett positivt heltal: ");
			try {
				String strInputHeight = scanner.next();
				rectangleImproved.setHeight(strInputHeight);
				hasDoneInput = true;
			} catch (RectangleException rectangleException) {
				scanner.nextLine();
				System.out.println(rectangleException.getMessage());
			} catch (RuntimeException runtimeException) {
				scanner.nextLine();
				System.out.println(RUNTIME_EXCEPTION_MESSAGE);
			}
		}
	}

	private static void describeRectangle(RectangleImproved rectangleImproved) {
		System.out.println(rectangleImproved);
		System.out.println();
		System.out.println("Arean beräknas nu till: " + rectangleImproved.computeArea() + " areaenheter.");
	}
	
}

