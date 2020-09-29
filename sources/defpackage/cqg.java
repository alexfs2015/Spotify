package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@cfp
/* renamed from: cqg reason: default package */
final class cqg<T> implements cqi<T> {
    private final Throwable a;
    private final cqk b = new cqk();

    cqg(Throwable th) {
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
