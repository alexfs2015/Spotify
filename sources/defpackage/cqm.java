package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@cfp
/* renamed from: cqm reason: default package */
final class cqm<V> extends FutureTask<V> implements cqi<V> {
    private final cqk a = new cqk();

    cqm(Runnable runnable, V v) {
        super(runnable, v);
    }

    cqm(Callable<V> callable) {
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
