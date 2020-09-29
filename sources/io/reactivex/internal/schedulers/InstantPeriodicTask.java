package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

final class InstantPeriodicTask implements Disposable, Callable<Void> {
    private static FutureTask<Void> f = new FutureTask<>(Functions.a, null);
    private Runnable a;
    private AtomicReference<Future<?>> b = new AtomicReference<>();
    private AtomicReference<Future<?>> c = new AtomicReference<>();
    private ExecutorService d;
    private Thread e;

    InstantPeriodicTask(Runnable runnable, ExecutorService executorService) {
        this.a = runnable;
        this.d = executorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Void call() {
        this.e = Thread.currentThread();
        try {
            this.a.run();
            Future submit = this.d.submit(this);
            while (true) {
                Future future = (Future) this.b.get();
                if (future != f) {
                    if (this.b.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.e != Thread.currentThread());
                }
            }
            this.e = null;
        } catch (Throwable th) {
            this.e = null;
            RxJavaPlugins.a(th);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.c.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
        } while (!this.c.compareAndSet(future2, future));
    }

    public final boolean b() {
        return this.c.get() == f;
    }

    public final void bd_() {
        Future future = (Future) this.c.getAndSet(f);
        boolean z = true;
        if (!(future == null || future == f)) {
            future.cancel(this.e != Thread.currentThread());
        }
        Future future2 = (Future) this.b.getAndSet(f);
        if (future2 != null && future2 != f) {
            if (this.e == Thread.currentThread()) {
                z = false;
            }
            future2.cancel(z);
        }
    }
}
