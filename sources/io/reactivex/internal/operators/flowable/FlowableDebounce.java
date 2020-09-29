package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super T, ? extends xfk<U>> c;

    static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = 6725975399620862591L;
        final Function<? super T, ? extends xfk<U>> debounceSelector;
        final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        boolean done;
        final xfl<? super T> downstream;
        volatile long index;
        xfm upstream;

        static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            private DebounceSubscriber<T, U> a;
            private long b;
            private T c;
            private boolean d;
            private AtomicBoolean e = new AtomicBoolean();

            DebounceInnerSubscriber(DebounceSubscriber<T, U> debounceSubscriber, long j, T t) {
                this.a = debounceSubscriber;
                this.b = j;
                this.c = t;
            }

            public final void b_(U u) {
                if (!this.d) {
                    this.d = true;
                    bd_();
                    d();
                }
            }

            public final void c() {
                if (!this.d) {
                    this.d = true;
                    d();
                }
            }

            /* access modifiers changed from: 0000 */
            public final void d() {
                if (this.e.compareAndSet(false, true)) {
                    this.a.a(this.b, this.c);
                }
            }

            public final void onError(Throwable th) {
                if (this.d) {
                    RxJavaPlugins.a(th);
                    return;
                }
                this.d = true;
                this.a.onError(th);
            }
        }

        DebounceSubscriber(xfl<? super T> xfl, Function<? super T, ? extends xfk<U>> function) {
            this.downstream = xfl;
            this.debounceSelector = function;
        }

        public final void a() {
            this.upstream.a();
            DisposableHelper.a(this.debouncer);
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j, T t) {
            if (j == this.index) {
                if (get() != 0) {
                    this.downstream.b_(t);
                    BackpressureHelper.c(this, 1);
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
                Disposable disposable = (Disposable) this.debouncer.get();
                if (disposable != null) {
                    disposable.bd_();
                }
                try {
                    xfk xfk = (xfk) ObjectHelper.a(this.debounceSelector.apply(t), "The publisher supplied is null");
                    DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j, t);
                    if (this.debouncer.compareAndSet(disposable, debounceInnerSubscriber)) {
                        xfk.b(debounceInnerSubscriber);
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    a();
                    this.downstream.onError(th);
                }
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                Disposable disposable = (Disposable) this.debouncer.get();
                if (!DisposableHelper.a(disposable)) {
                    ((DebounceInnerSubscriber) disposable).d();
                    DisposableHelper.a(this.debouncer);
                    this.downstream.c();
                }
            }
        }

        public final void onError(Throwable th) {
            DisposableHelper.a(this.debouncer);
            this.downstream.onError(th);
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends xfk<U>> function) {
        super(flowable);
        this.c = function;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new DebounceSubscriber<Object>(new SerializedSubscriber(xfl), this.c));
    }
}
