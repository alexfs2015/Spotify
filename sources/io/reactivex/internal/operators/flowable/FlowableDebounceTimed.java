package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableDebounceTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;
    private TimeUnit d;
    private Scheduler e;

    static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final DebounceTimedSubscriber<T> parent;
        final T value;

        DebounceEmitter(T t, long j, DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.value = t;
            this.idx = j;
            this.parent = debounceTimedSubscriber;
        }

        public final boolean b() {
            return get() == DisposableHelper.DISPOSED;
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.a(this.idx, this.value, this);
            }
        }

        public final void run() {
            c();
        }
    }

    static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final xfl<? super T> downstream;
        volatile long index;
        final long timeout;
        Disposable timer;
        final TimeUnit unit;
        xfm upstream;
        final Worker worker;

        DebounceTimedSubscriber(xfl<? super T> xfl, long j, TimeUnit timeUnit, Worker worker2) {
            this.downstream = xfl;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
        }

        public final void a() {
            this.upstream.a();
            this.worker.bd_();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j, T t, DebounceEmitter<T> debounceEmitter) {
            if (j == this.index) {
                if (get() != 0) {
                    this.downstream.b_(t);
                    BackpressureHelper.c(this, 1);
                    debounceEmitter.bd_();
                    return;
                }
                a();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                long j = this.index + 1;
                this.index = j;
                Disposable disposable = this.timer;
                if (disposable != null) {
                    disposable.bd_();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.timer = debounceEmitter;
                DisposableHelper.c(debounceEmitter, this.worker.a(debounceEmitter, this.timeout, this.unit));
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                Disposable disposable = this.timer;
                if (disposable != null) {
                    disposable.bd_();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
                if (debounceEmitter != null) {
                    debounceEmitter.c();
                }
                this.downstream.c();
                this.worker.bd_();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.bd_();
            }
            this.downstream.onError(th);
            this.worker.bd_();
        }
    }

    public FlowableDebounceTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.c = j;
        this.d = timeUnit;
        this.e = scheduler;
    }

    public final void a(xfl<? super T> xfl) {
        Flowable flowable = this.b;
        DebounceTimedSubscriber debounceTimedSubscriber = new DebounceTimedSubscriber(new SerializedSubscriber(xfl), this.c, this.d, this.e.a());
        flowable.a((FlowableSubscriber<? super T>) debounceTimedSubscriber);
    }
}
