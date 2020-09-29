package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {
    private Function<? super T, ? extends ObservableSource<? extends R>> b;
    private int c;
    private boolean d = false;

    static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final SwitchMapObserver<T, R> parent;
        volatile SimpleQueue<R> queue;

        SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j, int i) {
            this.parent = switchMapObserver;
            this.index = j;
            this.bufferSize = i;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int a = queueDisposable.a(7);
                    if (a == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.parent.c();
                        return;
                    } else if (a == 2) {
                        this.queue = queueDisposable;
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
            }
        }

        public final void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.a(r);
                }
                this.parent.c();
            }
        }

        public final void onError(Throwable th) {
            SwitchMapObserver<T, R> switchMapObserver = this.parent;
            if (this.index != switchMapObserver.unique || !ExceptionHelper.a((AtomicReference<Throwable>) switchMapObserver.errors, th)) {
                RxJavaPlugins.a(th);
                return;
            }
            if (!switchMapObserver.delayErrors) {
                switchMapObserver.upstream.bf_();
            }
            this.done = true;
            switchMapObserver.c();
        }

        public final void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.c();
            }
        }
    }

    static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static SwitchMapInnerObserver<Object, Object> a = null;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        volatile long unique;
        Disposable upstream;

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1, 1);
            a = switchMapInnerObserver;
            DisposableHelper.a((AtomicReference<Disposable>) switchMapInnerObserver);
        }

        SwitchMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
            this.errors = new AtomicThrowable();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.active.get();
            if (switchMapInnerObserver != null) {
                DisposableHelper.a((AtomicReference<Disposable>) switchMapInnerObserver);
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.a(this.mapper.apply(t), "The ObservableSource returned is null");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this, j, this.bufferSize);
                while (true) {
                    SwitchMapInnerObserver<Object, Object> switchMapInnerObserver3 = (SwitchMapInnerObserver) this.active.get();
                    if (switchMapInnerObserver3 != a) {
                        if (this.active.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2)) {
                            observableSource.subscribe(switchMapInnerObserver2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.upstream.bf_();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (this.done || !ExceptionHelper.a((AtomicReference<Throwable>) this.errors, th)) {
                RxJavaPlugins.a(th);
                return;
            }
            if (!this.delayErrors) {
                d();
            }
            this.done = true;
            c();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                c();
            }
        }

        public final void bf_() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.bf_();
                d();
            }
        }

        public final boolean b() {
            return this.cancelled;
        }

        private void d() {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = (SwitchMapInnerObserver) this.active.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver2 = a;
            if (switchMapInnerObserver != switchMapInnerObserver2) {
                SwitchMapInnerObserver<Object, Object> switchMapInnerObserver3 = (SwitchMapInnerObserver) this.active.getAndSet(switchMapInnerObserver2);
                if (switchMapInnerObserver3 != a && switchMapInnerObserver3 != null) {
                    DisposableHelper.a((AtomicReference<Disposable>) switchMapInnerObserver3);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x000f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                io.reactivex.Observer<? super R> r0 = r13.downstream
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r1 = r13.active
                boolean r2 = r13.delayErrors
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.cancelled
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.done
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                return
            L_0x0034:
                r0.onComplete()
                return
            L_0x0038:
                io.reactivex.internal.util.AtomicThrowable r7 = r13.errors
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.a(r1)
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r5 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r5
                if (r5 == 0) goto L_0x00e7
                io.reactivex.internal.fuseable.SimpleQueue<R> r7 = r5.queue
                if (r7 == 0) goto L_0x00e7
                boolean r8 = r5.done
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.d()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.a(r1)
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.cancelled
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e5
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.a(r1)
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.done
                java.lang.Object r11 = r7.bc_()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.b(r8)
                io.reactivex.internal.util.AtomicThrowable r11 = r13.errors
                io.reactivex.internal.util.ExceptionHelper.a(r11, r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.d()
                io.reactivex.disposables.Disposable r8 = r13.upstream
                r8.bf_()
                r13.done = r3
                goto L_0x00d0
            L_0x00cd:
                io.reactivex.internal.disposables.DisposableHelper.a(r5)
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 != 0) goto L_0x00e5
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e5:
                if (r8 != 0) goto L_0x000f
            L_0x00e7:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 == 0) goto L_0x00f0
                goto L_0x000f
            L_0x00f0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.c():void");
        }
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.b = function;
        this.c = i;
    }

    public final void a(Observer<? super R> observer) {
        if (!ObservableScalarXMap.a(this.a, observer, this.b)) {
            this.a.subscribe(new SwitchMapObserver(observer, this.b, this.c, this.d));
        }
    }
}
