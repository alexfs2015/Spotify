package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.MissingBackpressureException;

public final class OperatorPublish<T> extends xno<T> {
    private xii<? extends T> a;
    private AtomicReference<a<T>> b;

    static final class InnerProducer<T> extends AtomicLong implements xik, xip {
        private static final long serialVersionUID = -4453897557930727610L;
        final xio<? super T> child;
        final a<T> parent;

        public InnerProducer(a<T> aVar, xio<? super T> xio) {
            this.parent = aVar;
            this.child = xio;
            lazySet(-4611686018427387904L);
        }

        public final void a(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 >= 0 && j == 0) {
                            return;
                        }
                        if (j2 == -4611686018427387904L) {
                            j3 = j;
                        } else {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                this.parent.b();
            }
        }

        public final long b(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                } else if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                } else {
                    j3 = j2 - 1;
                    if (j3 < 0) {
                        StringBuilder sb = new StringBuilder("More produced (");
                        sb.append(1);
                        sb.append(") than requested (");
                        sb.append(j2);
                        sb.append(")");
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public final void unsubscribe() {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                a<T> aVar = this.parent;
                do {
                    innerProducerArr = (InnerProducer[]) aVar.d.get();
                    if (innerProducerArr == a.b || innerProducerArr == a.c) {
                        break;
                    }
                    int i = -1;
                    int length = innerProducerArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerProducerArr[i2].equals(this)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i < 0) {
                        break;
                    } else if (length == 1) {
                        innerProducerArr2 = a.b;
                    } else {
                        InnerProducer[] innerProducerArr3 = new InnerProducer[(length - 1)];
                        System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                        System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                        innerProducerArr2 = innerProducerArr3;
                    }
                } while (!aVar.d.compareAndSet(innerProducerArr, innerProducerArr2));
                this.parent.b();
            }
        }
    }

    static final class a<T> extends xio<T> implements xip {
        static final InnerProducer[] b = new InnerProducer[0];
        static final InnerProducer[] c = new InnerProducer[0];
        final AtomicReference<a<T>> a;
        final AtomicReference<InnerProducer[]> d;
        final AtomicBoolean e;
        private Queue<Object> f;
        private volatile Object g;
        private boolean h;
        private boolean i;

        public a(AtomicReference<a<T>> atomicReference) {
            this.f = xnm.a() ? new xmy<>(xlx.b) : new xmd<>(xlx.b);
            this.d = new AtomicReference<>(b);
            this.a = atomicReference;
            this.e = new AtomicBoolean();
        }

        private boolean a(Object obj, boolean z) {
            int i2 = 0;
            if (obj != null) {
                if (!NotificationLite.b(obj)) {
                    Throwable f2 = NotificationLite.f(obj);
                    this.a.compareAndSet(this, null);
                    try {
                        InnerProducer[] innerProducerArr = (InnerProducer[]) this.d.getAndSet(c);
                        int length = innerProducerArr.length;
                        while (i2 < length) {
                            innerProducerArr[i2].child.onError(f2);
                            i2++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                } else if (z) {
                    this.a.compareAndSet(this, null);
                    try {
                        InnerProducer[] innerProducerArr2 = (InnerProducer[]) this.d.getAndSet(c);
                        int length2 = innerProducerArr2.length;
                        while (i2 < length2) {
                            innerProducerArr2[i2].child.onCompleted();
                            i2++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            add(xon.a((xir) new xir() {
                public final void call() {
                    a.this.d.getAndSet(a.c);
                    a.this.a.compareAndSet(a.this, null);
                }
            }));
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = r1.g;
            r4 = r1.f.isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            if (a(r0, r4) == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            if (r4 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            r5 = (rx.internal.operators.OperatorPublish.InnerProducer[]) r1.d.get();
            r0 = r5.length;
            r8 = r5.length;
            r9 = Long.MAX_VALUE;
            r6 = 0;
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (r6 >= r8) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            r13 = r5[r6].get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
            if (r13 < 0) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
            r9 = java.lang.Math.min(r9, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
            if (r13 != Long.MIN_VALUE) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            if (r0 != r7) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
            r0 = r1.g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
            if (r1.f.poll() != null) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
            if (a(r0, r4) == false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
            request(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
            r0 = r4;
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
            r6 = (long) r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
            if (r6 >= r9) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
            r0 = r1.g;
            r8 = r1.f.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
            if (r8 != null) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
            if (a(r0, r15) == false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
            if (r15 != false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
            r6 = rx.internal.operators.NotificationLite.e(r8);
            r7 = r5.length;
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
            if (r8 >= r7) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
            r2 = r5[r8];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x009d, code lost:
            if (r2.get() <= 0) goto L_0x00b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            r2.child.onNext(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r2.b(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a8, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
            r2.unsubscribe();
            defpackage.xiq.a(r0, r2.child, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
            r4 = r4 + 1;
            r0 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ba, code lost:
            r15 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bb, code lost:
            if (r4 <= 0) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bd, code lost:
            request(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c2, code lost:
            if (r9 == 0) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c4, code lost:
            if (r15 == false) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c6, code lost:
            monitor-enter(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c9, code lost:
            if (r1.i != false) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cb, code lost:
            r1.h = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ce, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x00cf, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d0, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            r1.i = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d4, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d8, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d9, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x00dc, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x00de, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x00e1, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x00e2, code lost:
            if (r2 == false) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x00e4, code lost:
            monitor-enter(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r1.h = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x00ec, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r18 = this;
                r1 = r18
                monitor-enter(r18)
                boolean r0 = r1.h     // Catch:{ all -> 0x00ed }
                r2 = 1
                if (r0 == 0) goto L_0x000c
                r1.i = r2     // Catch:{ all -> 0x00ed }
                monitor-exit(r18)     // Catch:{ all -> 0x00ed }
                return
            L_0x000c:
                r1.h = r2     // Catch:{ all -> 0x00ed }
                r3 = 0
                r1.i = r3     // Catch:{ all -> 0x00ed }
                monitor-exit(r18)     // Catch:{ all -> 0x00ed }
            L_0x0012:
                java.lang.Object r0 = r1.g     // Catch:{ all -> 0x00e0 }
                java.util.Queue<java.lang.Object> r4 = r1.f     // Catch:{ all -> 0x00e0 }
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00e0 }
                boolean r0 = r1.a(r0, r4)     // Catch:{ all -> 0x00e0 }
                if (r0 == 0) goto L_0x0021
                return
            L_0x0021:
                if (r4 != 0) goto L_0x00c6
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish$InnerProducer[]> r0 = r1.d     // Catch:{ all -> 0x00e0 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e0 }
                r5 = r0
                rx.internal.operators.OperatorPublish$InnerProducer[] r5 = (rx.internal.operators.OperatorPublish.InnerProducer[]) r5     // Catch:{ all -> 0x00e0 }
                int r0 = r5.length     // Catch:{ all -> 0x00e0 }
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = r5.length     // Catch:{ all -> 0x00e0 }
                r9 = r6
                r6 = 0
                r7 = 0
            L_0x0036:
                r11 = 0
                if (r6 >= r8) goto L_0x0054
                r13 = r5[r6]     // Catch:{ all -> 0x00e0 }
                long r13 = r13.get()     // Catch:{ all -> 0x00e0 }
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 < 0) goto L_0x0049
                long r9 = java.lang.Math.min(r9, r13)     // Catch:{ all -> 0x00e0 }
                goto L_0x0051
            L_0x0049:
                r11 = -9223372036854775808
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 != 0) goto L_0x0051
                int r7 = r7 + 1
            L_0x0051:
                int r6 = r6 + 1
                goto L_0x0036
            L_0x0054:
                r13 = 1
                if (r0 != r7) goto L_0x0070
                java.lang.Object r0 = r1.g     // Catch:{ all -> 0x00e0 }
                java.util.Queue<java.lang.Object> r4 = r1.f     // Catch:{ all -> 0x00e0 }
                java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00e0 }
                if (r4 != 0) goto L_0x0064
                r4 = 1
                goto L_0x0065
            L_0x0064:
                r4 = 0
            L_0x0065:
                boolean r0 = r1.a(r0, r4)     // Catch:{ all -> 0x00e0 }
                if (r0 == 0) goto L_0x006c
                return
            L_0x006c:
                r1.request(r13)     // Catch:{ all -> 0x00e0 }
                goto L_0x0012
            L_0x0070:
                r0 = r4
                r4 = 0
            L_0x0072:
                long r6 = (long) r4     // Catch:{ all -> 0x00e0 }
                int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r8 >= 0) goto L_0x00ba
                java.lang.Object r0 = r1.g     // Catch:{ all -> 0x00e0 }
                java.util.Queue<java.lang.Object> r8 = r1.f     // Catch:{ all -> 0x00e0 }
                java.lang.Object r8 = r8.poll()     // Catch:{ all -> 0x00e0 }
                if (r8 != 0) goto L_0x0083
                r15 = 1
                goto L_0x0084
            L_0x0083:
                r15 = 0
            L_0x0084:
                boolean r0 = r1.a(r0, r15)     // Catch:{ all -> 0x00e0 }
                if (r0 == 0) goto L_0x008b
                return
            L_0x008b:
                if (r15 != 0) goto L_0x00bb
                java.lang.Object r6 = rx.internal.operators.NotificationLite.e(r8)     // Catch:{ all -> 0x00e0 }
                int r7 = r5.length     // Catch:{ all -> 0x00e0 }
                r8 = 0
            L_0x0093:
                if (r8 >= r7) goto L_0x00b5
                r2 = r5[r8]     // Catch:{ all -> 0x00e0 }
                long r16 = r2.get()     // Catch:{ all -> 0x00e0 }
                int r0 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b1
                xio<? super T> r0 = r2.child     // Catch:{ all -> 0x00a8 }
                r0.onNext(r6)     // Catch:{ all -> 0x00a8 }
                r2.b(r13)     // Catch:{ all -> 0x00e0 }
                goto L_0x00b1
            L_0x00a8:
                r0 = move-exception
                r2.unsubscribe()     // Catch:{ all -> 0x00e0 }
                xio<? super T> r2 = r2.child     // Catch:{ all -> 0x00e0 }
                defpackage.xiq.a(r0, r2, r6)     // Catch:{ all -> 0x00e0 }
            L_0x00b1:
                int r8 = r8 + 1
                r2 = 1
                goto L_0x0093
            L_0x00b5:
                int r4 = r4 + 1
                r0 = r15
                r2 = 1
                goto L_0x0072
            L_0x00ba:
                r15 = r0
            L_0x00bb:
                if (r4 <= 0) goto L_0x00c0
                r1.request(r6)     // Catch:{ all -> 0x00e0 }
            L_0x00c0:
                int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x00c6
                if (r15 == 0) goto L_0x00d5
            L_0x00c6:
                monitor-enter(r18)     // Catch:{ all -> 0x00e0 }
                boolean r0 = r1.i     // Catch:{ all -> 0x00d8 }
                if (r0 != 0) goto L_0x00d2
                r1.h = r3     // Catch:{ all -> 0x00d8 }
                monitor-exit(r18)     // Catch:{ all -> 0x00cf }
                return
            L_0x00cf:
                r0 = move-exception
                r2 = 1
                goto L_0x00da
            L_0x00d2:
                r1.i = r3     // Catch:{ all -> 0x00d8 }
                monitor-exit(r18)     // Catch:{ all -> 0x00d8 }
            L_0x00d5:
                r2 = 1
                goto L_0x0012
            L_0x00d8:
                r0 = move-exception
                r2 = 0
            L_0x00da:
                monitor-exit(r18)     // Catch:{ all -> 0x00de }
                throw r0     // Catch:{ all -> 0x00dc }
            L_0x00dc:
                r0 = move-exception
                goto L_0x00e2
            L_0x00de:
                r0 = move-exception
                goto L_0x00da
            L_0x00e0:
                r0 = move-exception
                r2 = 0
            L_0x00e2:
                if (r2 != 0) goto L_0x00ec
                monitor-enter(r18)
                r1.h = r3     // Catch:{ all -> 0x00e9 }
                monitor-exit(r18)     // Catch:{ all -> 0x00e9 }
                goto L_0x00ec
            L_0x00e9:
                r0 = move-exception
                monitor-exit(r18)     // Catch:{ all -> 0x00e9 }
                throw r0
            L_0x00ec:
                throw r0
            L_0x00ed:
                r0 = move-exception
                monitor-exit(r18)     // Catch:{ all -> 0x00ed }
                goto L_0x00f1
            L_0x00f0:
                throw r0
            L_0x00f1:
                goto L_0x00f0
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorPublish.a.b():void");
        }

        public final void onCompleted() {
            if (this.g == null) {
                this.g = NotificationLite.a();
                b();
            }
        }

        public final void onError(Throwable th) {
            if (this.g == null) {
                this.g = NotificationLite.a(th);
                b();
            }
        }

        public final void onNext(T t) {
            if (!this.f.offer(NotificationLite.a(t))) {
                onError(new MissingBackpressureException());
            } else {
                b();
            }
        }

        public final void onStart() {
            request((long) xlx.b);
        }
    }

    public OperatorPublish(defpackage.xii.a<T> aVar, xii<? extends T> xii, AtomicReference<a<T>> atomicReference) {
        super(aVar);
        this.a = xii;
        this.b = atomicReference;
    }

    public static <T, R> xii<R> a(final xii<? extends T> xii, final xiy<? super xii<T>, ? extends xii<R>> xiy, boolean z) {
        return b((defpackage.xii.a<T>) new defpackage.xii.a<R>(false) {
            public final /* synthetic */ void call(Object obj) {
                final xio xio = (xio) obj;
                final OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(xlx.b, false);
                AnonymousClass1 r1 = new xio<R>() {
                    public final void onCompleted() {
                        onSubscribePublishMulticast.unsubscribe();
                        xio.onCompleted();
                    }

                    public final void onError(Throwable th) {
                        onSubscribePublishMulticast.unsubscribe();
                        xio.onError(th);
                    }

                    public final void onNext(R r) {
                        xio.onNext(r);
                    }

                    public final void setProducer(xik xik) {
                        xio.setProducer(xik);
                    }
                };
                xio.add(onSubscribePublishMulticast);
                xio.add(r1);
                ((xii) xiy.call(xii.b((defpackage.xii.a<T>) onSubscribePublishMulticast))).a((xio<? super T>) r1);
                xii.a((xio<? super T>) onSubscribePublishMulticast.parent);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.xis<? super defpackage.xip> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish$a<T>> r0 = r4.b
            java.lang.Object r0 = r0.get()
            rx.internal.operators.OperatorPublish$a r0 = (rx.internal.operators.OperatorPublish.a) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isUnsubscribed()
            if (r1 == 0) goto L_0x0023
        L_0x0010:
            rx.internal.operators.OperatorPublish$a r1 = new rx.internal.operators.OperatorPublish$a
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish$a<T>> r2 = r4.b
            r1.<init>(r2)
            r1.a()
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorPublish$a<T>> r2 = r4.b
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.e
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.e
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            r5.call(r0)
            if (r2 == 0) goto L_0x0041
            xii<? extends T> r5 = r4.a
            r5.a(r0)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorPublish.d(xis):void");
    }
}
