package l_02_05_2025;

public class IncorrectDataException extends RuntimeException {
    public IncorrectDataException(Throwable cause) {
        super(cause);
    }

    public IncorrectDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectDataException(String message) {
        super(message);
    }

    public IncorrectDataException() {
    }
}
