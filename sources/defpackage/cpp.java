package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@cey
/* renamed from: cpp reason: default package */
final class cpp<T> implements cpr<T> {
    private final Throwable a;
    private final cpt b = new cpt();

    cpp(Throwable th) {
        this.a = th;
        this.b.a();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        throw new ExecutionException(this.a);
    }

    public final T get(long j, TimeUnit timeUnit) {
        throw new ExecutionException(this.a);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
