package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;

public final class OperatorMerge<T> implements defpackage.xii.b<T, xii<? extends T>> {
    private boolean a;
    private int b;

    static final class MergeProducer<T> extends AtomicLong implements xik {
        private static final long serialVersionUID = -1214379189873595503L;
        final d<T> subscriber;

        public MergeProducer(d<T> dVar) {
            this.subscriber = dVar;
        }

        public final void a(long j) {
            if (j > 0) {
                if (get() != Long.MAX_VALUE) {
                    xje.a((AtomicLong) this, j);
                    this.subscriber.b();
                }
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }

    static final class a {
        static final OperatorMerge<Object> a = new OperatorMerge<>(true, Integer.MAX_VALUE);
    }

    static final class b {
        static final OperatorMerge<Object> a = new OperatorMerge<>(false, Integer.MAX_VALUE);
    }

    static final class c<T> extends xio<T> {
        private static int f = (xlx.b / 4);
        final long a;
        volatile boolean b;
        volatile xlx c;
        private d<T> d;
        private int e;

        public c(d<T> dVar, long j) {
            this.d = dVar;
            this.a = j;
        }

        public final void a(long j) {
            int i = this.e - ((int) j);
            if (i > f) {
                this.e = i;
                return;
            }
            this.e = xlx.b;
            int i2 = xlx.b - i;
            if (i2 > 0) {
                request((long) i2);
            }
        }

        public final void onCompleted() {
            this.b = true;
            this.d.b();
        }

        public final void onError(Throwable th) {
            this.d.a().offer(th);
            this.b = true;
            this.d.b();
        }

        public final void onNext(T t) {
            this.d.a(this, t);
        }

        public final void onStart() {
            this.e = xlx.b;
            request((long) xlx.b);
        }
    }

    static final class d<T> extends xio<xii<? extends T>> {
        private static c<?>[] p = new c[0];
        MergeProducer<T> a;
        private xio<? super T> b;
        private boolean c;
        private int d;
        private volatile Queue<Object> e;
        private volatile xok f;
        private volatile ConcurrentLinkedQueue<Throwable> g;
        private volatile boolean h;
        private boolean i;
        private boolean j;
        private Object k = new Object();
        private volatile c<?>[] l = p;
        private long m;
        private long n;
        private int o;
        private int q;
        private int r;

        public d(xio<? super T> xio, boolean z, int i2) {
            this.b = xio;
            this.c = z;
            this.d = i2;
            if (i2 == Integer.MAX_VALUE) {
                this.q = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.q = Math.max(1, i2 >> 1);
            request((long) i2);
        }

        private void a(T t) {
            Queue<Object> queue = this.e;
            if (queue == null) {
                int i2 = this.d;
                if (i2 == Integer.MAX_VALUE) {
                    queue = new xmg<>(xlx.b);
                } else {
                    Queue<Object> queue2 = xmp.b(i2) ? xnm.a() ? new xmy<>(i2) : new xmd<>(i2) : new SpscExactAtomicArrayQueue<>(i2);
                    queue = queue2;
                }
                this.e = queue;
            }
            if (!queue.offer(NotificationLite.a(t))) {
                unsubscribe();
                onError(OnErrorThrowable.a(new MissingBackpressureException(), t));
            }
        }

        private void a(T t, long j2) {
            boolean z = true;
            try {
                this.b.onNext(t);
            } catch (Throwable th) {
                th = th;
            }
            if (j2 != Long.MAX_VALUE) {
                this.a.addAndGet((long) -1);
            }
            int i2 = this.r + 1;
            if (i2 == this.q) {
                this.r = 0;
                request((long) i2);
            } else {
                this.r = i2;
            }
            synchronized (this) {
                if (!this.j) {
                    this.i = false;
                    return;
                }
                this.j = false;
                e();
                return;
            }
            if (!z) {
                synchronized (this) {
                    this.i = false;
                }
            }
            throw th;
        }

        private void a(c<T> cVar) {
            xlx xlx = cVar.c;
            this.f.b(cVar);
            synchronized (this.k) {
                c<?>[] cVarArr = this.l;
                int length = cVarArr.length;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (cVar.equals(cVarArr[i3])) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    if (length == 1) {
                        this.l = p;
                        return;
                    }
                    c<?>[] cVarArr2 = new c[(length - 1)];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i2);
                    System.arraycopy(cVarArr, i2 + 1, cVarArr2, i2, (length - i2) - 1);
                    this.l = cVarArr2;
                }
            }
        }

        private static void b(c<T> cVar, T t) {
            xlx xlx = cVar.c;
            if (xlx == null) {
                xlx = xlx.a();
                cVar.add(xlx);
                cVar.c = xlx;
            }
            try {
                xlx.a(NotificationLite.a(t));
            } catch (MissingBackpressureException e2) {
                cVar.unsubscribe();
                cVar.onError(e2);
            } catch (IllegalStateException e3) {
                if (!cVar.isUnsubscribed()) {
                    cVar.unsubscribe();
                    cVar.onError(e3);
                }
            }
        }

        private xok c() {
            xok xok;
            xok xok2 = this.f;
            if (xok2 != null) {
                return xok2;
            }
            boolean z = false;
            synchronized (this) {
                xok = this.f;
                if (xok == null) {
                    xok xok3 = new xok();
                    this.f = xok3;
                    xok = xok3;
                    z = true;
                }
            }
            if (z) {
                add(xok);
            }
            return xok;
        }

        private void d() {
            ArrayList arrayList = new ArrayList(this.g);
            if (arrayList.size() == 1) {
                this.b.onError((Throwable) arrayList.get(0));
            } else {
                this.b.onError(new CompositeException(arrayList, 0));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:168:0x01be, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x01bf, code lost:
            r21 = r2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x018f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7 A[Catch:{ all -> 0x0043, all -> 0x01c7, all -> 0x0056 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void e() {
            /*
                r22 = this;
                r1 = r22
                xio<? super T> r4 = r1.b     // Catch:{ all -> 0x01c7 }
            L_0x0004:
                boolean r0 = r22.f()     // Catch:{ all -> 0x01c7 }
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                java.util.Queue<java.lang.Object> r5 = r1.e     // Catch:{ all -> 0x01c7 }
                rx.internal.operators.OperatorMerge$MergeProducer<T> r0 = r1.a     // Catch:{ all -> 0x01c7 }
                long r6 = r0.get()     // Catch:{ all -> 0x01c7 }
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 != 0) goto L_0x001e
                r10 = 1
                goto L_0x001f
            L_0x001e:
                r10 = 0
            L_0x001f:
                r11 = 1
                r14 = 0
                if (r5 == 0) goto L_0x0093
                r0 = 0
            L_0x0026:
                r16 = r0
                r0 = 0
                r2 = 0
            L_0x002a:
                int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r17 <= 0) goto L_0x0073
                java.lang.Object r17 = r5.poll()     // Catch:{ all -> 0x01c7 }
                boolean r0 = r22.f()     // Catch:{ all -> 0x01c7 }
                if (r0 == 0) goto L_0x0039
                return
            L_0x0039:
                if (r17 == 0) goto L_0x0071
                java.lang.Object r0 = rx.internal.operators.NotificationLite.e(r17)     // Catch:{ all -> 0x01c7 }
                r4.onNext(r0)     // Catch:{ all -> 0x0043 }
                goto L_0x0064
            L_0x0043:
                r0 = move-exception
                r18 = r0
                boolean r0 = r1.c     // Catch:{ all -> 0x01c7 }
                if (r0 != 0) goto L_0x005b
                defpackage.xiq.b(r18)     // Catch:{ all -> 0x01c7 }
                r22.unsubscribe()     // Catch:{ all -> 0x0056 }
                r2 = r18
                r4.onError(r2)     // Catch:{ all -> 0x0056 }
                return
            L_0x0056:
                r0 = move-exception
                r21 = 1
                goto L_0x01ca
            L_0x005b:
                r8 = r18
                java.util.Queue r0 = r22.a()     // Catch:{ all -> 0x01c7 }
                r0.offer(r8)     // Catch:{ all -> 0x01c7 }
            L_0x0064:
                int r16 = r16 + 1
                int r2 = r2 + 1
                long r6 = r6 - r11
                r0 = r17
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L_0x002a
            L_0x0071:
                r0 = r17
            L_0x0073:
                if (r2 <= 0) goto L_0x0085
                if (r10 == 0) goto L_0x007d
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L_0x0085
            L_0x007d:
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r1.a     // Catch:{ all -> 0x01c7 }
                int r2 = -r2
                long r7 = (long) r2     // Catch:{ all -> 0x01c7 }
                long r6 = r6.addAndGet(r7)     // Catch:{ all -> 0x01c7 }
            L_0x0085:
                int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r2 == 0) goto L_0x0095
                if (r0 == 0) goto L_0x0095
                r0 = r16
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L_0x0026
            L_0x0093:
                r16 = 0
            L_0x0095:
                boolean r0 = r1.h     // Catch:{ all -> 0x01c7 }
                java.util.Queue<java.lang.Object> r2 = r1.e     // Catch:{ all -> 0x01c7 }
                rx.internal.operators.OperatorMerge$c<?>[] r5 = r1.l     // Catch:{ all -> 0x01c7 }
                int r8 = r5.length     // Catch:{ all -> 0x01c7 }
                if (r0 == 0) goto L_0x00bb
                if (r2 == 0) goto L_0x00a6
                boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01c7 }
                if (r0 == 0) goto L_0x00bb
            L_0x00a6:
                if (r8 != 0) goto L_0x00bb
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r1.g     // Catch:{ all -> 0x01c7 }
                if (r0 == 0) goto L_0x00b7
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01c7 }
                if (r0 == 0) goto L_0x00b3
                goto L_0x00b7
            L_0x00b3:
                r22.d()     // Catch:{ all -> 0x01c7 }
                return
            L_0x00b7:
                r4.onCompleted()     // Catch:{ all -> 0x01c7 }
                return
            L_0x00bb:
                if (r8 <= 0) goto L_0x019c
                long r11 = r1.n     // Catch:{ all -> 0x01c7 }
                int r0 = r1.o     // Catch:{ all -> 0x01c7 }
                if (r8 <= r0) goto L_0x00ce
                r2 = r5[r0]     // Catch:{ all -> 0x01c7 }
                r17 = r4
                long r3 = r2.a     // Catch:{ all -> 0x01c7 }
                int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r2 == 0) goto L_0x00f2
                goto L_0x00d0
            L_0x00ce:
                r17 = r4
            L_0x00d0:
                if (r8 > r0) goto L_0x00d3
                r0 = 0
            L_0x00d3:
                r2 = r0
                r0 = 0
            L_0x00d5:
                if (r0 >= r8) goto L_0x00e9
                r3 = r5[r2]     // Catch:{ all -> 0x01c7 }
                long r3 = r3.a     // Catch:{ all -> 0x01c7 }
                int r21 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r21 == 0) goto L_0x00e9
                int r3 = r2 + 1
                if (r3 != r8) goto L_0x00e5
                r2 = 0
                goto L_0x00e6
            L_0x00e5:
                r2 = r3
            L_0x00e6:
                int r0 = r0 + 1
                goto L_0x00d5
            L_0x00e9:
                r1.o = r2     // Catch:{ all -> 0x01c7 }
                r0 = r5[r2]     // Catch:{ all -> 0x01c7 }
                long r3 = r0.a     // Catch:{ all -> 0x01c7 }
                r1.n = r3     // Catch:{ all -> 0x01c7 }
                r0 = r2
            L_0x00f2:
                r2 = r0
                r0 = 0
                r3 = 0
            L_0x00f5:
                if (r0 >= r8) goto L_0x018f
                boolean r4 = r22.f()     // Catch:{ all -> 0x01c7 }
                if (r4 == 0) goto L_0x00fe
                return
            L_0x00fe:
                r4 = r5[r2]     // Catch:{ all -> 0x01c7 }
                r11 = 0
            L_0x0101:
                r12 = 0
            L_0x0102:
                int r21 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r21 <= 0) goto L_0x013b
                boolean r21 = r22.f()     // Catch:{ all -> 0x01c7 }
                if (r21 == 0) goto L_0x010d
                return
            L_0x010d:
                xlx r9 = r4.c     // Catch:{ all -> 0x01c7 }
                if (r9 == 0) goto L_0x013b
                java.lang.Object r11 = r9.d()     // Catch:{ all -> 0x01c7 }
                if (r11 == 0) goto L_0x013b
                java.lang.Object r9 = rx.internal.operators.NotificationLite.e(r11)     // Catch:{ all -> 0x01c7 }
                r13 = r17
                r13.onNext(r9)     // Catch:{ all -> 0x0129 }
                r19 = 1
                long r6 = r6 - r19
                int r12 = r12 + 1
                r17 = r13
                goto L_0x0102
            L_0x0129:
                r0 = move-exception
                r2 = r0
                defpackage.xiq.b(r2)     // Catch:{ all -> 0x0056 }
                r13.onError(r2)     // Catch:{ all -> 0x0135 }
                r22.unsubscribe()     // Catch:{ all -> 0x0056 }
                return
            L_0x0135:
                r0 = move-exception
                r2 = r0
                r22.unsubscribe()     // Catch:{ all -> 0x0056 }
                throw r2     // Catch:{ all -> 0x0056 }
            L_0x013b:
                r13 = r17
                r19 = 1
                if (r12 <= 0) goto L_0x0157
                if (r10 != 0) goto L_0x014c
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r1.a     // Catch:{ all -> 0x01c7 }
                int r7 = -r12
                long r14 = (long) r7     // Catch:{ all -> 0x01c7 }
                long r6 = r6.addAndGet(r14)     // Catch:{ all -> 0x01c7 }
                goto L_0x0151
            L_0x014c:
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0151:
                long r14 = (long) r12     // Catch:{ all -> 0x01c7 }
                r4.a(r14)     // Catch:{ all -> 0x01c7 }
                r14 = 0
            L_0x0157:
                int r9 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r9 == 0) goto L_0x0162
                if (r11 == 0) goto L_0x0162
                r17 = r13
                r14 = 0
                goto L_0x0101
            L_0x0162:
                boolean r9 = r4.b     // Catch:{ all -> 0x01c7 }
                xlx r11 = r4.c     // Catch:{ all -> 0x01c7 }
                if (r9 == 0) goto L_0x017d
                if (r11 == 0) goto L_0x0170
                boolean r9 = r11.c()     // Catch:{ all -> 0x01c7 }
                if (r9 == 0) goto L_0x017d
            L_0x0170:
                r1.a(r4)     // Catch:{ all -> 0x01c7 }
                boolean r3 = r22.f()     // Catch:{ all -> 0x01c7 }
                if (r3 == 0) goto L_0x017a
                return
            L_0x017a:
                int r16 = r16 + 1
                r3 = 1
            L_0x017d:
                r11 = 0
                int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r4 == 0) goto L_0x0191
                int r2 = r2 + 1
                if (r2 != r8) goto L_0x0188
                r2 = 0
            L_0x0188:
                int r0 = r0 + 1
                r14 = r11
                r17 = r13
                goto L_0x00f5
            L_0x018f:
                r13 = r17
            L_0x0191:
                r1.o = r2     // Catch:{ all -> 0x01c7 }
                r0 = r5[r2]     // Catch:{ all -> 0x01c7 }
                long r4 = r0.a     // Catch:{ all -> 0x01c7 }
                r1.n = r4     // Catch:{ all -> 0x01c7 }
                r0 = r16
                goto L_0x01a0
            L_0x019c:
                r13 = r4
                r0 = r16
                r3 = 0
            L_0x01a0:
                if (r0 <= 0) goto L_0x01a6
                long r4 = (long) r0     // Catch:{ all -> 0x01c7 }
                r1.request(r4)     // Catch:{ all -> 0x01c7 }
            L_0x01a6:
                if (r3 != 0) goto L_0x01c4
                monitor-enter(r22)     // Catch:{ all -> 0x01c7 }
                boolean r0 = r1.j     // Catch:{ all -> 0x01ba }
                if (r0 != 0) goto L_0x01b5
                r2 = 0
                r1.i = r2     // Catch:{ all -> 0x01b2 }
                monitor-exit(r22)     // Catch:{ all -> 0x01b2 }
                return
            L_0x01b2:
                r0 = move-exception
                r2 = 1
                goto L_0x01bc
            L_0x01b5:
                r2 = 0
                r1.j = r2     // Catch:{ all -> 0x01ba }
                monitor-exit(r22)     // Catch:{ all -> 0x01ba }
                goto L_0x01c4
            L_0x01ba:
                r0 = move-exception
                r2 = 0
            L_0x01bc:
                monitor-exit(r22)     // Catch:{ all -> 0x01c2 }
                throw r0     // Catch:{ all -> 0x01be }
            L_0x01be:
                r0 = move-exception
                r21 = r2
                goto L_0x01ca
            L_0x01c2:
                r0 = move-exception
                goto L_0x01bc
            L_0x01c4:
                r4 = r13
                goto L_0x0004
            L_0x01c7:
                r0 = move-exception
                r21 = 0
            L_0x01ca:
                if (r21 != 0) goto L_0x01d5
                monitor-enter(r22)
                r2 = 0
                r1.i = r2     // Catch:{ all -> 0x01d2 }
                monitor-exit(r22)     // Catch:{ all -> 0x01d2 }
                goto L_0x01d5
            L_0x01d2:
                r0 = move-exception
                monitor-exit(r22)     // Catch:{ all -> 0x01d2 }
                throw r0
            L_0x01d5:
                goto L_0x01d7
            L_0x01d6:
                throw r0
            L_0x01d7:
                goto L_0x01d6
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.d.e():void");
        }

        private boolean f() {
            if (this.b.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.g;
            if (this.c || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                d();
                return true;
            } finally {
                unsubscribe();
            }
        }

        /* access modifiers changed from: 0000 */
        public final Queue<Throwable> a() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.g;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.g;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.g = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x007b, code lost:
            e();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(rx.internal.operators.OperatorMerge.c<T> r8, T r9) {
            /*
                r7 = this;
                rx.internal.operators.OperatorMerge$MergeProducer<T> r0 = r7.a
                long r0 = r0.get()
                r2 = 0
                r4 = 1
                r5 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L_0x0027
                monitor-enter(r7)
                rx.internal.operators.OperatorMerge$MergeProducer<T> r0 = r7.a     // Catch:{ all -> 0x0024 }
                long r0 = r0.get()     // Catch:{ all -> 0x0024 }
                boolean r6 = r7.i     // Catch:{ all -> 0x0024 }
                if (r6 != 0) goto L_0x0021
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L_0x0021
                r7.i = r4     // Catch:{ all -> 0x0024 }
                r2 = 1
                goto L_0x0022
            L_0x0021:
                r2 = 0
            L_0x0022:
                monitor-exit(r7)     // Catch:{ all -> 0x0024 }
                goto L_0x0028
            L_0x0024:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0024 }
                throw r8
            L_0x0027:
                r2 = 0
            L_0x0028:
                if (r2 == 0) goto L_0x008f
                xlx r2 = r8.c
                if (r2 == 0) goto L_0x003c
                boolean r2 = r2.c()
                if (r2 == 0) goto L_0x0035
                goto L_0x003c
            L_0x0035:
                b(r8, r9)
                r7.e()
                goto L_0x0077
            L_0x003c:
                xio<? super T> r2 = r7.b     // Catch:{ all -> 0x0042 }
                r2.onNext(r9)     // Catch:{ all -> 0x0042 }
                goto L_0x005a
            L_0x0042:
                r9 = move-exception
                boolean r2 = r7.c     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0053
                defpackage.xiq.b(r9)     // Catch:{ all -> 0x0082 }
                r8.unsubscribe()     // Catch:{ all -> 0x0051 }
                r8.onError(r9)     // Catch:{ all -> 0x0051 }
                goto L_0x0077
            L_0x0051:
                r8 = move-exception
                goto L_0x0084
            L_0x0053:
                java.util.Queue r2 = r7.a()     // Catch:{ all -> 0x0082 }
                r2.offer(r9)     // Catch:{ all -> 0x0082 }
            L_0x005a:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r9 == 0) goto L_0x006a
                rx.internal.operators.OperatorMerge$MergeProducer<T> r9 = r7.a     // Catch:{ all -> 0x0082 }
                r0 = -1
                long r0 = (long) r0     // Catch:{ all -> 0x0082 }
                r9.addAndGet(r0)     // Catch:{ all -> 0x0082 }
            L_0x006a:
                r0 = 1
                r8.a(r0)     // Catch:{ all -> 0x0082 }
                monitor-enter(r7)     // Catch:{ all -> 0x0082 }
                boolean r8 = r7.j     // Catch:{ all -> 0x007f }
                if (r8 != 0) goto L_0x0078
                r7.i = r5     // Catch:{ all -> 0x007f }
                monitor-exit(r7)     // Catch:{ all -> 0x007f }
            L_0x0077:
                return
            L_0x0078:
                r7.j = r5     // Catch:{ all -> 0x007f }
                monitor-exit(r7)     // Catch:{ all -> 0x007f }
                r7.e()
                goto L_0x0095
            L_0x007f:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x007f }
                throw r8     // Catch:{ all -> 0x0051 }
            L_0x0082:
                r8 = move-exception
                r4 = 0
            L_0x0084:
                if (r4 != 0) goto L_0x008e
                monitor-enter(r7)
                r7.i = r5     // Catch:{ all -> 0x008b }
                monitor-exit(r7)     // Catch:{ all -> 0x008b }
                goto L_0x008e
            L_0x008b:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x008b }
                throw r8
            L_0x008e:
                throw r8
            L_0x008f:
                b(r8, r9)
                r7.b()
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.d.a(rx.internal.operators.OperatorMerge$c, java.lang.Object):void");
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            synchronized (this) {
                if (this.i) {
                    this.j = true;
                    return;
                }
                this.i = true;
                e();
            }
        }

        public final void onCompleted() {
            this.h = true;
            b();
        }

        public final void onError(Throwable th) {
            a().offer(th);
            this.h = true;
            b();
        }

        public final /* synthetic */ void onNext(Object obj) {
            xii xii = (xii) obj;
            if (xii != null) {
                boolean z = false;
                if (xii == EmptyObservableHolder.a()) {
                    int i2 = this.r + 1;
                    if (i2 == this.q) {
                        this.r = 0;
                        request((long) i2);
                    } else {
                        this.r = i2;
                    }
                } else if (xii instanceof ScalarSynchronousObservable) {
                    T t = ((ScalarSynchronousObservable) xii).a;
                    long j2 = this.a.get();
                    if (j2 != 0) {
                        synchronized (this) {
                            j2 = this.a.get();
                            if (!this.i && j2 != 0) {
                                this.i = true;
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Queue<Object> queue = this.e;
                        if (queue == null || queue.isEmpty()) {
                            a(t, j2);
                        } else {
                            a(t);
                            e();
                        }
                    } else {
                        a(t);
                        b();
                    }
                } else {
                    long j3 = this.m;
                    this.m = 1 + j3;
                    c<?> cVar = new c<>(this, j3);
                    c().a((xip) cVar);
                    synchronized (this.k) {
                        c<?>[] cVarArr = this.l;
                        int length = cVarArr.length;
                        c<?>[] cVarArr2 = new c[(length + 1)];
                        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                        cVarArr2[length] = cVar;
                        this.l = cVarArr2;
                    }
                    xii.a((xio<? super T>) cVar);
                    b();
                }
            }
        }
    }

    OperatorMerge(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static <T> OperatorMerge<T> a(boolean z) {
        return z ? a.a : b.a;
    }

    public static <T> OperatorMerge<T> a(boolean z, int i) {
        if (i > 0) {
            return i == Integer.MAX_VALUE ? a(false) : new OperatorMerge<>(false, i);
        }
        StringBuilder sb = new StringBuilder("maxConcurrent > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        d dVar = new d(xio, this.a, this.b);
        MergeProducer<T> mergeProducer = new MergeProducer<>(dVar);
        dVar.a = mergeProducer;
        xio.add(dVar);
        xio.setProducer(mergeProducer);
        return dVar;
    }
}
