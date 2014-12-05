package automata;

public class AutomataException extends Exception {

	private static final long serialVersionUID = 1L;

	public AutomataException() {
		super();
	}

	public AutomataException(String message) {
		super(message);
	}

	public AutomataException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutomataException(Throwable cause) {
		super(cause);
	}
}
