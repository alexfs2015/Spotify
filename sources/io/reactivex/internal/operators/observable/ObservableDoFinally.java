package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableDoFinally<T> extends AbstractObservableWithUpstream<T, T> {
    private Action b;

    static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final Observer<? super T> downstream;
        final Action onFinally;
        QueueDisposable<T> qd;
        boolean syncFused;
        Disposable upstream;

        DoFinallyObserver(Observer<? super T> observer, Action action) {
            this.downstream = observer;
            this.onFinally = action;
        }

        private void f() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.a(th);
                }
            }
        }

        public final int a(int i) {
            QueueDisposable<T> queueDisposable = this.qd;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int a = queueDisposable.a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return a;
        }

        public final boolean b() {
            return this.upstream.b();
        }

        public final T ba_() {
            T ba_ = this.qd.ba_();
            if (ba_ == null && this.syncFused) {
                f();
            }
            return ba_;
        }

        public final void bd_() {
            this.upstream.bd_();
            f();
        }

        public final boolean d() {
            return this.qd.d();
        }

        public final void e() {
            this.qd.e();
        }

        public final void onComplete() {
            this.downstream.onComplete();
            f();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            f();
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.qd = (QueueDisposable) disposable;
                }
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableDoFinally(ObservableSource<T> observableSource, Action action) {
        super(observableSource);
        this.b = action;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new DoFinallyObserver(observer, this.b));
    }
}
