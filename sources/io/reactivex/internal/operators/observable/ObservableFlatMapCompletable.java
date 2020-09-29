package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapCompletable<T> extends AbstractObservableWithUpstream<T, T> {
    private Function<? super T, ? extends CompletableSource> b;
    private boolean c;

    static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends CompletableSource> mapper;
        final CompositeDisposable set = new CompositeDisposable();
        Disposable upstream;

        final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }

            public final void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.c(this);
                flatMapCompletableMainObserver.onComplete();
            }

            public final void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.c(this);
                flatMapCompletableMainObserver.onError(th);
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

        public final T bc_() {
            return null;
        }

        public final boolean d() {
            return true;
        }

        public final void e() {
        }

        FlatMapCompletableMainObserver(Observer<? super T> observer, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
            lazySet(1);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.disposed && this.set.a((Disposable) innerObserver)) {
                    completableSource.a(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.bf_();
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
            }
        }

        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                if (a != null) {
                    this.downstream.onError(a);
                    return;
                }
                this.downstream.onComplete();
            }
        }

        public final void bf_() {
            this.disposed = true;
            this.upstream.bf_();
            this.set.bf_();
        }

        public final boolean b() {
            return this.upstream.b();
        }
    }

    public ObservableFlatMapCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z) {
        super(observableSource);
        this.b = function;
        this.c = z;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new FlatMapCompletableMainObserver(observer, this.b, this.c));
    }
}
