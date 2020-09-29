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
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCombineLatest<T, R> extends Observable<R> {
    private ObservableSource<? extends T>[] a;
    private Iterable<? extends ObservableSource<? extends T>> b;
    private Function<? super Object[], ? extends R> c;
    private int d;
    private boolean e = false;

    static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final LatestCoordinator<T, R> parent;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.parent = latestCoordinator;
            this.index = i;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.b(this, disposable);
        }

        public final void onNext(T t) {
            this.parent.a(this.index, t);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            if (r3 == r5.length) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onError(java.lang.Throwable r5) {
            /*
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r4.parent
                int r1 = r4.index
                io.reactivex.internal.util.AtomicThrowable r2 = r0.errors
                boolean r2 = io.reactivex.internal.util.ExceptionHelper.a(r2, r5)
                if (r2 == 0) goto L_0x003a
                boolean r5 = r0.delayError
                r2 = 1
                if (r5 == 0) goto L_0x0030
                monitor-enter(r0)
                java.lang.Object[] r5 = r0.latest     // Catch:{ all -> 0x002d }
                if (r5 != 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0018:
                r1 = r5[r1]     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x001e
                r1 = 1
                goto L_0x001f
            L_0x001e:
                r1 = 0
            L_0x001f:
                if (r1 != 0) goto L_0x0029
                int r3 = r0.complete     // Catch:{ all -> 0x002d }
                int r3 = r3 + r2
                r0.complete = r3     // Catch:{ all -> 0x002d }
                int r5 = r5.length     // Catch:{ all -> 0x002d }
                if (r3 != r5) goto L_0x002b
            L_0x0029:
                r0.done = r2     // Catch:{ all -> 0x002d }
            L_0x002b:
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            L_0x0030:
                r1 = 1
            L_0x0031:
                if (r1 == 0) goto L_0x0036
                r0.c()
            L_0x0036:
                r0.d()
                return
            L_0x003a:
                io.reactivex.plugins.RxJavaPlugins.a(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver.onError(java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            if (r4 == r2.length) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r1 == false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            r0.c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
            r0.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r5.parent
                int r1 = r5.index
                monitor-enter(r0)
                java.lang.Object[] r2 = r0.latest     // Catch:{ all -> 0x0029 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                return
            L_0x000b:
                r1 = r2[r1]     // Catch:{ all -> 0x0029 }
                r3 = 1
                if (r1 != 0) goto L_0x0012
                r1 = 1
                goto L_0x0013
            L_0x0012:
                r1 = 0
            L_0x0013:
                if (r1 != 0) goto L_0x001d
                int r4 = r0.complete     // Catch:{ all -> 0x0029 }
                int r4 = r4 + r3
                r0.complete = r4     // Catch:{ all -> 0x0029 }
                int r2 = r2.length     // Catch:{ all -> 0x0029 }
                if (r4 != r2) goto L_0x001f
            L_0x001d:
                r0.done = r3     // Catch:{ all -> 0x0029 }
            L_0x001f:
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x0025
                r0.c()
            L_0x0025:
                r0.d()
                return
            L_0x0029:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver.onComplete():void");
        }
    }

    static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final CombinerObserver<T, R>[] observers;
        final SpscLinkedArrayQueue<Object[]> queue;

        LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = observer;
            this.combiner = function;
            this.delayError = z;
            this.latest = new Object[i];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new CombinerObserver<>(this, i3);
            }
            this.observers = combinerObserverArr;
            this.queue = new SpscLinkedArrayQueue<>(i2);
        }

        public final void bf_() {
            if (!this.cancelled) {
                this.cancelled = true;
                c();
                if (getAndIncrement() == 0) {
                    a(this.queue);
                }
            }
        }

        public final boolean b() {
            return this.cancelled;
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            for (CombinerObserver<T, R> a : this.observers) {
                DisposableHelper.a((AtomicReference<Disposable>) a);
            }
        }

        private void a(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.latest = null;
            }
            spscLinkedArrayQueue.e();
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.queue;
                Observer<? super R> observer = this.downstream;
                boolean z = this.delayError;
                int i = 1;
                while (!this.cancelled) {
                    if (z || this.errors.get() == null) {
                        boolean z2 = this.done;
                        Object[] objArr = (Object[]) spscLinkedArrayQueue.bc_();
                        boolean z3 = objArr == null;
                        if (z2 && z3) {
                            a(spscLinkedArrayQueue);
                            Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) this.errors);
                            if (a == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(a);
                                return;
                            }
                        } else if (!z3) {
                            try {
                                observer.onNext(ObjectHelper.a(this.combiner.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th);
                                c();
                                a(spscLinkedArrayQueue);
                                observer.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                                return;
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        c();
                        a(spscLinkedArrayQueue);
                        observer.onError(ExceptionHelper.a((AtomicReference<Throwable>) this.errors));
                        return;
                    }
                }
                a(spscLinkedArrayQueue);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.active     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.active = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> r4 = r3.queue     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.a(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.d()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.a(int, java.lang.Object):void");
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.a = observableSourceArr;
        this.b = iterable;
        this.c = function;
        this.d = i;
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
        int i3 = i;
        if (i3 == 0) {
            EmptyDisposable.a(observer);
            return;
        }
        LatestCoordinator latestCoordinator = new LatestCoordinator(observer, this.c, i3, this.d, this.e);
        CombinerObserver<T, R>[] combinerObserverArr = latestCoordinator.observers;
        int length = combinerObserverArr.length;
        latestCoordinator.downstream.onSubscribe(latestCoordinator);
        for (int i4 = 0; i4 < length && !latestCoordinator.done && !latestCoordinator.cancelled; i4++) {
            observableSourceArr[i4].subscribe(combinerObserverArr[i4]);
        }
    }
}
