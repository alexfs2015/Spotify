package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {
    private static CacheDisposable[] a = new CacheDisposable[0];
    private static CacheDisposable[] b = new CacheDisposable[0];
    private SingleSource<? extends T> c;
    private AtomicInteger d = new AtomicInteger();
    private AtomicReference<CacheDisposable<T>[]> e = new AtomicReference<>(a);
    private T f;
    private Throwable g;

    static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 7514387411091976596L;
        final SingleObserver<? super T> downstream;
        final SingleCache<T> parent;

        CacheDisposable(SingleObserver<? super T> singleObserver, SingleCache<T> singleCache) {
            this.downstream = singleObserver;
            this.parent = singleCache;
        }

        public final boolean b() {
            return get();
        }

        public final void bf_() {
            if (compareAndSet(false, true)) {
                this.parent.a(this);
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
    }

    public SingleCache(SingleSource<? extends T> singleSource) {
        this.c = singleSource;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        boolean z;
        CacheDisposable cacheDisposable = new CacheDisposable(singleObserver, this);
        singleObserver.onSubscribe(cacheDisposable);
        while (true) {
            CacheDisposable[] cacheDisposableArr = (CacheDisposable[]) this.e.get();
            z = false;
            if (cacheDisposableArr != b) {
                int length = cacheDisposableArr.length;
                CacheDisposable[] cacheDisposableArr2 = new CacheDisposable[(length + 1)];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
                cacheDisposableArr2[length] = cacheDisposable;
                if (this.e.compareAndSet(cacheDisposableArr, cacheDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            if (cacheDisposable.b()) {
                a(cacheDisposable);
            }
            if (this.d.getAndIncrement() == 0) {
                this.c.b(this);
            }
            return;
        }
        Throwable th = this.g;
        if (th != null) {
            singleObserver.onError(th);
        } else {
            singleObserver.c_(this.f);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.e.get();
            int length = cacheDisposableArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (cacheDisposableArr[i2] == cacheDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        cacheDisposableArr2 = a;
                    } else {
                        CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[(length - 1)];
                        System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                        System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                        cacheDisposableArr2 = cacheDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.e.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    public final void c_(T t) {
        CacheDisposable[] cacheDisposableArr;
        this.f = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.e.getAndSet(b)) {
            if (!cacheDisposable.b()) {
                cacheDisposable.downstream.c_(t);
            }
        }
    }

    public final void onError(Throwable th) {
        CacheDisposable[] cacheDisposableArr;
        this.g = th;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.e.getAndSet(b)) {
            if (!cacheDisposable.b()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }
}
