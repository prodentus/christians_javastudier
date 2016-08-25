package exercises;

public class Car {
	
	public static final int MAX_SPEED = 150;
	
	private String name;
	private int currentSpeed;
	private boolean isOverheated;
	private Radio radio = null;
	
	public Car() {
		this("Okänd", 0); //anropar den egna konstruktorn med parametrar.
	}
	
	public Car(String carName, int currentSpeed) {
		this.name = carName;
		this.currentSpeed = currentSpeed;
		this.isOverheated= false;
		radio = new Radio();
	}
	
	public void accelerate (int changeOfSpeed) {
		if (isOverheated) {
			System.out.println(name + " does not work.");
		} else {
			currentSpeed = currentSpeed + changeOfSpeed;
			if (currentSpeed > MAX_SPEED) {
				System.out.println(name + " is now overheated!");
				isOverheated = true;
				currentSpeed = 0;
			} else {
				System.out.println("OK. New current speed is " + currentSpeed);
			}
		}
	}
	
	public void turnOnRadio(boolean isOn) {
		radio.turnOn(isOn);
	}

}