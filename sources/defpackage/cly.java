package defpackage;

/* renamed from: cly reason: default package */
public final class cly {
    public volatile int a;
    private final Object b;
    private volatile long c;

    private cly() {
        this.b = new Object();
        this.a = clz.a;
        this.c = 0;
    }

    /* synthetic */ cly(byte b2) {
        this();
    }

    public final void a() {
        long a2 = bkc.l().a();
        synchronized (this.b) {
            if (this.a == clz.c) {
                if (this.c + ((Long) dqe.f().a(dtg.dg)).longValue() <= a2) {
                    this.a = clz.a;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, int r6) {
        /*
            r4 = this;
            r4.a()
            bzx r0 = defpackage.bkc.l()
            long r0 = r0.a()
            java.lang.Object r2 = r4.b
            monitor-enter(r2)
            int r3 = r4.a     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.a = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.a     // Catch:{ all -> 0x0020 }
            int r6 = defpackage.clz.c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cly.a(int, int):void");
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = clz.a;
            i2 = clz.b;
        } else {
            i = clz.b;
            i2 = clz.a;
        }
        a(i, i2);
    }
}
