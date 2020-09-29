package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCreate<T> extends Observable<T> {
    private ObservableOnSubscribe<T> a;

    static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        final Observer<? super T> observer;

        CreateEmitter(Observer<? super T> observer2) {
            this.observer = observer2;
        }

        public final void a(Disposable disposable) {
            DisposableHelper.a((AtomicReference<Disposable>) this, disposable);
        }

        public final void a(Cancellable cancellable) {
            DisposableHelper.a((AtomicReference<Disposable>) this, (Disposable) new CancellableDisposable(cancellable));
        }

        public final void a(T t) {
            if (t == null) {
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!b()) {
                this.observer.onNext(t);
            }
        }

        public final void a(Throwable th) {
            if (!b(th)) {
                RxJavaPlugins.a(th);
            }
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        /* JADX INFO: finally extract failed */
        public final boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (b()) {
                return false;
            }
            try {
                this.observer.onError(th);
                bd_();
                return true;
            } catch (Throwable th2) {
                bd_();
                throw th2;
            }
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void c() {
            if (!b()) {
                try {
                    this.observer.onComplete();
                } finally {
                    bd_();
                }
            }
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public ObservableCreate(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.a = observableOnSubscribe;
    }

    public final void a(Observer<? super T> observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            this.a.subscribe(createEmitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            createEmitter.a(th);
        }
    }
}
