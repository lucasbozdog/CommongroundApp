package commonground.exceptions;

@SuppressWarnings("unused")
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
