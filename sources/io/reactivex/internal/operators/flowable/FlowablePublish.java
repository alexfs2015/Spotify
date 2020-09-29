package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowablePublish<T> extends ConnectableFlowable<T> {
    private Flowable<T> b;
    private AtomicReference<PublishSubscriber<T>> c;
    private int d;
    private xfk<T> e;

    static final class FlowablePublisher<T> implements xfk<T> {
        private final AtomicReference<PublishSubscriber<T>> a;
        private final int b;

        FlowablePublisher(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.a = atomicReference;
            this.b = i;
        }

        public final void b(xfl<? super T> xfl) {
            PublishSubscriber<T> publishSubscriber;
            boolean z;
            InnerSubscriber innerSubscriber = new InnerSubscriber(xfl);
            xfl.a(innerSubscriber);
            while (true) {
                publishSubscriber = (PublishSubscriber) this.a.get();
                if (publishSubscriber == null || publishSubscriber.b()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.a, this.b);
                    if (this.a.compareAndSet(publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) publishSubscriber.subscribers.get();
                    z = false;
                    if (innerSubscriberArr != PublishSubscriber.a) {
                        int length = innerSubscriberArr.length;
                        InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = innerSubscriber;
                        if (publishSubscriber.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.a(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.d();
        }
    }

    static final class InnerSubscriber<T> extends AtomicLong implements xfm {
        private static final long serialVersionUID = -4453897557930727610L;
        final xfl<? super T> child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        InnerSubscriber(xfl<? super T> xfl) {
            this.child = xfl;
        }

        public final void a() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.a(this);
                    publishSubscriber.d();
                }
            }
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.b((AtomicLong) this, j);
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.d();
                }
            }
        }
    }

    static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscriber[] a = new InnerSubscriber[0];
        private static InnerSubscriber[] b = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile SimpleQueue<T> queue;
        final AtomicBoolean shouldConnect;
        int sourceMode;
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(b);
        volatile Object terminalEvent;
        final AtomicReference<xfm> upstream = new AtomicReference<>();

        PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.shouldConnect = new AtomicBoolean();
            this.bufferSize = i;
        }

        private boolean a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.b(obj)) {
                    Throwable e = NotificationLite.e(obj);
                    this.current.compareAndSet(this, null);
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.getAndSet(a);
                    if (innerSubscriberArr.length != 0) {
                        int length = innerSubscriberArr.length;
                        while (i < length) {
                            innerSubscriberArr[i].child.onError(e);
                            i++;
                        }
                    } else {
                        RxJavaPlugins.a(e);
                    }
                    return true;
                } else if (z) {
                    this.current.compareAndSet(this, null);
                    InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.getAndSet(a);
                    int length2 = innerSubscriberArr2.length;
                    while (i < length2) {
                        innerSubscriberArr2[i].child.c();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void a(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    break;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (innerSubscriberArr[i2].equals(innerSubscriber)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        innerSubscriberArr2 = b;
                    } else {
                        InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[(length - 1)];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                        System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                        innerSubscriberArr2 = innerSubscriberArr3;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                if (xfm instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xfm;
                    int a2 = queueSubscription.a(7);
                    if (a2 == 1) {
                        this.sourceMode = a2;
                        this.queue = queueSubscription;
                        this.terminalEvent = NotificationLite.a();
                        d();
                        return;
                    } else if (a2 == 2) {
                        this.sourceMode = a2;
                        this.queue = queueSubscription;
                        xfm.a((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                xfm.a((long) this.bufferSize);
            }
        }

        public final boolean b() {
            return this.subscribers.get() == a;
        }

        public final void b_(T t) {
            if (this.sourceMode != 0 || this.queue.a(t)) {
                d();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        public final void bd_() {
            Object obj = this.subscribers.get();
            Object obj2 = a;
            if (obj != obj2 && ((InnerSubscriber[]) this.subscribers.getAndSet(obj2)) != a) {
                this.current.compareAndSet(this, null);
                SubscriptionHelper.a(this.upstream);
            }
        }

        public final void c() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.a();
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0133, code lost:
            r4 = r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d() {
            /*
                r25 = this;
                r1 = r25
                int r0 = r25.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r2 = r1.subscribers
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                r3 = 1
                r4 = r0
                r5 = 1
            L_0x0014:
                java.lang.Object r0 = r1.terminalEvent
                io.reactivex.internal.fuseable.SimpleQueue<T> r6 = r1.queue
                if (r6 == 0) goto L_0x0023
                boolean r8 = r6.d()
                if (r8 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r8 = 0
                goto L_0x0024
            L_0x0023:
                r8 = 1
            L_0x0024:
                boolean r0 = r1.a(r0, r8)
                if (r0 == 0) goto L_0x002b
                return
            L_0x002b:
                if (r8 != 0) goto L_0x0156
                int r0 = r4.length
                int r9 = r4.length
                r12 = 0
                r13 = 0
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0036:
                r16 = -9223372036854775808
                if (r12 >= r9) goto L_0x0053
                r7 = r4[r12]
                long r18 = r7.get()
                int r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r20 == 0) goto L_0x004e
                long r10 = r7.emitted
                long r10 = r18 - r10
                long r10 = java.lang.Math.min(r14, r10)
                r14 = r10
                goto L_0x0050
            L_0x004e:
                int r13 = r13 + 1
            L_0x0050:
                int r12 = r12 + 1
                goto L_0x0036
            L_0x0053:
                r9 = 1
                if (r0 != r13) goto L_0x0093
                java.lang.Object r0 = r1.terminalEvent
                java.lang.Object r7 = r6.ba_()     // Catch:{ all -> 0x005e }
                goto L_0x0075
            L_0x005e:
                r0 = move-exception
                r6 = r0
                io.reactivex.exceptions.Exceptions.b(r6)
                java.util.concurrent.atomic.AtomicReference<xfm> r0 = r1.upstream
                java.lang.Object r0 = r0.get()
                xfm r0 = (defpackage.xfm) r0
                r0.a()
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.a(r6)
                r1.terminalEvent = r0
                r7 = 0
            L_0x0075:
                if (r7 != 0) goto L_0x0079
                r6 = 1
                goto L_0x007a
            L_0x0079:
                r6 = 0
            L_0x007a:
                boolean r0 = r1.a(r0, r6)
                if (r0 == 0) goto L_0x0081
                return
            L_0x0081:
                int r0 = r1.sourceMode
                if (r0 == r3) goto L_0x0090
                java.util.concurrent.atomic.AtomicReference<xfm> r0 = r1.upstream
                java.lang.Object r0 = r0.get()
                xfm r0 = (defpackage.xfm) r0
                r0.a(r9)
            L_0x0090:
                r6 = 1
                goto L_0x0165
            L_0x0093:
                r0 = r8
                r8 = 0
            L_0x0095:
                long r11 = (long) r8
                int r13 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r13 >= 0) goto L_0x0139
                java.lang.Object r0 = r1.terminalEvent
                java.lang.Object r13 = r6.ba_()     // Catch:{ all -> 0x00a1 }
                goto L_0x00b8
            L_0x00a1:
                r0 = move-exception
                r13 = r0
                io.reactivex.exceptions.Exceptions.b(r13)
                java.util.concurrent.atomic.AtomicReference<xfm> r0 = r1.upstream
                java.lang.Object r0 = r0.get()
                xfm r0 = (defpackage.xfm) r0
                r0.a()
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.a(r13)
                r1.terminalEvent = r0
                r13 = 0
            L_0x00b8:
                if (r13 != 0) goto L_0x00bc
                r7 = 1
                goto L_0x00bd
            L_0x00bc:
                r7 = 0
            L_0x00bd:
                boolean r0 = r1.a(r0, r7)
                if (r0 == 0) goto L_0x00c4
                return
            L_0x00c4:
                if (r7 != 0) goto L_0x0135
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.d(r13)
                int r11 = r4.length
                r12 = 0
                r13 = 0
            L_0x00cd:
                if (r12 >= r11) goto L_0x0103
                r3 = r4[r12]
                long r22 = r3.get()
                int r24 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
                if (r24 == 0) goto L_0x00f1
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r24 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
                r22 = r6
                r23 = r7
                if (r24 == 0) goto L_0x00eb
                long r6 = r3.emitted
                long r6 = r6 + r9
                r3.emitted = r6
            L_0x00eb:
                xfl<? super T> r3 = r3.child
                r3.b_(r0)
                goto L_0x00fb
            L_0x00f1:
                r22 = r6
                r23 = r7
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r13 = 1
            L_0x00fb:
                int r12 = r12 + 1
                r6 = r22
                r7 = r23
                r3 = 1
                goto L_0x00cd
            L_0x0103:
                r22 = r6
                r23 = r7
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = r8 + 1
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                if (r13 != 0) goto L_0x0120
                if (r0 == r4) goto L_0x0119
                goto L_0x0120
            L_0x0119:
                r6 = r22
                r0 = r23
                r3 = 1
                goto L_0x0095
            L_0x0120:
                if (r8 == 0) goto L_0x0133
                int r3 = r1.sourceMode
                r4 = 1
                if (r3 == r4) goto L_0x0133
                java.util.concurrent.atomic.AtomicReference<xfm> r3 = r1.upstream
                java.lang.Object r3 = r3.get()
                xfm r3 = (defpackage.xfm) r3
                long r6 = (long) r8
                r3.a(r6)
            L_0x0133:
                r4 = r0
                goto L_0x0165
            L_0x0135:
                r23 = r7
                r0 = r23
            L_0x0139:
                if (r8 == 0) goto L_0x014c
                int r3 = r1.sourceMode
                r6 = 1
                if (r3 == r6) goto L_0x014d
                java.util.concurrent.atomic.AtomicReference<xfm> r3 = r1.upstream
                java.lang.Object r3 = r3.get()
                xfm r3 = (defpackage.xfm) r3
                r3.a(r11)
                goto L_0x014d
            L_0x014c:
                r6 = 1
            L_0x014d:
                r7 = 0
                int r3 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
                if (r3 == 0) goto L_0x0157
                if (r0 == 0) goto L_0x0165
                goto L_0x0157
            L_0x0156:
                r6 = 1
            L_0x0157:
                int r0 = -r5
                int r5 = r1.addAndGet(r0)
                if (r5 == 0) goto L_0x0168
                java.lang.Object r0 = r2.get()
                r4 = r0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r4 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r4
            L_0x0165:
                r3 = 1
                goto L_0x0014
            L_0x0168:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.d():void");
        }

        public final void onError(Throwable th) {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.a(th);
                d();
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    private FlowablePublish(xfk<T> xfk, Flowable<T> flowable, AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
        this.e = xfk;
        this.b = flowable;
        this.c = atomicReference;
        this.d = i;
    }

    public static <T> ConnectableFlowable<T> a(Flowable<T> flowable, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.a((ConnectableFlowable<T>) new FlowablePublish<T>(new FlowablePublisher(atomicReference, i), flowable, atomicReference, i));
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
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r0 = r4.c
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0022
        L_0x0010:
            io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r4.c
            int r3 = r4.d
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r4.c
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0022:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r5.accept(r0)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0040
            io.reactivex.Flowable<T> r5 = r4.b
            r5.a(r0)
        L_0x0040:
            return
        L_0x0041:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.b(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.a(r5)
            goto L_0x004b
        L_0x004a:
            throw r5
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublish.d(io.reactivex.functions.Consumer):void");
    }
}
