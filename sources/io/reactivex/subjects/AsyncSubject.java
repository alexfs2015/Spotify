package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class AsyncSubject<T> extends Subject<T> {
    public static final AsyncDisposable[] a = new AsyncDisposable[0];
    private static AsyncDisposable[] d = new AsyncDisposable[0];
    public final AtomicReference<AsyncDisposable<T>[]> b = new AtomicReference<>(d);
    public Throwable c;
    private T e;

    static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        AsyncDisposable(Observer<? super T> observer, AsyncSubject<T> asyncSubject) {
            super(observer);
            this.parent = asyncSubject;
        }

        /* access modifiers changed from: 0000 */
        public final void b(Throwable th) {
            if (b()) {
                RxJavaPlugins.a(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public final void bd_() {
            if (getAndSet(4) != 4) {
                this.parent.a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            if (!b()) {
                this.downstream.onComplete();
            }
        }
    }

    AsyncSubject() {
    }

    public static <T> AsyncSubject<T> a() {
        return new AsyncSubject<>();
    }

    public final void a(Observer<? super T> observer) {
        boolean z;
        AsyncDisposable asyncDisposable = new AsyncDisposable(observer, this);
        observer.onSubscribe(asyncDisposable);
        while (true) {
            AsyncDisposable[] asyncDisposableArr = (AsyncDisposable[]) this.b.get();
            z = false;
            if (asyncDisposableArr != a) {
                int length = asyncDisposableArr.length;
                AsyncDisposable[] asyncDisposableArr2 = new AsyncDisposable[(length + 1)];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
                asyncDisposableArr2[length] = asyncDisposable;
                if (this.b.compareAndSet(asyncDisposableArr, asyncDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.c;
            if (th != null) {
                observer.onError(th);
                return;
            }
            T t = this.e;
            if (t != null) {
                asyncDisposable.b(t);
                return;
            }
            asyncDisposable.g();
        } else if (asyncDisposable.b()) {
            a(asyncDisposable);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = (AsyncDisposable[]) this.b.get();
            int length = asyncDisposableArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (asyncDisposableArr[i2] == asyncDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        asyncDisposableArr2 = d;
                    } else {
                        AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[(length - 1)];
                        System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                        System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                        asyncDisposableArr2 = asyncDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
    }

    public final void onComplete() {
        Object obj = this.b.get();
        Object obj2 = a;
        if (obj != obj2) {
            T t = this.e;
            AsyncDisposable[] asyncDisposableArr = (AsyncDisposable[]) this.b.getAndSet(obj2);
            int i = 0;
            if (t == null) {
                int length = asyncDisposableArr.length;
                while (i < length) {
                    asyncDisposableArr[i].g();
                    i++;
                }
                return;
            }
            int length2 = asyncDisposableArr.length;
            while (i < length2) {
                asyncDisposableArr[i].b(t);
                i++;
            }
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.b.get();
        Object obj2 = a;
        if (obj == obj2) {
            RxJavaPlugins.a(th);
            return;
        }
        this.e = null;
        this.c = th;
        for (AsyncDisposable b2 : (AsyncDisposable[]) this.b.getAndSet(obj2)) {
            b2.b(th);
        }
    }

    public final void onNext(T t) {
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.b.get() != a) {
            this.e = t;
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.b.get() == a) {
            disposable.bd_();
        }
    }
}
