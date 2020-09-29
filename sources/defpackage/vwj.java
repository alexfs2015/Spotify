package defpackage;

import io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: vwj reason: default package */
public final class vwj extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;
    private static final int c = ((a << 1) + 1);

    /* renamed from: vwj$a */
    public static final class a implements ThreadFactory {
        private final int a = 10;

        public a(int i) {
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        b = availableProcessors + 1;
    }

    private <T extends Runnable & vwc & vwk & vwh> vwj(int i, int i2, long j, TimeUnit timeUnit, DependencyPriorityBlockingQueue<T> dependencyPriorityBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, dependencyPriorityBlockingQueue, threadFactory);
        prestartAllCoreThreads();
    }

    public static vwj a() {
        vwj vwj = new vwj(b, c, 1, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new a(10));
        return vwj;
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new vwg(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new vwg(callable);
    }

    public final void execute(Runnable runnable) {
        if (vwi.a((Object) runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        vwk vwk = (vwk) runnable;
        vwk.b(true);
        vwk.a(th);
        ((DependencyPriorityBlockingQueue) super.getQueue()).a();
        super.afterExecute(runnable, th);
    }

    public final /* bridge */ /* synthetic */ BlockingQueue getQueue() {
        return (DependencyPriorityBlockingQueue) super.getQueue();
    }
}
