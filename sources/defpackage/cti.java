package defpackage;

/* renamed from: cti reason: default package */
final /* synthetic */ class cti implements Runnable {
    private final ctg a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;

    cti(ctg ctg, int i, int i2, boolean z, boolean z2) {
        this.a = ctg;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            ctg r0 = r11.a
            int r1 = r11.b
            int r2 = r11.c
            boolean r3 = r11.d
            boolean r4 = r11.e
            java.lang.Object r5 = r0.b
            monitor-enter(r5)
            r6 = 0
            r7 = 1
            if (r1 == r2) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r8 = r0.d     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x001c
            if (r2 != r7) goto L_0x001c
            r8 = 1
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0023
            if (r2 != r7) goto L_0x0023
            r9 = 1
            goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x002b
            r10 = 2
            if (r2 != r10) goto L_0x002b
            r10 = 1
            goto L_0x002c
        L_0x002b:
            r10 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0033
            r1 = 3
            if (r2 != r1) goto L_0x0033
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r3 == r4) goto L_0x0038
            r2 = 1
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            boolean r3 = r0.d     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x003f
            if (r8 == 0) goto L_0x0040
        L_0x003f:
            r6 = 1
        L_0x0040:
            r0.d = r6     // Catch:{ all -> 0x0082 }
            drc r3 = r0.c     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x0048
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            return
        L_0x0048:
            r3 = 5
            if (r8 == 0) goto L_0x0054
            drc r6 = r0.c     // Catch:{ RemoteException -> 0x0051 }
            r6.a()     // Catch:{ RemoteException -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0082 }
        L_0x0054:
            if (r9 == 0) goto L_0x005f
            drc r6 = r0.c     // Catch:{ RemoteException -> 0x005c }
            r6.b()     // Catch:{ RemoteException -> 0x005c }
            goto L_0x005f
        L_0x005c:
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0082 }
        L_0x005f:
            if (r10 == 0) goto L_0x006a
            drc r6 = r0.c     // Catch:{ RemoteException -> 0x0067 }
            r6.c()     // Catch:{ RemoteException -> 0x0067 }
            goto L_0x006a
        L_0x0067:
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0082 }
        L_0x006a:
            if (r1 == 0) goto L_0x0075
            drc r1 = r0.c     // Catch:{ RemoteException -> 0x0072 }
            r1.d()     // Catch:{ RemoteException -> 0x0072 }
            goto L_0x0075
        L_0x0072:
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0082 }
        L_0x0075:
            if (r2 == 0) goto L_0x0080
            drc r0 = r0.c     // Catch:{ RemoteException -> 0x007d }
            r0.a(r4)     // Catch:{ RemoteException -> 0x007d }
            goto L_0x0080
        L_0x007d:
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cti.run():void");
    }
}
