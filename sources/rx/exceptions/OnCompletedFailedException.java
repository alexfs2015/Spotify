package rx.exceptions;

public final class OnCompletedFailedException extends RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(String str, Throwable th) {
        super(str, th);
    }

    public OnCompletedFailedException(Throwable th) {
        super(th);
    }
}
