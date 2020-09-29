package rx;

public interface Emitter<T> extends wue<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    void a(wuk wuk);

    void a(wur wur);
}
