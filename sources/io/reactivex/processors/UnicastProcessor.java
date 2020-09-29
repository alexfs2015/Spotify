package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    final SpscLinkedArrayQueue<T> b;
    final AtomicReference<wrg<? super T>> c;
    volatile boolean d;
    final BasicIntQueueSubscription<T> e;
    final AtomicLong f;
    boolean g;
    private AtomicReference<Runnable> h;
    private boolean i;
    private volatile boolean j;
    private Throwable k;
    private AtomicBoolean l;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        public final T bc_() {
            return UnicastProcessor.this.b.bc_();
        }

        public final boolean d() {
            return UnicastProcessor.this.b.d();
        }

        public final void e() {
            UnicastProcessor.this.b.e();
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.g = true;
            return 2;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(UnicastProcessor.this.f, j);
                UnicastProcessor.this.n();
            }
        }

        public final void a() {
            if (!UnicastProcessor.this.d) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                unicastProcessor.d = true;
                unicastProcessor.m();
                if (!UnicastProcessor.this.g && UnicastProcessor.this.e.getAndIncrement() == 0) {
                    UnicastProcessor.this.b.e();
                    UnicastProcessor.this.c.lazySet(null);
                }
            }
        }
    }

    public static <T> UnicastProcessor<T> k() {
        return new UnicastProcessor<>(Flowable.a);
    }

    public static <T> UnicastProcessor<T> b(int i2) {
        return new UnicastProcessor<>(8);
    }

    private UnicastProcessor(int i2) {
        this(i2, null, true);
    }

    private UnicastProcessor(int i2, Runnable runnable, boolean z) {
        this.b = new SpscLinkedArrayQueue<>(ObjectHelper.a(i2, "capacityHint"));
        this.h = new AtomicReference<>(null);
        this.i = true;
        this.c = new AtomicReference<>();
        this.l = new AtomicBoolean();
        this.e = new UnicastQueueSubscription();
        this.f = new AtomicLong();
    }

    /* access modifiers changed from: 0000 */
    public final void m() {
        Runnable runnable = (Runnable) this.h.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r17 = this;
            r6 = r17
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r6.e
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference<wrg<? super T>> r0 = r6.c
            java.lang.Object r0 = r0.get()
            wrg r0 = (defpackage.wrg) r0
            r7 = 1
            r8 = r0
            r0 = 1
        L_0x0016:
            if (r8 == 0) goto L_0x00dd
            boolean r0 = r6.g
            if (r0 == 0) goto L_0x006b
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r6.b
            boolean r1 = r6.i
            r1 = r1 ^ r7
        L_0x0021:
            boolean r2 = r6.d
            r3 = 0
            if (r2 == 0) goto L_0x0030
            r0.e()
            java.util.concurrent.atomic.AtomicReference<wrg<? super T>> r0 = r6.c
            r0.lazySet(r3)
            goto L_0x00dc
        L_0x0030:
            boolean r2 = r6.j
            if (r1 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x0049
            java.lang.Throwable r4 = r6.k
            if (r4 == 0) goto L_0x0049
            r0.e()
            java.util.concurrent.atomic.AtomicReference<wrg<? super T>> r0 = r6.c
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.k
            r8.onError(r0)
            goto L_0x00dc
        L_0x0049:
            r8.b_(r3)
            if (r2 == 0) goto L_0x0060
            java.util.concurrent.atomic.AtomicReference<wrg<? super T>> r0 = r6.c
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.k
            if (r0 == 0) goto L_0x005b
            r8.onError(r0)
            goto L_0x006a
        L_0x005b:
            r8.c()
            goto L_0x00dc
        L_0x0060:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r2 = r6.e
            int r3 = -r7
            int r7 = r2.addAndGet(r3)
            if (r7 == 0) goto L_0x006a
            goto L_0x0021
        L_0x006a:
            return
        L_0x006b:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r9 = r6.b
            boolean r0 = r6.i
            r10 = r0 ^ 1
            r11 = 1
        L_0x0072:
            java.util.concurrent.atomic.AtomicLong r0 = r6.f
            long r12 = r0.get()
            r4 = 0
        L_0x007a:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            boolean r2 = r6.j
            java.lang.Object r3 = r9.bc_()
            if (r3 != 0) goto L_0x0089
            r16 = 1
            goto L_0x008c
        L_0x0089:
            r0 = 0
            r16 = 0
        L_0x008c:
            r0 = r17
            r1 = r10
            r7 = r3
            r3 = r16
            r14 = r4
            r4 = r8
            r5 = r9
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x00dc
            if (r16 != 0) goto L_0x00a7
            r8.b_(r7)
            r0 = 1
            long r4 = r14 + r0
            r7 = 1
            goto L_0x007a
        L_0x00a6:
            r14 = r4
        L_0x00a7:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            boolean r2 = r6.j
            boolean r3 = r9.d()
            r0 = r17
            r1 = r10
            r4 = r8
            r5 = r9
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x00dc
        L_0x00bc:
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00d1
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00d1
            java.util.concurrent.atomic.AtomicLong r0 = r6.f
            long r1 = -r14
            r0.addAndGet(r1)
        L_0x00d1:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r6.e
            int r1 = -r11
            int r11 = r0.addAndGet(r1)
            if (r11 == 0) goto L_0x00dc
            r7 = 1
            goto L_0x0072
        L_0x00dc:
            return
        L_0x00dd:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r1 = r6.e
            int r0 = -r0
            int r0 = r1.addAndGet(r0)
            if (r0 == 0) goto L_0x00f2
            java.util.concurrent.atomic.AtomicReference<wrg<? super T>> r1 = r6.c
            java.lang.Object r1 = r1.get()
            r8 = r1
            wrg r8 = (defpackage.wrg) r8
            r7 = 1
            goto L_0x0016
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.UnicastProcessor.n():void");
    }

    private boolean a(boolean z, boolean z2, boolean z3, wrg<? super T> wrg, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.d) {
            spscLinkedArrayQueue.e();
            this.c.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.k != null) {
                spscLinkedArrayQueue.e();
                this.c.lazySet(null);
                wrg.onError(this.k);
                return true;
            } else if (z3) {
                Throwable th = this.k;
                this.c.lazySet(null);
                if (th != null) {
                    wrg.onError(th);
                } else {
                    wrg.c();
                }
                return true;
            }
        }
        return false;
    }

    public final void a(wrh wrh) {
        if (this.j || this.d) {
            wrh.a();
        } else {
            wrh.a(Long.MAX_VALUE);
        }
    }

    public final void b_(T t) {
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.j && !this.d) {
            this.b.a(t);
            n();
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.j || this.d) {
            RxJavaPlugins.a(th);
            return;
        }
        this.k = th;
        this.j = true;
        m();
        n();
    }

    public final void c() {
        if (!this.j && !this.d) {
            this.j = true;
            m();
            n();
        }
    }

    public final void a(wrg<? super T> wrg) {
        if (this.l.get() || !this.l.compareAndSet(false, true)) {
            EmptySubscription.a(new IllegalStateException("This processor allows only a single Subscriber"), wrg);
            return;
        }
        wrg.a(this.e);
        this.c.set(wrg);
        if (this.d) {
            this.c.lazySet(null);
        } else {
            n();
        }
    }
}
