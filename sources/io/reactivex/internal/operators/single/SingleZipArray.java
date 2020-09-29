package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleZipArray<T, R> extends Single<R> {
    final Function<? super Object[], ? extends R> a;
    private SingleSource<? extends T>[] b;

    final class SingletonArrayFunc implements Function<T, R> {
        SingletonArrayFunc() {
        }

        public final R apply(T t) {
            return ObjectHelper.a(SingleZipArray.this.a.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final SingleObserver<? super R> downstream;
        final ZipSingleObserver<T>[] observers;
        final Object[] values;
        final Function<? super Object[], ? extends R> zipper;

        ZipCoordinator(SingleObserver<? super R> singleObserver, int i, Function<? super Object[], ? extends R> function) {
            super(i);
            this.downstream = singleObserver;
            this.zipper = function;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver<>(this, i2);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i];
        }

        public final boolean b() {
            return get() <= 0;
        }

        public final void bf_() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> a : this.observers) {
                    DisposableHelper.a((AtomicReference<Disposable>) a);
                }
            }
        }

        private void a(int i) {
            ZipSingleObserver<T>[] zipSingleObserverArr = this.observers;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                DisposableHelper.a((AtomicReference<Disposable>) zipSingleObserverArr[i2]);
            }
            while (true) {
                i++;
                if (i < length) {
                    DisposableHelper.a((AtomicReference<Disposable>) zipSingleObserverArr[i]);
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                a(i);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void c_(T t) {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            zipCoordinator.values[this.index] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    zipCoordinator.downstream.c_(ObjectHelper.a(zipCoordinator.zipper.apply(zipCoordinator.values), "The zipper returned a null value"));
                } catch (Throwable th) {
                    Exceptions.b(th);
                    zipCoordinator.downstream.onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            this.parent.a(th, this.index);
        }
    }

    public SingleZipArray(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.b = singleSourceArr;
        this.a = function;
    }

    public final void a(SingleObserver<? super R> singleObserver) {
        SingleSource<? extends T>[] singleSourceArr = this.b;
        int length = singleSourceArr.length;
        int i = 0;
        if (length == 1) {
            singleSourceArr[0].b(new MapSingleObserver(singleObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.a);
        singleObserver.onSubscribe(zipCoordinator);
        while (i < length && !zipCoordinator.b()) {
            SingleSource<? extends T> singleSource = singleSourceArr[i];
            if (singleSource == null) {
                zipCoordinator.a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                singleSource.b(zipCoordinator.observers[i]);
                i++;
            }
        }
    }
}
