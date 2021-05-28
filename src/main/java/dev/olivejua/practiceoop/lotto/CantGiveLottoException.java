package dev.olivejua.practiceoop.lotto;

public class CantGiveLottoException extends Exception {

    public CantGiveLottoException() {
    }

    public CantGiveLottoException(String message) {
        super(message);
    }

    public CantGiveLottoException(String message, Throwable cause) {
        super(message, cause);
    }
}
