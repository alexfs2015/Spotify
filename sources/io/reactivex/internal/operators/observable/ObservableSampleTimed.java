package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;
    private TimeUnit c;
    private Scheduler d;
    private boolean e = false;

    static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        SampleTimedEmitLast(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, j, timeUnit, scheduler);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            d();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        public final void run() {
            if (this.wip.incrementAndGet() == 2) {
                d();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, j, timeUnit, scheduler);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            this.downstream.onComplete();
        }

        public final void run() {
            d();
        }
    }

    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final Observer<? super T> downstream;
        final long period;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer = new AtomicReference<>();
        final TimeUnit unit;
        Disposable upstream;

        /* access modifiers changed from: 0000 */
        public abstract void c();

        SampleTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            this.downstream = observer;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                Scheduler scheduler2 = this.scheduler;
                long j = this.period;
                DisposableHelper.c(this.timer, scheduler2.a(this, j, j, this.unit));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            e();
            this.downstream.onError(th);
        }

        public void onComplete() {
            e();
            c();
        }

        private void e() {
            DisposableHelper.a(this.timer);
        }

        public void bf_() {
            e();
            this.upstream.bf_();
        }

        public final boolean b() {
            return this.upstream.b();
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    public ObservableSampleTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
    }

    public final void a(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        if (this.e) {
            ObservableSource observableSource = this.a;
            SampleTimedEmitLast sampleTimedEmitLast = new SampleTimedEmitLast(serializedObserver, this.b, this.c, this.d);
            observableSource.subscribe(sampleTimedEmitLast);
            return;
        }
        ObservableSource observableSource2 = this.a;
        SampleTimedNoLast sampleTimedNoLast = new SampleTimedNoLast(serializedObserver, this.b, this.c, this.d);
        observableSource2.subscribe(sampleTimedNoLast);
    }
}
