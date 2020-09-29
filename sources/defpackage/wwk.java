package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.CompositeException;
import rx.internal.operators.NotificationLite;

/* renamed from: wwk reason: default package */
public final class wwk<T> implements defpackage.wud.b<T, wud<? extends T>> {
    private boolean a;

    /* renamed from: wwk$a */
    static final class a {
        static final wwk<Object> a = new wwk<>(false);
    }

    /* renamed from: wwk$b */
    static final class b<T> extends wuj<T> {
        final long a;
        private final c<T> b;

        b(long j, c<T> cVar) {
            this.a = j;
            this.b = cVar;
        }

        public final void setProducer(wuf wuf) {
            c<T> cVar = this.b;
            long j = this.a;
            synchronized (cVar) {
                if (cVar.c.get() == j) {
                    long j2 = cVar.e;
                    cVar.f = wuf;
                    wuf.a(j2);
                }
            }
        }

        public final void onNext(T t) {
            c<T> cVar = this.b;
            synchronized (cVar) {
                if (cVar.c.get() == this.a) {
                    cVar.d.a(this, NotificationLite.a(t));
                    cVar.a();
                }
            }
        }

        public final void onError(Throwable th) {
            boolean z;
            c<T> cVar = this.b;
            long j = this.a;
            synchronized (cVar) {
                if (cVar.c.get() == j) {
                    z = cVar.a(th);
                    cVar.g = false;
                    cVar.f = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                cVar.a();
            } else {
                c.b(th);
            }
        }

        public final void onCompleted() {
            c<T> cVar = this.b;
            long j = this.a;
            synchronized (cVar) {
                if (cVar.c.get() == j) {
                    cVar.g = false;
                    cVar.f = null;
                    cVar.a();
                }
            }
        }
    }

    /* renamed from: wwk$c */
    static final class c<T> extends wuj<wud<? extends T>> {
        private static Throwable m = new Throwable("Terminal error");
        final wuj<? super T> a;
        final xai b = new xai();
        final AtomicLong c;
        final wxz<Object> d;
        long e;
        wuf f;
        boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private volatile boolean k;
        private Throwable l;

        public final /* synthetic */ void onNext(Object obj) {
            b bVar;
            wud wud = (wud) obj;
            long incrementAndGet = this.c.incrementAndGet();
            wuk a2 = this.b.a.a();
            if (a2 != null) {
                a2.unsubscribe();
            }
            synchronized (this) {
                bVar = new b(incrementAndGet, this);
                this.g = true;
                this.f = null;
            }
            this.b.a(bVar);
            wud.a((wuj<? super T>) bVar);
        }

        c(wuj<? super T> wuj, boolean z) {
            this.a = wuj;
            this.h = z;
            this.c = new AtomicLong();
            this.d = new wxz<>(wxs.b);
        }

        public final void onError(Throwable th) {
            boolean a2;
            synchronized (this) {
                a2 = a(th);
            }
            if (a2) {
                this.k = true;
                a();
                return;
            }
            wzs.a(th);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Throwable th) {
            Throwable th2 = this.l;
            if (th2 == m) {
                return false;
            }
            if (th2 == null) {
                this.l = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).exceptions);
                arrayList.add(th);
                this.l = new CompositeException(arrayList, 0);
            } else {
                this.l = new CompositeException(th2, th);
            }
            return true;
        }

        public final void onCompleted() {
            this.k = true;
            a();
        }

