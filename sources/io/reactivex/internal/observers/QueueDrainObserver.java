package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.ObservableQueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;

public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {
    protected final Observer<? super V> a;
    protected final SimplePlainQueue<U> b;
    protected volatile boolean c;
    protected volatile boolean d;

    public void a(Observer<? super V> observer, U u) {
    }

    public final Throwable f() {
        return null;
    }

    public QueueDrainObserver(Observer<? super V> observer, SimplePlainQueue<U> simplePlainQueue) {
        this.a = observer;
        this.b = simplePlainQueue;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e.getAndIncrement() == 0;
    }

    /* access modifiers changed from: protected */
    public final void a(U u, boolean z, Disposable disposable) {
        Observer<? super V> observer = this.a;
        SimplePlainQueue<U> simplePlainQueue = this.b;
        if (this.e.get() != 0 || !this.e.compareAndSet(0, 1)) {
            simplePlainQueue.a(u);
            if (!e()) {
                return;
            }
        } else {
            a(observer, u);
            if (a(-1) == 0) {
                return;
            }
        }
        QueueDrainHelper.a(simplePlainQueue, observer, false, disposable, (ObservableQueueDrain<T, U>) this);
    }

    public final void b(U u, boolean z, Disposable disposable) {
        Observer<? super V> observer = this.a;
        SimplePlainQueue<U> simplePlainQueue = this.b;
        if (this.e.get() != 0 || !this.e.compareAndSet(0, 1)) {
            simplePlainQueue.a(u);
            if (!e()) {
                return;
            }
        } else if (simplePlainQueue.d()) {
            a(observer, u);
            if (a(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.a(u);
        }
        QueueDrainHelper.a(simplePlainQueue, observer, z, disposable, (ObservableQueueDrain<T, U>) this);
    }

    public final int a(int i) {
        return this.e.addAndGet(i);
    }
}
