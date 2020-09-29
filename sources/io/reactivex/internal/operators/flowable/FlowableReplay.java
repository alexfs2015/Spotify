package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableReplay<T> extends ConnectableFlowable<T> implements ResettableConnectable {
    private static Callable f = new DefaultUnboundedFactory();
    private Flowable<T> b;
    private AtomicReference<ReplaySubscriber<T>> c;
    private Callable<? extends ReplayBuffer<T>> d;
    private xfk<T> e;

    static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        BoundedReplayBuffer() {
            Node node = new Node(null, 0);
            this.tail = node;
            set(node);
        }

        private void a(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        private void c() {
            Node node = (Node) get();
            if (node.value != null) {
                Node node2 = new Node(null, 0);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public final void a() {
            Object a = NotificationLite.a();
            long j = this.index + 1;
            this.index = j;
            a(new Node(a, j));
            c();
        }

        /* JADX INFO: used method not loaded: io.reactivex.internal.util.BackpressureHelper.a(java.util.concurrent.atomic.AtomicLong, long):null, types can be incorrect */
        /* JADX INFO: used method not loaded: io.reactivex.internal.util.NotificationLite.a(java.lang.Object, xfl):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
            if (r15.b() == false) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
            r15.index = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
            r3 = r15.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r3 != Long.MAX_VALUE) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
            r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r15.index;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            if (r6 != null) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
            r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) get();
            r15.index = r6;
            io.reactivex.internal.util.BackpressureHelper.a(r15.totalRequested, r6.index);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
            if (r3 == 0) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
            r11 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r6.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
            if (r11 == null) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
            r6 = r11.value;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
            if (io.reactivex.internal.util.NotificationLite.a(r6, (defpackage.xfl) r15.child) == false) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
            r15.index = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
            r9 = r9 + 1;
            r3 = r3 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
            if (r15.b() == false) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
            r15.index = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
            r6 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
            io.reactivex.exceptions.Exceptions.b(r0);
            r15.index = null;
            r15.bd_();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x007d, code lost:
            r15.child.onError(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0082, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0085, code lost:
            if (r9 == 0) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
            r15.index = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
            if (r5 != false) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008b, code lost:
            io.reactivex.internal.util.BackpressureHelper.d(r15, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x008e, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0091, code lost:
            if (r15.missed != false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0093, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0095, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0096, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0097, code lost:
            r15.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0099, code lost:
            monitor-exit(r15);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r15) {
            /*
                r14 = this;
                monitor-enter(r15)
                boolean r0 = r15.emitting     // Catch:{ all -> 0x009f }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r15.missed = r1     // Catch:{ all -> 0x009f }
                monitor-exit(r15)     // Catch:{ all -> 0x009f }
                return
            L_0x000a:
                r15.emitting = r1     // Catch:{ all -> 0x009f }
                monitor-exit(r15)     // Catch:{ all -> 0x009f }
            L_0x000d:
                boolean r0 = r15.b()
                r2 = 0
                if (r0 == 0) goto L_0x0017
                r15.index = r2
                return
            L_0x0017:
                long r3 = r15.get()
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x0027
                r5 = 1
                goto L_0x0028
            L_0x0027:
                r5 = 0
            L_0x0028:
                java.lang.Object r6 = r15.index
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r6
                r7 = 0
                if (r6 != 0) goto L_0x003f
                java.lang.Object r6 = r14.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r6
                r15.index = r6
                java.util.concurrent.atomic.AtomicLong r9 = r15.totalRequested
                long r10 = r6.index
                io.reactivex.internal.util.BackpressureHelper.a(r9, r10)
            L_0x003f:
                r9 = r7
            L_0x0040:
                int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r11 == 0) goto L_0x0083
                java.lang.Object r11 = r6.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r11 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r11
                if (r11 == 0) goto L_0x0083
                java.lang.Object r6 = r11.value
                xfl<? super T> r12 = r15.child     // Catch:{ all -> 0x0068 }
                boolean r12 = io.reactivex.internal.util.NotificationLite.a(r6, r12)     // Catch:{ all -> 0x0068 }
                if (r12 == 0) goto L_0x0059
                r15.index = r2     // Catch:{ all -> 0x0068 }
                return
            L_0x0059:
                r12 = 1
                long r9 = r9 + r12
                long r3 = r3 - r12
                boolean r6 = r15.b()
                if (r6 == 0) goto L_0x0066
                r15.index = r2
                return
            L_0x0066:
                r6 = r11
                goto L_0x0040
            L_0x0068:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.b(r0)
                r15.index = r2
                r15.bd_()
                boolean r1 = io.reactivex.internal.util.NotificationLite.c(r6)
                if (r1 != 0) goto L_0x0082
                boolean r1 = io.reactivex.internal.util.NotificationLite.b(r6)
                if (r1 != 0) goto L_0x0082
                xfl<? super T> r15 = r15.child
                r15.onError(r0)
            L_0x0082:
                return
            L_0x0083:
                int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x008e
                r15.index = r6
                if (r5 != 0) goto L_0x008e
                io.reactivex.internal.util.BackpressureHelper.d(r15, r9)
            L_0x008e:
                monitor-enter(r15)
                boolean r2 = r15.missed     // Catch:{ all -> 0x009c }
                if (r2 != 0) goto L_0x0097
                r15.emitting = r0     // Catch:{ all -> 0x009c }
                monitor-exit(r15)     // Catch:{ all -> 0x009c }
                return
            L_0x0097:
                r15.missed = r0     // Catch:{ all -> 0x009c }
                monitor-exit(r15)     // Catch:{ all -> 0x009c }
                goto L_0x000d
            L_0x009c:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x009c }
                throw r0
            L_0x009f:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x009f }
                goto L_0x00a3
            L_0x00a2:
                throw r0
            L_0x00a3:
                goto L_0x00a2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer.a(io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription):void");
        }

        public final void a(T t) {
            Object a = NotificationLite.a(t);
            long j = this.index + 1;
            this.index = j;
            a(new Node(a, j));
            b();
        }

        public final void a(Throwable th) {
            Object a = NotificationLite.a(th);
            long j = this.index + 1;
            this.index = j;
            a(new Node(a, j));
            c();
        }

        /* access modifiers changed from: 0000 */
        public void b() {
        }
    }

    static final class DefaultUnboundedFactory implements Callable<Object> {
        DefaultUnboundedFactory() {
        }

        public final Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    static final class InnerSubscription<T> extends AtomicLong implements Disposable, xfm {
        private static final long serialVersionUID = -4453897557930727610L;
        final xfl<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        InnerSubscription(ReplaySubscriber<T> replaySubscriber, xfl<? super T> xfl) {
            this.parent = replaySubscriber;
            this.child = xfl;
        }

        public final void a() {
            bd_();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j) && BackpressureHelper.b((AtomicLong) this, j) != Long.MIN_VALUE) {
                BackpressureHelper.a(this.totalRequested, j);
                this.parent.d();
                this.parent.buffer.a(this);
            }
        }

        public final boolean b() {
            return get() == Long.MIN_VALUE;
        }

        public final void bd_() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.a(this);
                this.parent.d();
                this.index = null;
            }
        }
    }

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    interface ReplayBuffer<T> {
        void a();

        void a(InnerSubscription<T> innerSubscription);

        void a(T t);

        void a(Throwable th);
    }

    static final class ReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        private final int a;

        ReplayBufferTask(int i) {
            this.a = i;
        }

        public final /* synthetic */ Object call() {
            return new SizeBoundReplayBuffer(this.a);
        }
    }

    static final class ReplayPublisher<T> implements xfk<T> {
        private final AtomicReference<ReplaySubscriber<T>> a;
        private final Callable<? extends ReplayBuffer<T>> b;

        ReplayPublisher(AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends ReplayBuffer<T>> callable) {
            this.a = atomicReference;
            this.b = callable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(defpackage.xfl<? super T> r6) {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T>> r0 = r5.a
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber) r0
                if (r0 != 0) goto L_0x002a
                java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T>> r0 = r5.b     // Catch:{ all -> 0x0022 }
                java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x0022 }
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer) r0     // Catch:{ all -> 0x0022 }
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T>> r0 = r5.a
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0000
                r0 = r1
                goto L_0x002a
            L_0x0022:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.b(r0)
                io.reactivex.internal.subscriptions.EmptySubscription.a(r0, r6)
                return
            L_0x002a:
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription r1 = new io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription
                r1.<init>(r0, r6)
                r6.a(r1)
            L_0x0032:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r6 = r0.subscribers
                java.lang.Object r6 = r6.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r6
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r2 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.a
                if (r6 != r2) goto L_0x003f
                goto L_0x0052
            L_0x003f:
                int r2 = r6.length
                int r3 = r2 + 1
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r3 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[r3]
                r4 = 0
                java.lang.System.arraycopy(r6, r4, r3, r4, r2)
                r3[r2] = r1
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r2 = r0.subscribers
                boolean r6 = r2.compareAndSet(r6, r3)
                if (r6 == 0) goto L_0x0032
            L_0x0052:
                boolean r6 = r1.b()
                if (r6 == 0) goto L_0x005c
                r0.a(r1)
                return
            L_0x005c:
                r0.d()
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r6 = r0.buffer
                r6.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay.ReplayPublisher.b(xfl):void");
        }
    }

    static final class ReplaySubscriber<T> extends AtomicReference<xfm> implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] a = new InnerSubscription[0];
        private static InnerSubscription[] b = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final ReplayBuffer<T> buffer;
        boolean done;
        final AtomicInteger management = new AtomicInteger();
        long maxChildRequested;
        long maxUpstreamRequested;
        final AtomicBoolean shouldConnect = new AtomicBoolean();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(b);

        ReplaySubscriber(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
        }

        /* access modifiers changed from: 0000 */
        public final void a(InnerSubscription<T> innerSubscription) {
            InnerSubscription[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = (InnerSubscription[]) this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerSubscriptionArr[i2].equals(innerSubscription)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriptionArr2 = b;
                        } else {
                            InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[(length - 1)];
                            System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                            System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                            innerSubscriptionArr2 = innerSubscriptionArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a((AtomicReference<xfm>) this, xfm)) {
                d();
                for (InnerSubscription a2 : (InnerSubscription[]) this.subscribers.get()) {
                    this.buffer.a(a2);
                }
            }
        }

        public final boolean b() {
            return this.subscribers.get() == a;
        }

        public final void b_(T t) {
            if (!this.done) {
                this.buffer.a(t);
                for (InnerSubscription a2 : (InnerSubscription[]) this.subscribers.get()) {
                    this.buffer.a(a2);
                }
            }
        }

        public final void bd_() {
            this.subscribers.set(a);
            SubscriptionHelper.a((AtomicReference<xfm>) this);
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                this.buffer.a();
                for (InnerSubscription a2 : (InnerSubscription[]) this.subscribers.getAndSet(a)) {
                    this.buffer.a(a2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            if (this.management.getAndIncrement() == 0) {
                int i = 1;
                while (!b()) {
                    InnerSubscription[] innerSubscriptionArr = (InnerSubscription[]) this.subscribers.get();
                    long j = this.maxChildRequested;
                    long j2 = j;
                    for (InnerSubscription innerSubscription : innerSubscriptionArr) {
                        j2 = Math.max(j2, innerSubscription.totalRequested.get());
                    }
                    long j3 = this.maxUpstreamRequested;
                    xfm xfm = (xfm) get();
                    long j4 = j2 - j;
                    if (j4 != 0) {
                        this.maxChildRequested = j2;
                        if (xfm == null) {
                            long j5 = j3 + j4;
                            if (j5 < 0) {
                                j5 = Long.MAX_VALUE;
                            }
                            this.maxUpstreamRequested = j5;
                        } else if (j3 != 0) {
                            this.maxUpstreamRequested = 0;
                            xfm.a(j3 + j4);
                        } else {
                            xfm.a(j4);
                        }
                    } else if (!(j3 == 0 || xfm == null)) {
                        this.maxUpstreamRequested = 0;
                        xfm.a(j3);
                    }
                    i = this.management.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.a(th);
                for (InnerSubscription a2 : (InnerSubscription[]) this.subscribers.getAndSet(a)) {
                    this.buffer.a(a2);
                }
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (this.size > this.limit) {
                Node node = (Node) ((Node) get()).get();
                if (node != null) {
                    this.size--;
                    set(node);
                    return;
                }
                throw new IllegalStateException("Empty list!");
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(16);
        }

        public final void a() {
            add(NotificationLite.a());
            this.size++;
        }

        /* JADX INFO: used method not loaded: io.reactivex.internal.util.NotificationLite.a(java.lang.Object, xfl):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            if (r15.b() == false) goto L_0x0016;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
            r1 = r14.size;
            r2 = (java.lang.Integer) r15.index;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
            if (r2 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            r2 = r2.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
            r4 = r15.get();
            r8 = r4;
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
            if (r8 == 0) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
            if (r2 >= r1) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
            r12 = get(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
            if (io.reactivex.internal.util.NotificationLite.a(r12, (defpackage.xfl) r0) == false) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
            if (r15.b() == false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            r2 = r2 + 1;
            r8 = r8 - 1;
            r10 = r10 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
            io.reactivex.exceptions.Exceptions.b(r1);
            r15.bd_();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
            r0.onError(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0062, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
            if (r10 == 0) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
            r15.index = java.lang.Integer.valueOf(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
            if (r4 == Long.MAX_VALUE) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
            io.reactivex.internal.util.BackpressureHelper.d(r15, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007c, code lost:
            if (r15.missed != false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x007e, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0081, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0082, code lost:
            r15.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0084, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
            r0 = r15.child;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r15) {
            /*
                r14 = this;
                monitor-enter(r15)
                boolean r0 = r15.emitting     // Catch:{ all -> 0x0089 }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r15.missed = r1     // Catch:{ all -> 0x0089 }
                monitor-exit(r15)     // Catch:{ all -> 0x0089 }
                return
            L_0x000a:
                r15.emitting = r1     // Catch:{ all -> 0x0089 }
                monitor-exit(r15)     // Catch:{ all -> 0x0089 }
                xfl<? super T> r0 = r15.child
            L_0x000f:
                boolean r1 = r15.b()
                if (r1 == 0) goto L_0x0016
                return
            L_0x0016:
                int r1 = r14.size
                java.lang.Object r2 = r15.index
                java.lang.Integer r2 = (java.lang.Integer) r2
                r3 = 0
                if (r2 == 0) goto L_0x0024
                int r2 = r2.intValue()
                goto L_0x0025
            L_0x0024:
                r2 = 0
            L_0x0025:
                long r4 = r15.get()
                r6 = 0
                r8 = r4
                r10 = r6
            L_0x002d:
                int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r12 == 0) goto L_0x0063
                if (r2 >= r1) goto L_0x0063
                java.lang.Object r12 = r14.get(r2)
                boolean r12 = io.reactivex.internal.util.NotificationLite.a(r12, r0)     // Catch:{ all -> 0x004c }
                if (r12 == 0) goto L_0x003e
                return
            L_0x003e:
                boolean r12 = r15.b()
                if (r12 == 0) goto L_0x0045
                return
            L_0x0045:
                int r2 = r2 + 1
                r12 = 1
                long r8 = r8 - r12
                long r10 = r10 + r12
                goto L_0x002d
            L_0x004c:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.b(r1)
                r15.bd_()
                boolean r15 = io.reactivex.internal.util.NotificationLite.c(r12)
                if (r15 != 0) goto L_0x0062
                boolean r15 = io.reactivex.internal.util.NotificationLite.b(r12)
                if (r15 != 0) goto L_0x0062
                r0.onError(r1)
            L_0x0062:
                return
            L_0x0063:
                int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r1 == 0) goto L_0x0079
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r15.index = r1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 == 0) goto L_0x0079
                io.reactivex.internal.util.BackpressureHelper.d(r15, r10)
            L_0x0079:
                monitor-enter(r15)
                boolean r1 = r15.missed     // Catch:{ all -> 0x0086 }
                if (r1 != 0) goto L_0x0082
                r15.emitting = r3     // Catch:{ all -> 0x0086 }
                monitor-exit(r15)     // Catch:{ all -> 0x0086 }
                return
            L_0x0082:
                r15.missed = r3     // Catch:{ all -> 0x0086 }
                monitor-exit(r15)     // Catch:{ all -> 0x0086 }
                goto L_0x000f
            L_0x0086:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0086 }
                throw r0
            L_0x0089:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0089 }
                goto L_0x008d
            L_0x008c:
                throw r0
            L_0x008d:
                goto L_0x008c
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay.UnboundedReplayBuffer.a(io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription):void");
        }

        public final void a(T t) {
            add(NotificationLite.a(t));
            this.size++;
        }

        public final void a(Throwable th) {
            add(NotificationLite.a(th));
            this.size++;
        }
    }

    private FlowableReplay(xfk<T> xfk, Flowable<T> flowable, AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends ReplayBuffer<T>> callable) {
        this.e = xfk;
        this.b = flowable;
        this.c = atomicReference;
        this.d = callable;
    }

    public static <T> ConnectableFlowable<T> a(Flowable<T> flowable, int i) {
        return i == Integer.MAX_VALUE ? a(flowable, f) : a(flowable, (Callable<? extends ReplayBuffer<T>>) new ReplayBufferTask<Object>(i));
    }

    private static <T> ConnectableFlowable<T> a(Flowable<T> flowable, Callable<? extends ReplayBuffer<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.a((ConnectableFlowable<T>) new FlowableReplay<T>(new ReplayPublisher(atomicReference, callable), flowable, atomicReference, callable));
    }

    public final void a(Disposable disposable) {
        this.c.compareAndSet((ReplaySubscriber) disposable, null);
    }

    public final void a(xfl<? super T> xfl) {
        this.e.b(xfl);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T>> r0 = r4.c
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0026
        L_0x0010:
            java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T>> r1 = r4.d     // Catch:{ all -> 0x0056 }
            java.lang.Object r1 = r1.call()     // Catch:{ all -> 0x0056 }
            io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer r1 = (io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer) r1     // Catch:{ all -> 0x0056 }
            io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T>> r1 = r4.c
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = r2
        L_0x0026:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x003a
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            r5.accept(r0)     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0045
            io.reactivex.Flowable<T> r5 = r4.b
            r5.a(r0)
        L_0x0045:
            return
        L_0x0046:
            r5 = move-exception
            if (r1 == 0) goto L_0x004e
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.shouldConnect
            r0.compareAndSet(r2, r3)
        L_0x004e:
            io.reactivex.exceptions.Exceptions.b(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.a(r5)
            throw r5
        L_0x0056:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.b(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.a(r5)
            goto L_0x0060
        L_0x005f:
            throw r5
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay.d(io.reactivex.functions.Consumer):void");
    }
}
