package laborations;

public class BoxInputStatus {
	
	private boolean isValidInputWidth = false;
	private boolean isValidInputHeight = false;
	private boolean isValidInputDepth = false;
	private Box box;
	
	public BoxInputStatus() {
		box = new Box();
	}

	public Box getBox() {
		return box;
	}
	
	public void setInputWidth(String inputWidth) {
		box.setWidth(inputWidth);
		isValidInputWidth = true;
	}

	public void setInputHeight(String inputHeight) {
		box.setHeight(inputHeight);
		isValidInputHeight = true;
	}

	public void setInputDepth(String inputDepth) throws RectangleException, NumberFormatException {
		int Depth = Integer.parseInt(inputDepth);
		box.setDepth(Depth);
		isValidInputDepth = true;
	}

	public boolean isValidInputWidth() {
		return isValidInputWidth;
	}
	
	public boolean isValidInputHeight() {
		return isValidInputHeight;
	}
	
	public boolean isValidInputDepth() {
		return isValidInputDepth;
	}

	public boolean isValidAllInput() {
		if (isValidInputWidth && isValidInputHeight && isValidInputDepth ) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getValidInputWidthMessage () {
		return "Tack! Bredden är nu satt till: " + box.getWidth() + " längdenheter.\n";
	}
	
	public String getValidInputHeightMessage () {
		return "Tack! Bredden är nu satt till: " + box.getHeight() + " längdenheter.\n";
	}
	
	public String getValidInputDepthMessage () {
		return "Tack! Bredden är nu satt till: " + box.getDepth() + " längdenheter.\n";
	}
	
}