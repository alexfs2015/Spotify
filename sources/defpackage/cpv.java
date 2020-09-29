package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@cey
/* renamed from: cpv reason: default package */
final class cpv<V> extends FutureTask<V> implements cpr<V> {
    private final cpt a = new cpt();

    cpv(Runnable runnable, V v) {
        super(runnable, v);
    }

    cpv(Callable<V> callable) {
        super(callable);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.a.a();
    }
}
