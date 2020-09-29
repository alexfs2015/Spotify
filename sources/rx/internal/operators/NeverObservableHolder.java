package rx.internal.operators;

public enum NeverObservableHolder implements a<Object> {
    INSTANCE;
    
    private static wud<Object> b;

    static {
        NeverObservableHolder neverObservableHolder;
        b = wud.b((a<T>) neverObservableHolder);
    }

    public static <T> wud<T> a() {
        return b;
    }
}
