package rx.internal.operators;

public enum EmptyObservableHolder implements a<Object> {
    INSTANCE;
    
    private static xii<Object> b;

    static {
        EmptyObservableHolder emptyObservableHolder;
        b = xii.b((a<T>) emptyObservableHolder);
    }

    public static <T> xii<T> a() {
        return b;
    }
}