        static void b(Throwable th) {
            wzs.a(th);
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j2) {
            wuf wuf;
            synchronized (this) {
                wuf = this.f;
                this.e = wuz.a(this.e, j2);
            }
            if (wuf != null) {
                wuf.a(j2);
            }
            a();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            r9 = r8.d;
            r10 = r8.c;
            r11 = r8.a;
            r15 = r0;
            r13 = r1;
            r0 = r3;
            r12 = r8.k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            r16 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
            if (r16 == r13) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
            if (r11.isUnsubscribed() == false) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            r18 = r9.isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
            if (a(r12, r15, r0, r9, r11, r18) == false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
            if (r18 != false) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            r1 = (defpackage.wwk.b) r9.poll();
            r2 = rx.internal.operators.NotificationLite.e(r9.poll());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
            if (r10.get() != r1.a) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
            r11.onNext(r2);
            r16 = r16 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
            if (r16 != r13) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
            if (r11.isUnsubscribed() == false) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
            if (a(r8.k, r15, r0, r9, r11, r9.isEmpty()) == false) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            r0 = r8.e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
            if (r0 == Long.MAX_VALUE) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
            r0 = r0 - r16;
            r8.e = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
            r13 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
            if (r8.j != false) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
            r8.i = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
            monitor-exit(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ac, code lost:
            r8.j = false;
            r12 = r8.k;
            r15 = r8.g;
            r0 = r8.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b4, code lost:
            if (r0 == null) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b8, code lost:
            if (r0 == m) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
            if (r8.h != false) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
            r8.l = m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
            monitor-exit(r19);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r19 = this;
                r8 = r19
                monitor-enter(r19)
                boolean r0 = r8.i     // Catch:{ all -> 0x00c8 }
                r1 = 1
                if (r0 == 0) goto L_0x000c
                r8.j = r1     // Catch:{ all -> 0x00c8 }
                monitor-exit(r19)     // Catch:{ all -> 0x00c8 }
                return
            L_0x000c:
                r8.i = r1     // Catch:{ all -> 0x00c8 }
                boolean r0 = r8.g     // Catch:{ all -> 0x00c8 }
                long r1 = r8.e     // Catch:{ all -> 0x00c8 }
                java.lang.Throwable r3 = r8.l     // Catch:{ all -> 0x00c8 }
                if (r3 == 0) goto L_0x0022
                java.lang.Throwable r4 = m     // Catch:{ all -> 0x00c8 }
                if (r3 == r4) goto L_0x0022
                boolean r4 = r8.h     // Catch:{ all -> 0x00c8 }
                if (r4 != 0) goto L_0x0022
                java.lang.Throwable r4 = m     // Catch:{ all -> 0x00c8 }
                r8.l = r4     // Catch:{ all -> 0x00c8 }
            L_0x0022:
                monitor-exit(r19)     // Catch:{ all -> 0x00c8 }
                wxz<java.lang.Object> r9 = r8.d
                java.util.concurrent.atomic.AtomicLong r10 = r8.c
                wuj<? super T> r11 = r8.a
                boolean r4 = r8.k
                r15 = r0
                r13 = r1
                r0 = r3
                r12 = r4
            L_0x002f:
                r1 = 0
                r16 = r1
            L_0x0033:
                int r1 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
                if (r1 == 0) goto L_0x0074
                boolean r1 = r11.isUnsubscribed()
                if (r1 == 0) goto L_0x003e
                return
            L_0x003e:
                boolean r18 = r9.isEmpty()
                r1 = r19
                r2 = r12
                r3 = r15
                r4 = r0
                r5 = r9
                r6 = r11
                r7 = r18
                boolean r1 = r1.a(r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0052
                return
            L_0x0052:
                if (r18 != 0) goto L_0x0074
                java.lang.Object r1 = r9.poll()
                wwk$b r1 = (defpackage.wwk.b) r1
                java.lang.Object r2 = r9.poll()
                java.lang.Object r2 = rx.internal.operators.NotificationLite.e(r2)
                long r3 = r10.get()
                long r5 = r1.a
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L_0x0033
                r11.onNext(r2)
                r1 = 1
                long r16 = r16 + r1
                goto L_0x0033
            L_0x0074:
                int r1 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
                if (r1 != 0) goto L_0x0092
                boolean r1 = r11.isUnsubscribed()
                if (r1 == 0) goto L_0x007f
                return
            L_0x007f:
                boolean r2 = r8.k
                boolean r7 = r9.isEmpty()
                r1 = r19
                r3 = r15
                r4 = r0
                r5 = r9
                r6 = r11
                boolean r0 = r1.a(r2, r3, r4, r5, r6, r7)
                if (r0 == 0) goto L_0x0092
                return
            L_0x0092:
                monitor-enter(r19)
                long r0 = r8.e     // Catch:{ all -> 0x00c5 }
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x00a2
                long r0 = r0 - r16
                r8.e = r0     // Catch:{ all -> 0x00c5 }
            L_0x00a2:
                r13 = r0
                boolean r0 = r8.j     // Catch:{ all -> 0x00c5 }
                r1 = 0
                if (r0 != 0) goto L_0x00ac
                r8.i = r1     // Catch:{ all -> 0x00c5 }
                monitor-exit(r19)     // Catch:{ all -> 0x00c5 }
                return
            L_0x00ac:
                r8.j = r1     // Catch:{ all -> 0x00c5 }
                boolean r12 = r8.k     // Catch:{ all -> 0x00c5 }
                boolean r15 = r8.g     // Catch:{ all -> 0x00c5 }
                java.lang.Throwable r0 = r8.l     // Catch:{ all -> 0x00c5 }
                if (r0 == 0) goto L_0x00c2
                java.lang.Throwable r1 = m     // Catch:{ all -> 0x00c5 }
                if (r0 == r1) goto L_0x00c2
                boolean r1 = r8.h     // Catch:{ all -> 0x00c5 }
                if (r1 != 0) goto L_0x00c2
                java.lang.Throwable r1 = m     // Catch:{ all -> 0x00c5 }
                r8.l = r1     // Catch:{ all -> 0x00c5 }
            L_0x00c2:
                monitor-exit(r19)     // Catch:{ all -> 0x00c5 }
                goto L_0x002f
            L_0x00c5:
                r0 = move-exception
                monitor-exit(r19)     // Catch:{ all -> 0x00c5 }
                throw r0
            L_0x00c8:
                r0 = move-exception
                monitor-exit(r19)     // Catch:{ all -> 0x00c8 }
                goto L_0x00cc
            L_0x00cb:
                throw r0
            L_0x00cc:
                goto L_0x00cb
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wwk.c.a():void");
        }

        private boolean a(boolean z, boolean z2, Throwable th, wxz<Object> wxz, wuj<? super T> wuj, boolean z3) {
            if (this.h) {
                if (z && !z2 && z3) {
                    if (th != null) {
                        wuj.onError(th);
                    } else {
                        wuj.onCompleted();
                    }
                    return true;
                }
            } else if (th != null) {
                wxz.clear();
                wuj.onError(th);
                return true;
            } else if (z && !z2 && z3) {
                wuj.onCompleted();
                return true;
            }
            return false;
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        c cVar = new c(wuj, this.a);
        wuj.add(cVar);
        cVar.a.add(cVar.b);
        cVar.a.add(xaj.a((wum) new wum() {
            public final void call() {
                c cVar = c.this;
                synchronized (cVar) {
                    cVar.f = null;
                }
            }
        }));
        cVar.a.setProducer(new wuf() {
            public final void a(long j) {
                if (j > 0) {
                    c.this.a(j);
                } else if (j < 0) {
                    StringBuilder sb = new StringBuilder("n >= 0 expected but it was ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        });
        return cVar;
    }

    public static <T> wwk<T> a(boolean z) {
        return a.a;
    }

    wwk(boolean z) {
        this.a = z;
    }
}
