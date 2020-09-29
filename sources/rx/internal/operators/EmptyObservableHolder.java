package rx.internal.operators;

public enum EmptyObservableHolder implements a<Object> {
    INSTANCE;
    
    private static wud<Object> b;

    static {
        EmptyObservableHolder emptyObservableHolder;
        b = wud.b((a<T>) emptyObservableHolder);
    }

    public static <T> wud<T> a() {
        return b;
    }
}
