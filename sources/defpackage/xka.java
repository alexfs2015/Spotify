package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xka reason: default package */
public final class xka<T> implements b<T, T> {
    final long a;
    final TimeUnit b;
    private xil c;

    /* renamed from: xka$a */
    static final class a<T> {
        int a;
        T b;
        boolean c;
        boolean d;
        boolean e;

        a() {
        }

        public final synchronized int a(T t) {
            int i;
            this.b = t;
            this.c = true;
            i = this.a + 1;
            this.a = i;
            return i;
        }

        public final synchronized void a() {
            this.a++;
            this.b = null;
            this.c = false;
        }
    }

    public xka(long j, TimeUnit timeUnit, xil xil) {
        this.a = j;
        this.b = timeUnit;
        this.c = xil;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        final defpackage.xil.a c2 = this.c.c();
        final xnt xnt = new xnt(xio);
        final xom xom = new xom();
        xnt.add(c2);
        xnt.add(xom);
        AnonymousClass1 r0 = new xio<T>(xio) {
            final a<T> a = new a<>();
            final xio<?> b = this;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
                if (r4 == false) goto L_0x0026;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
                r1.onNext(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
                defpackage.xiq.a(r0, r6, r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
                r1.onCompleted();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onCompleted() {
                /*
                    r6 = this;
                    xka$a<T> r0 = r6.a
                    xnt r1 = r5
                    monitor-enter(r0)
                    boolean r2 = r0.e     // Catch:{ all -> 0x002a }
                    r3 = 1
                    if (r2 == 0) goto L_0x000e
                    r0.d = r3     // Catch:{ all -> 0x002a }
                    monitor-exit(r0)     // Catch:{ all -> 0x002a }
                    return
                L_0x000e:
                    T r2 = r0.b     // Catch:{ all -> 0x002a }
                    boolean r4 = r0.c     // Catch:{ all -> 0x002a }
                    r5 = 0
                    r0.b = r5     // Catch:{ all -> 0x002a }
                    r5 = 0
                    r0.c = r5     // Catch:{ all -> 0x002a }
                    r0.e = r3     // Catch:{ all -> 0x002a }
                    monitor-exit(r0)     // Catch:{ all -> 0x002a }
                    if (r4 == 0) goto L_0x0026
                    r1.onNext(r2)     // Catch:{ all -> 0x0021 }
                    goto L_0x0026
                L_0x0021:
                    r0 = move-exception
                    defpackage.xiq.a(r0, r6, r2)
                    return
                L_0x0026:
                    r1.onCompleted()
                    return
                L_0x002a:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x002a }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xka.AnonymousClass1.onCompleted():void");
            }

            public final void onError(Throwable th) {
                xnt.onError(th);
                unsubscribe();
                this.a.a();
            }

            public final void onNext(T t) {
                final int a2 = this.a.a(t);
                xom.a(c2.a(new xir() {
                    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
                        r2.onNext(r1);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
                        monitor-enter(r0);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
                        if (r0.d != false) goto L_0x0034;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
                        r0.e = false;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
                        monitor-exit(r0);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
                        return;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
                        monitor-exit(r0);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
                        r2.onCompleted();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
                        return;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
                        r0 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
                        defpackage.xiq.a(r0, r3, r1);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
                        return;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void call() {
                        /*
                            r6 = this;
                            xka$1 r0 = defpackage.xka.AnonymousClass1.this
                            xka$a<T> r0 = r0.a
                            int r1 = r6
                            xka$1 r2 = defpackage.xka.AnonymousClass1.this
                            xnt r2 = r5
                            xka$1 r3 = defpackage.xka.AnonymousClass1.this
                            xio<?> r3 = r3.b
                            monitor-enter(r0)
                            boolean r4 = r0.e     // Catch:{ all -> 0x0043 }
                            if (r4 != 0) goto L_0x0041
                            boolean r4 = r0.c     // Catch:{ all -> 0x0043 }
                            if (r4 == 0) goto L_0x0041
                            int r4 = r0.a     // Catch:{ all -> 0x0043 }
                            if (r1 == r4) goto L_0x001c
                            goto L_0x0041
                        L_0x001c:
                            T r1 = r0.b     // Catch:{ all -> 0x0043 }
                            r4 = 0
                            r0.b = r4     // Catch:{ all -> 0x0043 }
                            r4 = 0
                            r0.c = r4     // Catch:{ all -> 0x0043 }
                            r5 = 1
                            r0.e = r5     // Catch:{ all -> 0x0043 }
                            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
                            r2.onNext(r1)     // Catch:{ all -> 0x003c }
                            monitor-enter(r0)
                            boolean r1 = r0.d     // Catch:{ all -> 0x0039 }
                            if (r1 != 0) goto L_0x0034
                            r0.e = r4     // Catch:{ all -> 0x0039 }
                            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                            return
                        L_0x0034:
                            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                            r2.onCompleted()
                            return
                        L_0x0039:
                            r1 = move-exception
                            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                            throw r1
                        L_0x003c:
                            r0 = move-exception
                            defpackage.xiq.a(r0, r3, r1)
                            return
                        L_0x0041:
                            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
                            return
                        L_0x0043:
                            r1 = move-exception
                            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.xka.AnonymousClass1.AnonymousClass1.call():void");
                    }
                }, xka.this.a, xka.this.b));
            }

            public final void onStart() {
                request(Long.MAX_VALUE);
            }
        };
        return r0;
    }
}
