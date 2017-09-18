package cz.datalite.ares.business;

/**
 * Ares exception
 */
public class AresException extends Exception {

	private static final long serialVersionUID = 1L;

	private String aresMessage;

	public AresException() {
		super();
	}
	
	public AresException(String message) {
		super(message);
	}

	public AresException(String message, String aresMessage) {
		super(message);
		this.aresMessage = aresMessage;
	}
	
	public AresException(Throwable cause) {
		super(cause);
	}
	
	public AresException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getAresMessage() {
		return aresMessage;
	}

	public void setAresMessage(String aresMessage) {
		this.aresMessage = aresMessage;
	}
}
