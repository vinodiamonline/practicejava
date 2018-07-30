package ExceptionTest;

public class MyException extends Exception {
	String message;
	MyException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.getClass().getName() + " : " + this.message;
	}
}

class MyThrowableException extends Throwable {
	String message;
	MyThrowableException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.getClass().getName() + " : " + this.message;
	}
}
