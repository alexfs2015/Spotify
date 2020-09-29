package rx.exceptions;

public final class UnsubscribeFailedException extends RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    public UnsubscribeFailedException(String str, Throwable th) {
        super(str, th);
    }
}
