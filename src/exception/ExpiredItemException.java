package exception;

public class ExpiredItemException extends Exception {
    public ExpiredItemException(String message) {
        super(message);
    }
}