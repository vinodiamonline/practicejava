package ExceptionTest;

public class MyException extends Exception {

	private static final long serialVersionUID = -1872119937709207142L;
	String message;
	MyException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.getClass().getName() + " : " + this.message;
	}
}

class MyThrowableException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6199769015424935343L;
	String message;
	MyThrowableException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.getClass().getName() + " : " + this.message;
	}
}
