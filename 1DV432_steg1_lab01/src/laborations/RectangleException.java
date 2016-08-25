package laborations;

/**
 * Steg4_lab02, Steg4_lab03
 * 
 * @author Christian Löwendahl
 * 2016-07-10
 */

public class RectangleException extends RuntimeException {
	
	private static final long serialVersionUID = 1L; //To keep the compiler happy.

	public RectangleException() {
		super("RectangleException");
	}

	public RectangleException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
}