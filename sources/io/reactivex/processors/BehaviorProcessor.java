package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class BehaviorProcessor<T> extends FlowableProcessor<T> {
    private static BehaviorSubscription[] f = new BehaviorSubscription[0];
    private static BehaviorSubscription[] g = new BehaviorSubscription[0];
    final Lock b = this.h.readLock();
    final AtomicReference<Object> c = new AtomicReference<>();
    long d;
    private AtomicReference<BehaviorSubscription<T>[]> e = new AtomicReference<>(f);
    private ReadWriteLock h = new ReentrantReadWriteLock();
    private Lock i = this.h.writeLock();
    private AtomicReference<Throwable> j = new AtomicReference<>();

    static final class BehaviorSubscription<T> extends AtomicLong implements NonThrowingPredicate<Object>, wrh {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final wrg<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        AppendOnlyLinkedArrayList<Object> queue;
        final BehaviorProcessor<T> state;

        BehaviorSubscription(wrg<? super T> wrg, BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = wrg;
            this.state = behaviorProcessor;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
            }
        }

        public final void a() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.fastPath = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.fastPath
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.cancelled     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.index     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.emitting     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r5 = r3.queue     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.internal.util.AppendOnlyLinkedArrayList r5 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.queue = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.next = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.fastPath = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.a(java.lang.Object, long):void");
        }

        public final boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (NotificationLite.b(obj)) {
                this.downstream.c();
                return true;
            } else if (NotificationLite.c(obj)) {
                this.downstream.onError(NotificationLite.e(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.downstream.b_(NotificationLite.d(obj));
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                    return false;
                }
                a();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }

        /* JADX INFO: used method not loaded: io.reactivex.internal.util.AppendOnlyLinkedArrayList.a(io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.a((io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate) r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.emitting = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.queue = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                goto L_0x001b
            L_0x001a:
                throw r0
            L_0x001b:
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.b():void");
        }
    }

    public static <T> BehaviorProcessor<T> k() {
        return new BehaviorProcessor<>();
    }

    BehaviorProcessor() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r8 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r0.test(r8) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wrg<? super T> r8) {
        /*
            r7 = this;
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription r0 = new io.reactivex.processors.BehaviorProcessor$BehaviorSubscription
            r0.<init>(r8, r7)
            r8.a(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r1 = r7.e
            java.lang.Object r1 = r1.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r2 = g
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            goto L_0x002b
        L_0x0018:
            int r2 = r1.length
            int r5 = r2 + 1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r5 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r2 = r7.e
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L_0x0008
            r1 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0072
            boolean r8 = r0.cancelled
            if (r8 == 0) goto L_0x0035
            r7.a(r0)
            return
        L_0x0035:
            boolean r8 = r0.cancelled
            if (r8 != 0) goto L_0x0071
            monitor-enter(r0)
            boolean r8 = r0.cancelled     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0085
        L_0x0040:
            boolean r8 = r0.next     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0046
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0085
        L_0x0046:
            io.reactivex.processors.BehaviorProcessor<T> r8 = r0.state     // Catch:{ all -> 0x006e }
            java.util.concurrent.locks.Lock r1 = r8.b     // Catch:{ all -> 0x006e }
            r1.lock()     // Catch:{ all -> 0x006e }
            long r5 = r8.d     // Catch:{ all -> 0x006e }
            r0.index = r5     // Catch:{ all -> 0x006e }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.c     // Catch:{ all -> 0x006e }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x006e }
            r1.unlock()     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x005d
            r3 = 1
        L_0x005d:
            r0.emitting = r3     // Catch:{ all -> 0x006e }
            r0.next = r4     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0071
            boolean r8 = r0.test(r8)
            if (r8 != 0) goto L_0x0071
            r0.b()
            goto L_0x0071
        L_0x006e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r8
        L_0x0071:
            return
        L_0x0072:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.j
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.a
            if (r0 != r1) goto L_0x0082
            r8.c()
            return
        L_0x0082:
            r8.onError(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.a(wrg):void");
    }

    public final void a(wrh wrh) {
        if (this.j.get() != null) {
            wrh.a();
        } else {
            wrh.a(Long.MAX_VALUE);
        }
    }

    public final void b_(T t) {
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.j.get() == null) {
            Object a = NotificationLite.a(t);
            e(a);
            for (BehaviorSubscription a2 : (BehaviorSubscription[]) this.e.get()) {
                a2.a(a, this.d);
            }
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.j.compareAndSet(null, th)) {
            RxJavaPlugins.a(th);
            return;
        }
        Object a = NotificationLite.a(th);
        for (BehaviorSubscription a2 : d(a)) {
            a2.a(a, this.d);
        }
    }

    public final void c() {
        if (this.j.compareAndSet(null, ExceptionHelper.a)) {
            Object a = NotificationLite.a();
            for (BehaviorSubscription a2 : d(a)) {
                a2.a(a, this.d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.e.get();
            int length = behaviorSubscriptionArr.length;
            if (length != 0) {
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (behaviorSubscriptionArr[i3] == behaviorSubscription) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    if (length == 1) {
                        behaviorSubscriptionArr2 = f;
                    } else {
                        BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[(length - 1)];
                        System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i2);
                        System.arraycopy(behaviorSubscriptionArr, i2 + 1, behaviorSubscriptionArr3, i2, (length - i2) - 1);
                        behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.e.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    private BehaviorSubscription<T>[] d(Object obj) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr = (BehaviorSubscription[]) this.e.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr2 = g;
        if (behaviorSubscriptionArr != behaviorSubscriptionArr2) {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.e.getAndSet(behaviorSubscriptionArr2);
            if (behaviorSubscriptionArr != g) {
                e(obj);
            }
        }
        return behaviorSubscriptionArr;
    }

    private void e(Object obj) {
        Lock lock = this.i;
        lock.lock();
        this.d++;
        this.c.lazySet(obj);
        lock.unlock();
    }
}
