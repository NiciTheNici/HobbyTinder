package exceptions;

public class CustomExceptions extends RuntimeException {

	public CustomExceptions(String username) {
		super("Could not find user " + username);
	}
}
