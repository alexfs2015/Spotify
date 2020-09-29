package defpackage;

/* renamed from: clh reason: default package */
public final class clh {
    public volatile int a;
    private final Object b;
    private volatile long c;

    private clh() {
        this.b = new Object();
        this.a = cli.a;
        this.c = 0;
    }

    /* synthetic */ clh(byte b2) {
        this();
    }

    public final void a() {
        long a2 = bjl.l().a();
        synchronized (this.b) {
            if (this.a == cli.c) {
                if (this.c + ((Long) dpn.f().a(dsp.dg)).longValue() <= a2) {
                    this.a = cli.a;
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
            bzg r0 = defpackage.bjl.l()
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
            int r6 = defpackage.cli.c     // Catch:{ all -> 0x0020 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clh.a(int, int):void");
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = cli.a;
            i2 = cli.b;
        } else {
            i = cli.b;
            i2 = cli.a;
        }
        a(i, i2);
    }
}
