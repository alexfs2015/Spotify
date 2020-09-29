package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@cfp
/* renamed from: cpr reason: default package */
public abstract class cpr extends AbstractExecutorService implements cqn {
    /* renamed from: a */
    public final cqi<?> submit(Runnable runnable) {
        return (cqi) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> cqi<T> submit(Callable<T> callable) {
        return (cqi) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new cqm(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new cqm(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (cqi) super.submit(runnable, obj);
    }
}
