package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super T, ? extends CompletableSource> c;
    private int d;
    private boolean e;

    static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final wrg<? super T> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends CompletableSource> mapper;
        final int maxConcurrency;
        final CompositeDisposable set = new CompositeDisposable();
        wrh upstream;

        final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerConsumer() {
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }

            public final void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.set.c(this);
                flatMapCompletableMainSubscriber.c();
            }

            public final void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.set.c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            public final void bf_() {
                DisposableHelper.a((AtomicReference<Disposable>) this);
            }

            public final boolean b() {
                return DisposableHelper.a((Disposable) get());
            }
        }

        public final int a(int i) {
            return i & 2;
        }

        public final void a(long j) {
        }

        public final T bc_() {
            return null;
        }

        public final boolean d() {
            return true;
        }

        public final void e() {
        }

        FlatMapCompletableMainSubscriber(wrg<? super T> wrg, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
            this.downstream = wrg;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            lazySet(1);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    wrh.a(Long.MAX_VALUE);
                    return;
                }
                wrh.a((long) i);
            }
        }

        public final void b_(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (!this.cancelled && this.set.a((Disposable) innerConsumer)) {
                    completableSource.a(innerConsumer);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.a();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                RxJavaPlugins.a(th);
            } else if (!this.delayErrors) {
                a();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                }
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.a(1);
            }
        }

        public final void c() {
            if (decrementAndGet() == 0) {
                Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                if (a != null) {
                    this.downstream.onError(a);
                } else {
                    this.downstream.c();
                }
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.a(1);
            }
        }

        public final void a() {
            this.cancelled = true;
            this.upstream.a();
            this.set.bf_();
        }
    }

    public FlowableFlatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        super(flowable);
        this.c = function;
        this.e = z;
        this.d = i;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new FlatMapCompletableMainSubscriber<Object>(wrg, this.c, this.e, this.d));
    }
}
