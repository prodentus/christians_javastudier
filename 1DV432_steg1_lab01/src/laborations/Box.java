package laborations;

/**
 * Steg4_lab02
 * 
 * Handles a box.
 * Calculates volume and total area.
 * 
 * Throws two kind of exceptions:
 * 1. The input string cannot be parsed to int.
 * 2. The input can be parsed to int but is below zero.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

public class Box extends RectangleImproved {

	private int depth;
	
	public Box() {
		super();
		this.depth = 0;
	}
	
	public Box(int inputWidth, int inputHeight, int inputDepth) throws RectangleException {
		super(inputWidth, inputHeight);
		setDepth(inputDepth);
	}
	
	public int computeVolume() {
		return (getWidth() * getHeight() * getDepth());
	}
	
	@Override
	public int computeArea() {
		int areaWidthHeight = getWidth() * getHeight();
		int areaWidthDepth = getWidth() * getDepth();
		int areaHeightDepth = getHeight() * getDepth();
		int totalAreaOfSixSides = 2 * areaWidthHeight + 2 * areaWidthDepth + 2 * areaHeightDepth;
		return totalAreaOfSixSides;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public void setDepth(int inputDepth) throws RectangleException {
		if (inputDepth < 0) {
			throw new RectangleException("Djupet kan inte vara mindre än noll!");
		} else {
			this.depth = inputDepth;
		}
	}
	
	@Override
	public String toString() {
		return ("En låda med bredden " + getWidth() + ", höjden " + getHeight() + " och djupet " + getDepth() + " längdenheter.");
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == null) {
			return false;
		} else if (this.getClass() != otherObject.getClass()) {
			return false;
		} else {
			Box otherBox = (Box)otherObject;
			boolean hasSameWidthAndHeight = super.equals(otherObject);
			boolean hasSameDepth  = (this.getDepth() == otherBox.getDepth());
			return (hasSameWidthAndHeight && hasSameDepth);
		}
	}

	public boolean isVolumeSmallerThan(Box otherBox) {
		return this.computeVolume() < otherBox.computeVolume();
	}

	public boolean isVolumeGreaterThan(Box otherBox) {
		return this.computeVolume() > otherBox.computeVolume();
	}

	public boolean isAreaSmallerThan(Box otherBox) {
		return this.computeArea() < otherBox.computeArea();
	}

	public boolean isAreaLargerThan(Box otherBox) {
		return this.computeArea() > otherBox.computeArea();
	}
	
}