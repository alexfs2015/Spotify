package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@cfp
/* renamed from: cqh reason: default package */
final class cqh<T> implements cqi<T> {
    private final T a;
    private final cqk b = new cqk();

    cqh(T t) {
        this.a = t;
        this.b.a();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
