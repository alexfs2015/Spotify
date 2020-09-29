package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
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
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {
    private Flowable<T> a;
    private Function<? super T, ? extends CompletableSource> b;
    private int c;
    private boolean d;

    static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final CompletableObserver downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends CompletableSource> mapper;
        final int maxConcurrency;
        final CompositeDisposable set = new CompositeDisposable();
        wrh upstream;

        final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
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

        FlatMapCompletableMainSubscriber(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
            this.downstream = completableObserver;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            lazySet(1);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.onSubscribe(this);
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
                InnerObserver innerObserver = new InnerObserver();
                if (!this.disposed && this.set.a((Disposable) innerObserver)) {
                    completableSource.a(innerObserver);
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
                bf_();
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
                    this.downstream.onComplete();
                }
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.a(1);
            }
        }

        public final void bf_() {
            this.disposed = true;
            this.upstream.a();
            this.set.bf_();
        }

        public final boolean b() {
            return this.set.b();
        }
    }

    public FlowableFlatMapCompletableCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        this.a = flowable;
        this.b = function;
        this.d = z;
        this.c = i;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.a((FlowableSubscriber<? super T>) new FlatMapCompletableMainSubscriber<Object>(completableObserver, this.b, this.d, this.c));
    }

    public final Flowable<T> be_() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableFlatMapCompletable<T>(this.a, this.b, this.d, this.c));
    }
}
