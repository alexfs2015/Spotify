package io.reactivex.subjects;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class UnicastSubject<T> extends Subject<T> {
    final SpscLinkedArrayQueue<T> a;
    final AtomicReference<Observer<? super T>> b = new AtomicReference<>();
    volatile boolean c;
    final BasicIntQueueDisposable<T> d = new UnicastQueueDisposable();
    boolean e;
    private AtomicReference<Runnable> f = new AtomicReference<>();
    private boolean g = true;
    private volatile boolean h;
    private Throwable i;
    private AtomicBoolean j = new AtomicBoolean();

    final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.e = true;
            return 2;
        }

        public final T bc_() {
            return UnicastSubject.this.a.bc_();
        }

        public final boolean d() {
            return UnicastSubject.this.a.d();
        }

        public final void e() {
            UnicastSubject.this.a.e();
        }

        public final void bf_() {
            if (!UnicastSubject.this.c) {
                UnicastSubject unicastSubject = UnicastSubject.this;
                unicastSubject.c = true;
                unicastSubject.j();
                UnicastSubject.this.b.lazySet(null);
                if (UnicastSubject.this.d.getAndIncrement() == 0) {
                    UnicastSubject.this.b.lazySet(null);
                    UnicastSubject.this.a.e();
                }
            }
        }

        public final boolean b() {
            return UnicastSubject.this.c;
        }
    }

    public static <T> UnicastSubject<T> a() {
        return new UnicastSubject<>(Flowable.a(), true);
    }

    private UnicastSubject(int i2, boolean z) {
        this.a = new SpscLinkedArrayQueue<>(ObjectHelper.a(i2, "capacityHint"));
    }

    public final void a(Observer<? super T> observer) {
        if (this.j.get() || !this.j.compareAndSet(false, true)) {
            EmptyDisposable.a((Throwable) new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.onSubscribe(this.d);
        this.b.lazySet(observer);
        if (this.c) {
            this.b.lazySet(null);
        } else {
            k();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        Runnable runnable = (Runnable) this.f.get();
        if (runnable != null && this.f.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.h || this.c) {
            disposable.bf_();
        }
    }

    public final void onNext(T t) {
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.h && !this.c) {
            this.a.a(t);
            k();
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h || this.c) {
            RxJavaPlugins.a(th);
            return;
        }
        this.i = th;
        this.h = true;
        j();
        k();
    }

    public final void onComplete() {
        if (!this.h && !this.c) {
            this.h = true;
            j();
            k();
        }
    }

    private void b(Observer<? super T> observer) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.a;
        boolean z = !this.g;
        boolean z2 = true;
        int i2 = 1;
        while (!this.c) {
            boolean z3 = this.h;
            Object bc_ = this.a.bc_();
            boolean z4 = bc_ == null;
            if (z3) {
                if (z && z2) {
                    if (!a(spscLinkedArrayQueue, observer)) {
                        z2 = false;
                    } else {
                        return;
                    }
                }
                if (z4) {
                    d(observer);
                    return;
                }
            }
            if (!z4) {
                observer.onNext(bc_);
            } else {
                i2 = this.d.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
        this.b.lazySet(null);
        spscLinkedArrayQueue.e();
    }

    private void c(Observer<? super T> observer) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.a;
        int i2 = 1;
        boolean z = !this.g;
        while (!this.c) {
            boolean z2 = this.h;
            if (!z || !z2 || !a(spscLinkedArrayQueue, observer)) {
                observer.onNext(null);
                if (z2) {
                    d(observer);
                    return;
                }
                i2 = this.d.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.b.lazySet(null);
        spscLinkedArrayQueue.e();
    }

    private void d(Observer<? super T> observer) {
        this.b.lazySet(null);
        Throwable th = this.i;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    private boolean a(SimpleQueue<T> simpleQueue, Observer<? super T> observer) {
        Throwable th = this.i;
        if (th == null) {
            return false;
        }
        this.b.lazySet(null);
        simpleQueue.e();
        observer.onError(th);
        return true;
    }

    private void k() {
        if (this.d.getAndIncrement() == 0) {
            Observer observer = (Observer) this.b.get();
            int i2 = 1;
            while (observer == null) {
                i2 = this.d.addAndGet(-i2);
                if (i2 != 0) {
                    observer = (Observer) this.b.get();
                } else {
                    return;
                }
            }
            if (this.e) {
                c(observer);
            } else {
                b(observer);
            }
        }
    }
}
