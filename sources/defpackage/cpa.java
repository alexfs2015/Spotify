package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@cey
/* renamed from: cpa reason: default package */
public abstract class cpa extends AbstractExecutorService implements cpw {
    /* renamed from: a */
    public final cpr<?> submit(Runnable runnable) {
        return (cpr) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> cpr<T> submit(Callable<T> callable) {
        return (cpr) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new cpv(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new cpv(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (cpr) super.submit(runnable, obj);
    }
}
