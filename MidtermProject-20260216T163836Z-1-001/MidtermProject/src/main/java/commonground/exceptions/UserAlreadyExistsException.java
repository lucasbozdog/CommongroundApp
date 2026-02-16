package commonground.exceptions;

@SuppressWarnings("unused")
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
