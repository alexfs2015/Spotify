package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;
    private T c;
    private boolean d;

    static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private long b;
        private T c;
        private boolean d;
        private Disposable e;
        private long f;
        private boolean g;

        ElementAtObserver(Observer<? super T> observer, long j, T t, boolean z) {
            this.a = observer;
            this.b = j;
            this.c = t;
            this.d = z;
        }

        public final boolean b() {
            return this.e.b();
        }

        public final void bd_() {
            this.e.bd_();
        }

        public final void onComplete() {
            if (!this.g) {
                this.g = true;
                T t = this.c;
                if (t != null || !this.d) {
                    if (t != null) {
                        this.a.onNext(t);
                    }
                    this.a.onComplete();
                } else {
                    this.a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.a(th);
                return;
            }
            this.g = true;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.g) {
                long j = this.f;
                if (j == this.b) {
                    this.g = true;
                    this.e.bd_();
                    this.a.onNext(t);
                    this.a.onComplete();
                    return;
                }
                this.f = j + 1;
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.b = j;
        this.c = t;
        this.d = z;
    }

    public final void a(Observer<? super T> observer) {
        ObservableSource observableSource = this.a;
        ElementAtObserver elementAtObserver = new ElementAtObserver(observer, this.b, this.c, this.d);
        observableSource.subscribe(elementAtObserver);
    }
}
