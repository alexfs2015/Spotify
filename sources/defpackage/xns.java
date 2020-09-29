package defpackage;

import rx.internal.operators.NotificationLite;

/* renamed from: xns reason: default package */
public final class xns<T> implements xij<T> {
    private final xij<? super T> a;
    private boolean b;
    private volatile boolean c;
    private a d;

    /* renamed from: xns$a */
    static final class a {
        Object[] a;
        private int b;

        a() {
        }

        public final void a(Object obj) {
            int i = this.b;
            Object[] objArr = this.a;
            if (objArr == null) {
                objArr = new Object[16];
                this.a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[((i >> 2) + i)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public xns(xij<? super T> xij) {
        this.a = xij;
    }

    public final void onCompleted() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    if (this.b) {
                        a aVar = this.d;
                        if (aVar == null) {
                            aVar = new a();
                            this.d = aVar;
                        }
                        aVar.a(NotificationLite.a());
                        return;
                    }
                    this.b = true;
                    this.a.onCompleted();
                }
            }
        }
    }

    public final void onError(Throwable th) {
        xiq.b(th);
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    if (this.b) {
                        a aVar = this.d;
                        if (aVar == null) {
                            aVar = new a();
                            this.d = aVar;
                        }
                        aVar.a(NotificationLite.a(th));
                        return;
                    }
                    this.b = true;
                    this.a.onError(th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.a.onNext(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r6.d;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r6.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        r6.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003a, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        r1 = r1.a;
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003e, code lost:
        if (r2 >= r3) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0040, code lost:
        r4 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0042, code lost:
        if (r4 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004a, code lost:
        if (rx.internal.operators.NotificationLite.a(r6.a, r4) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004c, code lost:
        r6.c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0053, code lost:
        r6.c = true;
        defpackage.xiq.b(r1);
        r6.a.onError(rx.exceptions.OnErrorThrowable.a(r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0065, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0066, code lost:
        r6.c = true;
        defpackage.xiq.a(r1, r6.a, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r6)
            boolean r0 = r6.c     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            return
        L_0x000c:
            boolean r0 = r6.b     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0024
            xns$a r0 = r6.d     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x001b
            xns$a r0 = new xns$a     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            r6.d = r0     // Catch:{ all -> 0x006e }
        L_0x001b:
            java.lang.Object r7 = rx.internal.operators.NotificationLite.a(r7)     // Catch:{ all -> 0x006e }
            r0.a(r7)     // Catch:{ all -> 0x006e }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            return
        L_0x0024:
            r0 = 1
            r6.b = r0     // Catch:{ all -> 0x006e }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            xij<? super T> r1 = r6.a     // Catch:{ all -> 0x0065 }
            r1.onNext(r7)     // Catch:{ all -> 0x0065 }
        L_0x002d:
            monitor-enter(r6)
            xns$a r1 = r6.d     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0037
            r6.b = r2     // Catch:{ all -> 0x0062 }
            monitor-exit(r6)     // Catch:{ all -> 0x0062 }
            return
        L_0x0037:
            r3 = 0
            r6.d = r3     // Catch:{ all -> 0x0062 }
            monitor-exit(r6)     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r1 = r1.a
            int r3 = r1.length
        L_0x003e:
            if (r2 >= r3) goto L_0x002d
            r4 = r1[r2]
            if (r4 == 0) goto L_0x002d
            xij<? super T> r5 = r6.a     // Catch:{ all -> 0x0052 }
            boolean r4 = rx.internal.operators.NotificationLite.a(r5, r4)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004f
            r6.c = r0     // Catch:{ all -> 0x0052 }
            return
        L_0x004f:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0052:
            r1 = move-exception
            r6.c = r0
            defpackage.xiq.b(r1)
            xij<? super T> r0 = r6.a
            java.lang.Throwable r7 = rx.exceptions.OnErrorThrowable.a(r1, r7)
            r0.onError(r7)
            return
        L_0x0062:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0062 }
            throw r7
        L_0x0065:
            r1 = move-exception
            r6.c = r0
            xij<? super T> r0 = r6.a
            defpackage.xiq.a(r1, r0, r7)
            return
        L_0x006e:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x0071:
            throw r7
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xns.onNext(java.lang.Object):void");
    }
}
