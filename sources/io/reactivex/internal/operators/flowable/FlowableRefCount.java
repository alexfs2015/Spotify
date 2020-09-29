package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableRefCount<T> extends Flowable<T> {
    final ConnectableFlowable<T> b;
    final long c;
    final TimeUnit d;
    final Scheduler e;
    RefConnection f;
    private int g;

    static final class RefConnection extends AtomicReference<Disposable> implements Consumer<Disposable>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
        long subscriberCount;
        Disposable timer;

        RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }

        public final /* synthetic */ void accept(Object obj) {
            Disposable disposable = (Disposable) obj;
            DisposableHelper.c(this, disposable);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((ResettableConnectable) this.parent.b).a(disposable);
                }
            }
        }

        public final void run() {
            this.parent.b(this);
        }
    }

    static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final xfl<? super T> downstream;
        final FlowableRefCount<T> parent;
        xfm upstream;

        RefCountSubscriber(xfl<? super T> xfl, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = xfl;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
            io.reactivex.internal.disposables.DisposableHelper.c(r2, r0.e.a(r1, r0.c, r0.d));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                xfm r0 = r7.upstream
                r0.a()
                r0 = 0
                r1 = 1
                boolean r0 = r7.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0055
                io.reactivex.internal.operators.flowable.FlowableRefCount<T> r0 = r7.parent
                io.reactivex.internal.operators.flowable.FlowableRefCount$RefConnection r1 = r7.connection
                monitor-enter(r0)
                io.reactivex.internal.operators.flowable.FlowableRefCount$RefConnection r2 = r0.f     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x0050
                io.reactivex.internal.operators.flowable.FlowableRefCount$RefConnection r2 = r0.f     // Catch:{ all -> 0x0052 }
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
                long r2 = r0.c     // Catch:{ all -> 0x0052 }
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
                io.reactivex.Scheduler r3 = r0.e
                long r4 = r0.c
                java.util.concurrent.TimeUnit r0 = r0.d
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRefCount.RefCountSubscriber.a():void");
        }

        public final void a(long j) {
            this.upstream.a(j);
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void c() {
            if (compareAndSet(false, true)) {
                this.parent.a(this.connection);
                this.downstream.c();
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
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0, TimeUnit.NANOSECONDS, null);
    }

    private FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.b = connectableFlowable;
        this.g = 1;
        this.c = 0;
        this.d = timeUnit;
        this.e = null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(RefConnection refConnection) {
        synchronized (this) {
            if (this.f != null && this.f == refConnection) {
                this.f = null;
                if (refConnection.timer != null) {
                    refConnection.timer.bd_();
                }
            }
            long j = refConnection.subscriberCount - 1;
            refConnection.subscriberCount = j;
            if (j == 0) {
                if (this.b instanceof Disposable) {
                    ((Disposable) this.b).bd_();
                } else if (this.b instanceof ResettableConnectable) {
                    ((ResettableConnectable) this.b).a((Disposable) refConnection.get());
                }
            }
        }
    }

    public final void a(xfl<? super T> xfl) {
        RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.f;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.f = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && refConnection.timer != null) {
                refConnection.timer.bd_();
            }
            long j2 = j + 1;
            refConnection.subscriberCount = j2;
            z = true;
            if (refConnection.connected || j2 != ((long) this.g)) {
                z = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.b.a((FlowableSubscriber<? super T>) new RefCountSubscriber<Object>(xfl, this, refConnection));
        if (z) {
            this.b.d(refConnection);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.f) {
                this.f = null;
                Disposable disposable = (Disposable) refConnection.get();
                DisposableHelper.a((AtomicReference<Disposable>) refConnection);
                if (this.b instanceof Disposable) {
                    ((Disposable) this.b).bd_();
                } else if (this.b instanceof ResettableConnectable) {
                    if (disposable == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((ResettableConnectable) this.b).a(disposable);
                    }
                }
            }
        }
    }
}
