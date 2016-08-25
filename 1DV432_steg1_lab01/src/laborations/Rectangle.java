package laborations;

/**
 * Steg4_lab01
 * Handles an rectangle
 * Calculates the area of a rectangle.
 * There is no exception handling in this class, so that must be handled by main program.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int computeArea() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return ("En rektangel med bredden " + width + " och höjden " + height + " längdenheter.");
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == null) {
			return false;
		} else if (this.getClass() != otherObject.getClass()) {
			return false;
		} else {
			Rectangle otherRectangle = (Rectangle)otherObject;
			boolean hasSameWidth = this.getWidth() == otherRectangle.getWidth();
			boolean hasSameHeight  = this.getHeight() == otherRectangle.getHeight();
			return (hasSameWidth && hasSameHeight);
		}
	}
	
}