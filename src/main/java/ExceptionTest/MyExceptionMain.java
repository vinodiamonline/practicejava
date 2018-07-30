package ExceptionTest;

public class MyExceptionMain {
	public static void main(String [] args) {
		try {
			throw new MyException("Let there be light...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new MyThrowableException("Let there be shade...");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

	}
}
