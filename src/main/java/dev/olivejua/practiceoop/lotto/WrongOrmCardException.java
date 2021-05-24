package dev.olivejua.practiceoop.lotto;

public class WrongOrmCardException extends Exception {

    public WrongOrmCardException(String message) {
        super(message);
    }

    public WrongOrmCardException(String message, Throwable cause) {
        super(message, cause);
    }
}
