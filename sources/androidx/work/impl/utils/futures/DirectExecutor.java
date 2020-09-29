package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

public enum DirectExecutor implements Executor {
    INSTANCE;

    public final String toString() {
        return "DirectExecutor";
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
