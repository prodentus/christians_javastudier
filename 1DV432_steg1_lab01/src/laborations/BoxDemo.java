package laborations;

/**
 * Steg4_lab02
 * Creates a box with constants (my box).
 * Takes input from the keyboard for width, height and depth of a box (your box).
 * Describes both boxes with measurements, volume and total area.
 * Compares the boxes to see which one has more volume and total area.
 * 
 * Catches two kinds of exceptions which are thrown from the Box class:
 * 1. The input string cannot be parsed to int.
 * 2. The input can be parsed to int but is below zero.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

import java.util.Scanner;

public class BoxDemo {
	
	public static final int MY_BOX_WIDTH = 5;
	public static final int MY_BOX_HEIGHT = 10;
	public static final int MY_BOX_DEPTH = 15;
	public static final String NUMBER_FORMAT_EXCEPTION_MESSAGE = "Inmatningen utgör inte något heltal!";
	
	public static void main(String[] args) {
		Box myBox = new Box(MY_BOX_WIDTH, MY_BOX_HEIGHT, MY_BOX_DEPTH);
		describeMyBox(myBox);
		Box yourBox = makeBoxFromUserInput();
		describeYourBox(yourBox);
		compareBoxes(myBox, yourBox);
	}

	public static void describeMyBox (Box box) {
		System.out.println("Jag har: ");
		describeBox(box);
	}
	
	public static void describeYourBox (Box box) {
		System.out.println("Du har: ");
		describeBox(box);
	}
	
	public static void describeBox(Box box) {
		System.out.println(box.toString());
		System.out.println("Lådans volym är " + box.computeVolume() + " volymenheter.");
		System.out.println("Sammanlagd area av lådans sidor är " + box.computeArea() + " areaenheter.");
		System.out.println();
	}

	public static Box makeBoxFromUserInput() {
		Scanner scanner = new Scanner(System.in);
		BoxInputStatus boxInputStatus = new BoxInputStatus();
		while (!boxInputStatus.isValidAllInput()) {
			try {
				if (!boxInputStatus.isValidInputWidth()) {
					String strInputWidth = readWidth(scanner);
					boxInputStatus.setInputWidth(strInputWidth);
					System.out.println(boxInputStatus.getValidInputWidthMessage());
				}
				if (!boxInputStatus.isValidInputHeight()) {
					String strInputHeight = readHeight(scanner);
					boxInputStatus.setInputHeight(strInputHeight);
					System.out.println(boxInputStatus.getValidInputHeightMessage());
				}
				if (!boxInputStatus.isValidInputDepth()) {
					String strInputDepth = readDepth(scanner);
					boxInputStatus.setInputDepth(strInputDepth);
					System.out.println(boxInputStatus.getValidInputDepthMessage());
				}
			} catch (RectangleException rectangleException) {
				scanner.nextLine();
				System.out.println(rectangleException.getMessage());
			} catch (NumberFormatException numberFormatException) {
				scanner.nextLine();
				System.out.println(NUMBER_FORMAT_EXCEPTION_MESSAGE);
			}
		}
		scanner.close();
		return boxInputStatus.getBox();
	}

	private static String readDepth(Scanner scanner) {
		System.out.println("Ange djup på din låda som ett positivt heltal: ");
		return readNext(scanner);
	}

	private static String readNext(Scanner scanner) {
		return scanner.next();
	}

	private static String readHeight(Scanner scanner) {
		System.out.println("Ange höjd på din låda som ett positivt heltal: ");
		return readNext(scanner);
	}

	private static String readWidth(Scanner scanner) {
		System.out.println("Ange bredd på din låda som ett positivt heltal: ");
		return readNext(scanner);
	}
	
	public static void compareBoxes(Box myBox, Box yourBox) {
		System.out.println(makeCompareBoxesEqualsMessage(myBox, yourBox));
		System.out.println(makeCompareBoxesVolumesMessage(myBox, yourBox));
		System.out.println(makeCompareBoxesAreasMessage(myBox, yourBox));
	}
		
	public static String makeCompareBoxesEqualsMessage(Box myBox, Box yourBox) {
		if (myBox.equals(yourBox)) {
			return "Våra lådor har exakt samma mått.";
		} else {
			return "Våra lådor har inte exakt samma mått.";
		}
	}
	
	public static String makeCompareBoxesVolumesMessage (Box myBox, Box yourBox) {
		if (myBox.isVolumeGreaterThan(yourBox)) {
			return "Min låda har större volym än din.";
		} else if (myBox.isVolumeSmallerThan(yourBox)){
			return "Din låda har större volym än min.";
		} else {
			return "Våra lådor rymmer lika mycket.";
		}
	}
	
	public static String makeCompareBoxesAreasMessage(Box myBox, Box yourBox) {
		if (myBox.isAreaLargerThan(yourBox)) {
			return "Min låda har större sammanlagd area än din.";
		} else if (myBox.isAreaSmallerThan(yourBox)){
			return "Din låda har större sammanlagd area än min.";
		} else {
			return "Våra lådor har lika stor sammanlagd area.";
		}
	}
	
}
