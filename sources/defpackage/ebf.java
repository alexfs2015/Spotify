package defpackage;

/* renamed from: ebf reason: default package */
final class ebf implements Runnable {
    private final /* synthetic */ ebp a;
    private final /* synthetic */ eam b;
    private final /* synthetic */ eay c;

    ebf(eay eay, ebp ebp, eam eam) {
        this.c = eay;
        this.a = ebp;
        this.b = eam;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            eay r0 = r4.c
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            ebp r1 = r4.a     // Catch:{ all -> 0x002f }
            int r1 = r1.a     // Catch:{ all -> 0x002f }
            r2 = -1
            if (r1 == r2) goto L_0x002d
            ebp r1 = r4.a     // Catch:{ all -> 0x002f }
            int r1 = r1.a     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != r2) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            ebp r1 = r4.a     // Catch:{ all -> 0x002f }
            r1.a()     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = defpackage.cqo.a     // Catch:{ all -> 0x002f }
            eam r2 = r4.b     // Catch:{ all -> 0x002f }
            r2.getClass()     // Catch:{ all -> 0x002f }
            ebg r3 = new ebg     // Catch:{ all -> 0x002f }
            r3.<init>(r2)     // Catch:{ all -> 0x002f }
            r1.execute(r3)     // Catch:{ all -> 0x002f }
            defpackage.cml.a()     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebf.run():void");
    }
}
