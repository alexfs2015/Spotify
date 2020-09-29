package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    private Scheduler b;
    private boolean c;
    private int d;

    static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final Observer<? super T> downstream;
        Throwable error;
        boolean outputFused;
        SimpleQueue<T> queue;
        int sourceMode;
        Disposable upstream;
        final Worker worker;

        ObserveOnObserver(Observer<? super T> observer, Worker worker2, boolean z, int i) {
            this.downstream = observer;
            this.worker = worker2;
            this.delayError = z;
            this.bufferSize = i;
        }

        private boolean a(boolean z, boolean z2, Observer<? super T> observer) {
            if (this.disposed) {
                this.queue.e();
                return true;
            }
            if (z) {
                Throwable th = this.error;
                if (this.delayError) {
                    if (z2) {
                        this.disposed = true;
                        if (th != null) {
                            observer.onError(th);
                        } else {
                            observer.onComplete();
                        }
                        this.worker.bd_();
                        return true;
                    }
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.e();
                    observer.onError(th);
                    this.worker.bd_();
                    return true;
                } else if (z2) {
                    this.disposed = true;
                    observer.onComplete();
                    this.worker.bd_();
                    return true;
                }
            }
            return false;
        }

        private void f() {
            if (getAndIncrement() == 0) {
                this.worker.a((Runnable) this);
            }
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final boolean b() {
            return this.disposed;
        }

        public final T ba_() {
            return this.queue.ba_();
        }

        public final void bd_() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.bd_();
                this.worker.bd_();
                if (getAndIncrement() == 0) {
                    this.queue.e();
                }
            }
        }

        public final boolean d() {
            return this.queue.d();
        }

        public final void e() {
            this.queue.e();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                f();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            f();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.a(t);
                }
                f();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int a = queueDisposable.a(7);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        f();
                        return;
                    } else if (a == 2) {
                        this.sourceMode = a;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
            r3 = addAndGet(-r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            if (r3 != 0) goto L_0x0051;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                boolean r0 = r7.outputFused
                r1 = 1
                if (r0 == 0) goto L_0x004c
                r0 = 1
            L_0x0006:
                boolean r2 = r7.disposed
                if (r2 != 0) goto L_0x004b
                boolean r2 = r7.done
                java.lang.Throwable r3 = r7.error
                boolean r4 = r7.delayError
                if (r4 != 0) goto L_0x0024
                if (r2 == 0) goto L_0x0024
                if (r3 == 0) goto L_0x0024
                r7.disposed = r1
                io.reactivex.Observer<? super T> r0 = r7.downstream
                r0.onError(r3)
                io.reactivex.Scheduler$Worker r0 = r7.worker
                r0.bd_()
                goto L_0x0092
            L_0x0024:
                io.reactivex.Observer<? super T> r3 = r7.downstream
                r4 = 0
                r3.onNext(r4)
                if (r2 == 0) goto L_0x0043
                r7.disposed = r1
                java.lang.Throwable r0 = r7.error
                if (r0 == 0) goto L_0x0038
                io.reactivex.Observer<? super T> r1 = r7.downstream
                r1.onError(r0)
                goto L_0x003d
            L_0x0038:
                io.reactivex.Observer<? super T> r0 = r7.downstream
                r0.onComplete()
            L_0x003d:
                io.reactivex.Scheduler$Worker r0 = r7.worker
                r0.bd_()
                goto L_0x0092
            L_0x0043:
                int r0 = -r0
                int r0 = r7.addAndGet(r0)
                if (r0 == 0) goto L_0x004b
                goto L_0x0006
            L_0x004b:
                return
            L_0x004c:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r7.queue
                io.reactivex.Observer<? super T> r2 = r7.downstream
                r3 = 1
            L_0x0051:
                boolean r4 = r7.done
                boolean r5 = r0.d()
                boolean r4 = r7.a(r4, r5, r2)
                if (r4 != 0) goto L_0x0092
            L_0x005d:
                boolean r4 = r7.done
                java.lang.Object r5 = r0.ba_()     // Catch:{ all -> 0x007c }
                if (r5 != 0) goto L_0x0067
                r6 = 1
                goto L_0x0068
            L_0x0067:
                r6 = 0
            L_0x0068:
                boolean r4 = r7.a(r4, r6, r2)
                if (r4 != 0) goto L_0x0092
                if (r6 != 0) goto L_0x0074
                r2.onNext(r5)
                goto L_0x005d
            L_0x0074:
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L_0x0051
                goto L_0x0092
            L_0x007c:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.b(r3)
                r7.disposed = r1
                io.reactivex.disposables.Disposable r1 = r7.upstream
                r1.bd_()
                r0.e()
                r2.onError(r3)
                io.reactivex.Scheduler$Worker r0 = r7.worker
                r0.bd_()
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableObserveOn.ObserveOnObserver.run():void");
        }
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler, boolean z, int i) {
        super(observableSource);
        this.b = scheduler;
        this.c = z;
        this.d = i;
    }

    public final void a(Observer<? super T> observer) {
        Scheduler scheduler = this.b;
        if (scheduler instanceof TrampolineScheduler) {
            this.a.subscribe(observer);
            return;
        }
        this.a.subscribe(new ObserveOnObserver(observer, scheduler.a(), this.c, this.d));
    }
}
