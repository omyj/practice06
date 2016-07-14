package prob4;

public class MyStackEmptyException extends Exception {
	public MyStackEmptyException() {
		super( "MyStack is Empty" );
	}
	
	public MyStackEmptyException( String message ) {
		super( message );
	}
	
}
