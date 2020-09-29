package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable {
    protected static final FutureTask<Void> a = new FutureTask<>(Functions.a, null);
    private static FutureTask<Void> b = new FutureTask<>(Functions.a, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    AbstractDirectTask(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void bf_() {
        Future future = (Future) get();
        if (future != a) {
            FutureTask<Void> futureTask = b;
            if (future != futureTask && compareAndSet(future, futureTask) && future != null) {
                future.cancel(this.runner != Thread.currentThread());
            }
        }
    }

    public final boolean b() {
        Future future = (Future) get();
        return future == a || future == b;
    }

    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == a) {
                break;
            } else if (future2 == b) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
