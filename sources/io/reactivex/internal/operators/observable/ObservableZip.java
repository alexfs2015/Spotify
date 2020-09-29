package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableZip<T, R> extends Observable<R> {
    private ObservableSource<? extends T>[] a;
    private Iterable<? extends ObservableSource<? extends T>> b = null;
    private Function<? super Object[], ? extends R> c;
    private int d;
    private boolean e;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final Observer<? super R> downstream;
        final ZipObserver<T, R>[] observers;
        final T[] row;
        final Function<? super Object[], ? extends R> zipper;

        ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.downstream = observer;
            this.zipper = function;
            this.observers = new ZipObserver[i];
            this.row = (Object[]) new Object[i];
            this.delayError = z;
        }

        private void d() {
            f();
            e();
        }

        private void e() {
            for (ZipObserver<T, R> a : this.observers) {
                a.a();
            }
        }

        private void f() {
            for (ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.a.e();
            }
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            if (!this.cancelled) {
                this.cancelled = true;
                e();
                if (getAndIncrement() == 0) {
                    f();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0067 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r1.observers
                io.reactivex.Observer<? super R> r2 = r1.downstream
                T[] r3 = r1.row
                boolean r4 = r1.delayError
                r5 = 1
                r6 = 1
            L_0x0013:
                int r7 = r0.length
                r9 = 0
                r10 = 0
                r11 = 0
            L_0x0017:
                if (r9 >= r7) goto L_0x0088
                r12 = r0[r9]
                r13 = r3[r11]
                if (r13 != 0) goto L_0x0070
                boolean r13 = r12.b
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r14 = r12.a
                java.lang.Object r14 = r14.ba_()
                if (r14 != 0) goto L_0x002b
                r15 = 1
                goto L_0x002c
            L_0x002b:
                r15 = 0
            L_0x002c:
                boolean r8 = r1.cancelled
                if (r8 == 0) goto L_0x0035
                r16.d()
            L_0x0033:
                r8 = 1
                goto L_0x0065
            L_0x0035:
                if (r13 == 0) goto L_0x0064
                if (r4 == 0) goto L_0x004c
                if (r15 == 0) goto L_0x0064
                java.lang.Throwable r8 = r12.c
                r1.cancelled = r5
                r16.d()
                if (r8 == 0) goto L_0x0048
                r2.onError(r8)
                goto L_0x0033
            L_0x0048:
                r2.onComplete()
                goto L_0x0033
            L_0x004c:
                java.lang.Throwable r8 = r12.c
                if (r8 == 0) goto L_0x0059
                r1.cancelled = r5
                r16.d()
                r2.onError(r8)
                goto L_0x0033
            L_0x0059:
                if (r15 == 0) goto L_0x0064
                r1.cancelled = r5
                r16.d()
                r2.onComplete()
                goto L_0x0033
            L_0x0064:
                r8 = 0
            L_0x0065:
                if (r8 == 0) goto L_0x0068
                return
            L_0x0068:
                if (r15 != 0) goto L_0x006d
                r3[r11] = r14
                goto L_0x0083
            L_0x006d:
                int r10 = r10 + 1
                goto L_0x0083
            L_0x0070:
                boolean r8 = r12.b
                if (r8 == 0) goto L_0x0083
                if (r4 != 0) goto L_0x0083
                java.lang.Throwable r8 = r12.c
                if (r8 == 0) goto L_0x0083
                r1.cancelled = r5
                r16.d()
                r2.onError(r8)
                return
            L_0x0083:
                int r11 = r11 + 1
                int r9 = r9 + 1
                goto L_0x0017
            L_0x0088:
                if (r10 != 0) goto L_0x00ae
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r7 = r1.zipper     // Catch:{ all -> 0x00a3 }
                java.lang.Object r8 = r3.clone()     // Catch:{ all -> 0x00a3 }
                java.lang.Object r7 = r7.apply(r8)     // Catch:{ all -> 0x00a3 }
                java.lang.String r8 = "The zipper returned a null value"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.a(r7, r8)     // Catch:{ all -> 0x00a3 }
                r2.onNext(r7)
                r7 = 0
                java.util.Arrays.fill(r3, r7)
                goto L_0x0013
            L_0x00a3:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.b(r0)
                r16.d()
                r2.onError(r0)
                return
            L_0x00ae:
                int r6 = -r6
                int r6 = r1.addAndGet(r6)
                if (r6 != 0) goto L_0x0013
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator.c():void");
        }
    }

    static final class ZipObserver<T, R> implements Observer<T> {
        final SpscLinkedArrayQueue<T> a;
        volatile boolean b;
        Throwable c;
        private ZipCoordinator<T, R> d;
        private AtomicReference<Disposable> e = new AtomicReference<>();

        ZipObserver(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.d = zipCoordinator;
            this.a = new SpscLinkedArrayQueue<>(i);
        }

        public final void a() {
            DisposableHelper.a(this.e);
        }

        public final void onComplete() {
            this.b = true;
            this.d.c();
        }

        public final void onError(Throwable th) {
            this.c = th;
            this.b = true;
            this.d.c();
        }

        public final void onNext(T t) {
            this.a.a(t);
            this.d.c();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this.e, disposable);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.a = observableSourceArr;
        this.c = function;
        this.d = i;
        this.e = z;
    }

    public final void a(Observer<? super R> observer) {
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            i = 0;
            for (ObservableSource<? extends T> observableSource : this.b) {
                if (i == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[((i >> 2) + i)];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, i);
                    observableSourceArr = observableSourceArr2;
                }
                int i2 = i + 1;
                observableSourceArr[i] = observableSource;
                i = i2;
            }
        } else {
            i = observableSourceArr.length;
        }
        if (i == 0) {
            EmptyDisposable.a(observer);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(observer, this.c, i, this.e);
        int i3 = this.d;
        ZipObserver<T, R>[] zipObserverArr = zipCoordinator.observers;
        int length = zipObserverArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            zipObserverArr[i4] = new ZipObserver<>(zipCoordinator, i3);
        }
        zipCoordinator.lazySet(0);
        zipCoordinator.downstream.onSubscribe(zipCoordinator);
        for (int i5 = 0; i5 < length && !zipCoordinator.cancelled; i5++) {
            observableSourceArr[i5].subscribe(zipObserverArr[i5]);
        }
    }
}
