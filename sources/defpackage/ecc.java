package defpackage;

@cey
/* renamed from: ecc reason: default package */
public final class ecc extends ecw {
    final Object a = new Object();
    ech b;
    private eca c;

    public final void a() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.S();
            }
        }
    }

    public final void a(int i) {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(i == 3 ? 1 : 2);
                this.b = null;
            }
        }
    }

    public final void a(dvw dvw, String str) {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.a(dvw, str);
            }
        }
    }

    public final void a(eca eca) {
        synchronized (this.a) {
            this.c = eca;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ecy r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            ech r1 = r2.b     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0011
            ech r1 = r2.b     // Catch:{ all -> 0x001c }
            r1.a(r3)     // Catch:{ all -> 0x001c }
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return
        L_0x0011:
            eca r3 = r2.c     // Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x001a
            eca r3 = r2.c     // Catch:{ all -> 0x001c }
            r3.Z()     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecc.a(ecy):void");
    }

    public final void a(String str) {
    }

    public final void a(String str, String str2) {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.b(str, str2);
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.W();
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.X();
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.Y();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            ech r1 = r3.b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            ech r1 = r3.b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.a(r2)     // Catch:{ all -> 0x001d }
            r1 = 0
            r3.b = r1     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            eca r1 = r3.c     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001b
            eca r1 = r3.c     // Catch:{ all -> 0x001d }
            r1.Z()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecc.e():void");
    }

    public final void f() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.T();
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.U();
            }
        }
    }
}
