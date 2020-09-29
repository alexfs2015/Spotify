package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableRefCount<T> extends Observable<T> {
    final ConnectableObservable<T> a;
    final long b;
    final TimeUnit c;
    final Scheduler d;
    RefConnection e;
    private int f;

    static final class RefConnection extends AtomicReference<Disposable> implements Consumer<Disposable>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final ObservableRefCount<?> parent;
        long subscriberCount;
        Disposable timer;

        RefConnection(ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }

        public final /* synthetic */ void accept(Object obj) {
            Disposable disposable = (Disposable) obj;
            DisposableHelper.c(this, disposable);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((ResettableConnectable) this.parent.a).a(disposable);
                }
            }
        }

        public final void run() {
            this.parent.b(this);
        }
    }

    static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final Observer<? super T> downstream;
        final ObservableRefCount<T> parent;
        Disposable upstream;

        RefCountObserver(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = observer;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }

        public final boolean b() {
            return this.upstream.b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
            io.reactivex.internal.disposables.DisposableHelper.c(r2, r0.d.a(r1, r0.b, r0.c));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bd_() {
            /*
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.upstream
                r0.bd_()
                r0 = 0
                r1 = 1
                boolean r0 = r7.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0055
                io.reactivex.internal.operators.observable.ObservableRefCount<T> r0 = r7.parent
                io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r1 = r7.connection
                monitor-enter(r0)
                io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r2 = r0.e     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x0050
                io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r2 = r0.e     // Catch:{ all -> 0x0052 }
                if (r2 == r1) goto L_0x001b
                goto L_0x0050
            L_0x001b:
                long r2 = r1.subscriberCount     // Catch:{ all -> 0x0052 }
                r4 = 1
                long r2 = r2 - r4
                r1.subscriberCount = r2     // Catch:{ all -> 0x0052 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x004e
                boolean r2 = r1.connected     // Catch:{ all -> 0x0052 }
                if (r2 != 0) goto L_0x002d
                goto L_0x004e
            L_0x002d:
                long r2 = r0.b     // Catch:{ all -> 0x0052 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0038
                r0.b(r1)     // Catch:{ all -> 0x0052 }
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0038:
                io.reactivex.internal.disposables.SequentialDisposable r2 = new io.reactivex.internal.disposables.SequentialDisposable     // Catch:{ all -> 0x0052 }
                r2.<init>()     // Catch:{ all -> 0x0052 }
                r1.timer = r2     // Catch:{ all -> 0x0052 }
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                io.reactivex.Scheduler r3 = r0.d
                long r4 = r0.b
                java.util.concurrent.TimeUnit r0 = r0.c
                io.reactivex.disposables.Disposable r0 = r3.a(r1, r4, r0)
                io.reactivex.internal.disposables.DisposableHelper.c(r2, r0)
                goto L_0x0055
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0050:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0052:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                throw r1
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableRefCount.RefCountObserver.bd_():void");
        }

        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.a(this.connection);
                this.downstream.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.a(this.connection);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0, TimeUnit.NANOSECONDS, null);
    }

    private ObservableRefCount(ConnectableObservable<T> connectableObservable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = connectableObservable;
        this.f = 1;
        this.b = 0;
        this.c = timeUnit;
        this.d = null;
    }

    public final void a(Observer<? super T> observer) {
        RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.e;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.e = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && refConnection.timer != null) {
                refConnection.timer.bd_();
            }
            long j2 = j + 1;
            refConnection.subscriberCount = j2;
            z = true;
            if (refConnection.connected || j2 != ((long) this.f)) {
                z = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.a.subscribe(new RefCountObserver(observer, this, refConnection));
        if (z) {
            this.a.e(refConnection);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(RefConnection refConnection) {
        synchronized (this) {
            if (this.e != null && this.e == refConnection) {
                this.e = null;
                if (refConnection.timer != null) {
                    refConnection.timer.bd_();
                }
            }
            long j = refConnection.subscriberCount - 1;
            refConnection.subscriberCount = j;
            if (j == 0) {
                if (this.a instanceof Disposable) {
                    ((Disposable) this.a).bd_();
                } else if (this.a instanceof ResettableConnectable) {
                    ((ResettableConnectable) this.a).a((Disposable) refConnection.get());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.e) {
                this.e = null;
                Disposable disposable = (Disposable) refConnection.get();
                DisposableHelper.a((AtomicReference<Disposable>) refConnection);
                if (this.a instanceof Disposable) {
                    ((Disposable) this.a).bd_();
                } else if (this.a instanceof ResettableConnectable) {
                    if (disposable == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((ResettableConnectable) this.a).a(disposable);
                    }
                }
            }
        }
    }
}
