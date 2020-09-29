package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class Lifecycle {
    private AtomicReference<Object> a = new AtomicReference<>();

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean a(State state) {
            return compareTo(state) >= 0;
        }
    }

    public abstract State a();

    public abstract void a(ll llVar);

    public abstract void b(ll llVar);
}
