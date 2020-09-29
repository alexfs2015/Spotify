package com.jakewharton.rxrelay2;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishRelay<T> extends foa<T> {
    private static final PublishDisposable[] a = new PublishDisposable[0];
    private final AtomicReference<PublishDisposable<T>[]> b = new AtomicReference<>(a);

    static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final Observer<? super T> actual;
        final PublishRelay<T> parent;

        PublishDisposable(Observer<? super T> observer, PublishRelay<T> publishRelay) {
            this.actual = observer;
            this.parent = publishRelay;
        }

        public final void bf_() {
            if (compareAndSet(false, true)) {
                this.parent.a(this);
            }
        }

        public final boolean b() {
            return get();
        }
    }

    public static <T> PublishRelay<T> a() {
        return new PublishRelay<>();
    }

    private PublishRelay() {
    }

    public final void a(Observer<? super T> observer) {
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        do {
            publishDisposableArr = (PublishDisposable[]) this.b.get();
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[(length + 1)];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.b.compareAndSet(publishDisposableArr, publishDisposableArr2));
        if (publishDisposable.b()) {
            a(publishDisposable);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.b.get();
            if (publishDisposableArr != a) {
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
                        publishDisposableArr2 = a;
                    } else {
                        PublishDisposable[] publishDisposableArr3 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                        System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                        publishDisposableArr2 = publishDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    public final void accept(T t) {
        PublishDisposable[] publishDisposableArr;
        if (t != null) {
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.b.get()) {
                if (!publishDisposable.get()) {
                    publishDisposable.actual.onNext(t);
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }
}
