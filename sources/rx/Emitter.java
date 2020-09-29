package rx;

public interface Emitter<T> extends xij<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    void a(xip xip);

    void a(xiw xiw);
}
