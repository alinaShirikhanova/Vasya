package l_02_05_2025;

public class IncorrectDataException extends RuntimeException {
    public IncorrectDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
