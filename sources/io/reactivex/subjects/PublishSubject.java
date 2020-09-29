package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishSubject<T> extends Subject<T> {
    private static PublishDisposable[] a = new PublishDisposable[0];
    private static PublishDisposable[] b = new PublishDisposable[0];
    private AtomicReference<PublishDisposable<T>[]> c = new AtomicReference<>(b);
    private Throwable d;

    static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final Observer<? super T> downstream;
        final PublishSubject<T> parent;

        PublishDisposable(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.downstream = observer;
            this.parent = publishSubject;
        }

        public final boolean b() {
            return get();
        }

        public final void bd_() {
            if (compareAndSet(false, true)) {
                this.parent.a(this);
            }
        }
    }

    PublishSubject() {
    }

    public static <T> PublishSubject<T> a() {
        return new PublishSubject<>();
    }

    public final void a(Observer<? super T> observer) {
        boolean z;
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        while (true) {
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) this.c.get();
            z = false;
            if (publishDisposableArr != a) {
                int length = publishDisposableArr.length;
                PublishDisposable[] publishDisposableArr2 = new PublishDisposable[(length + 1)];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
                publishDisposableArr2[length] = publishDisposable;
                if (this.c.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.d;
            if (th != null) {
                observer.onError(th);
                return;
            }
            observer.onComplete();
        } else if (publishDisposable.b()) {
            a(publishDisposable);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.c.get();
            if (publishDisposableArr != a && publishDisposableArr != b) {
                int length = publishDisposableArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (publishDisposableArr[i2] == publishDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishDisposableArr2 = b;
                    } else {
                        PublishDisposable[] publishDisposableArr3 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                        System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                        publishDisposableArr2 = publishDisposableArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.c.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    public final void onComplete() {
        PublishDisposable[] publishDisposableArr;
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj != obj2) {
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.c.getAndSet(obj2)) {
                if (!publishDisposable.get()) {
                    publishDisposable.downstream.onComplete();
                }
            }
        }
    }

    public final void onError(Throwable th) {
        PublishDisposable[] publishDisposableArr;
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            RxJavaPlugins.a(th);
            return;
        }
        this.d = th;
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.c.getAndSet(obj2)) {
            if (publishDisposable.get()) {
                RxJavaPlugins.a(th);
            } else {
                publishDisposable.downstream.onError(th);
            }
        }
    }

    public final void onNext(T t) {
        PublishDisposable[] publishDisposableArr;
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.c.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.downstream.onNext(t);
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.c.get() == a) {
            disposable.bd_();
        }
    }
}
