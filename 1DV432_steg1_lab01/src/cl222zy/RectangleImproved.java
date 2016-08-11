package cl222zy;

/**
 * Steg4_lab03
 * Handles a rectangle, improving on the Rectangle class.
 * Calculates the area.
 * 
 * Throws two kind of exceptions:
 * 1. The input string cannot be parsed to int.
 * 2. The input can be parsed to int but is below zero.
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

public class RectangleImproved extends Rectangle {

	public RectangleImproved() {
		super();
	}
	
	public RectangleImproved(int inputWidth, int inputHeight) throws RectangleException {
		super();
		this.setWidth(inputWidth);
		this.setHeight(inputHeight);
	}
	
	public RectangleImproved(String strInputWidth, String strInputHeight) throws RectangleException, NumberFormatException {
		super();
		this.setWidth(strInputWidth);
		this.setHeight(strInputHeight);
	}
	
	@Override
	public void setWidth(int inputWidth) throws RectangleException {
		if (inputWidth < 0) {
			throw new RectangleException("Bredden kan inte vara mindre än noll!");
		} else {
			super.setWidth(inputWidth);
		}
	}
	
	public void setWidth (String strInputWidth) throws RectangleException, NumberFormatException {
		int intWidth = Integer.parseInt(strInputWidth);
		this.setWidth(intWidth);
	}
	
	@Override
	public void setHeight(int inputHeight) throws RectangleException {
		if (inputHeight < 0) {
			throw new RectangleException("Höjden kan inte vara mindre än noll!");
		} else {
			super.setHeight(inputHeight);
		}
	}
	
	public void setHeight(String strInputHeight) throws RectangleException, NumberFormatException {
		int intHeight = Integer.parseInt(strInputHeight);
		this.setHeight(intHeight);
	}
}