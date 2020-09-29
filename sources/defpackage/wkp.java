package defpackage;

import io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wkp reason: default package */
public final class wkp extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;
    private static final int c = ((a << 1) + 1);

    /* renamed from: wkp$a */
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

    private <T extends Runnable & wki & wkq & wkn> wkp(int i, int i2, long j, TimeUnit timeUnit, DependencyPriorityBlockingQueue<T> dependencyPriorityBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, dependencyPriorityBlockingQueue, threadFactory);
        prestartAllCoreThreads();
    }

    public static wkp a() {
        wkp wkp = new wkp(b, c, 1, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new a(10));
        return wkp;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        wkq wkq = (wkq) runnable;
        wkq.b(true);
        wkq.a(th);
        ((DependencyPriorityBlockingQueue) super.getQueue()).a();
        super.afterExecute(runnable, th);
    }

    public final void execute(Runnable runnable) {
        if (wko.a((Object) runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    public final /* bridge */ /* synthetic */ BlockingQueue getQueue() {
        return (DependencyPriorityBlockingQueue) super.getQueue();
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new wkm(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new wkm(callable);
    }
}
