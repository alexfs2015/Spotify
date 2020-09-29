package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.SerializedSubject;
import io.reactivex.subjects.Subject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableRetryWhen<T> extends AbstractObservableWithUpstream<T, T> {
    private Function<? super Observable<Throwable>, ? extends ObservableSource<?>> b;

    static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final Observer<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final InnerRepeatObserver inner = new InnerRepeatObserver<>();
        final Subject<Throwable> signaller;
        final ObservableSource<T> source;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            InnerRepeatObserver() {
            }

            public final void onComplete() {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.a(repeatWhenObserver.upstream);
                HalfSerializer.a(repeatWhenObserver.downstream, (AtomicInteger) repeatWhenObserver, repeatWhenObserver.error);
            }

            public final void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.a(repeatWhenObserver.upstream);
                HalfSerializer.a(repeatWhenObserver.downstream, th, (AtomicInteger) repeatWhenObserver, repeatWhenObserver.error);
            }

            public final void onNext(Object obj) {
                RepeatWhenObserver.this.c();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.b(this, disposable);
            }
        }

        RepeatWhenObserver(Observer<? super T> observer, Subject<Throwable> subject, ObservableSource<T> observableSource) {
            this.downstream = observer;
            this.signaller = subject;
            this.source = observableSource;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) this.upstream.get());
        }

        public final void bd_() {
            DisposableHelper.a(this.upstream);
            DisposableHelper.a((AtomicReference<Disposable>) this.inner);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (this.wip.getAndIncrement() == 0) {
                while (!b()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void onComplete() {
            DisposableHelper.a((AtomicReference<Disposable>) this.inner);
            HalfSerializer.a(this.downstream, (AtomicInteger) this, this.error);
        }

        public final void onError(Throwable th) {
            DisposableHelper.c(this.upstream, null);
            this.active = false;
            this.signaller.onNext(th);
        }

        public final void onNext(T t) {
            HalfSerializer.a(this.downstream, t, (AtomicInteger) this, this.error);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.upstream, disposable);
        }
    }

    public ObservableRetryWhen(ObservableSource<T> observableSource, Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.b = function;
    }

    public final void a(Observer<? super T> observer) {
        SerializedSubject serializedSubject = new SerializedSubject(PublishSubject.a());
        try {
            ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.b.apply(serializedSubject), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(observer, serializedSubject, this.a);
            observer.onSubscribe(repeatWhenObserver);
            observableSource.subscribe(repeatWhenObserver.inner);
            repeatWhenObserver.c();
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, observer);
        }
    }
}
