package cz.datalite.ares.business;

/**
 * Ares exception
 */
public class AresException extends Exception {

	private static final long serialVersionUID = 1L;

	public AresException() {
		super();
	}
	
	public AresException(String message) {
		super(message);
	}
	
	public AresException(Throwable cause) {
		super(cause);
	}
	
	public AresException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
