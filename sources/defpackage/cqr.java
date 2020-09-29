package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: cqr reason: default package */
final class cqr extends cpr {
    private final Executor a;

    private cqr(Executor executor) {
        this.a = executor;
    }

    /* synthetic */ cqr(Executor executor, byte b) {
        this(executor);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
