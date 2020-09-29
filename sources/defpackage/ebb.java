package defpackage;

/* renamed from: ebb reason: default package */
final /* synthetic */ class ebb implements Runnable {
    private final eay a;
    private final ebp b;
    private final eam c;

    ebb(eay eay, ebp ebp, eam eam) {
        this.a = eay;
        this.b = ebp;
        this.c = eam;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            eay r0 = r5.a
            ebp r1 = r5.b
            eam r2 = r5.c
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            int r3 = r1.a     // Catch:{ all -> 0x002b }
            r4 = -1
            if (r3 == r4) goto L_0x0029
            int r3 = r1.a     // Catch:{ all -> 0x002b }
            r4 = 1
            if (r3 != r4) goto L_0x0014
            goto L_0x0029
        L_0x0014:
            r1.a()     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = defpackage.cqo.a     // Catch:{ all -> 0x002b }
            r2.getClass()     // Catch:{ all -> 0x002b }
            ebc r3 = new ebc     // Catch:{ all -> 0x002b }
            r3.<init>(r2)     // Catch:{ all -> 0x002b }
            r1.execute(r3)     // Catch:{ all -> 0x002b }
            defpackage.cml.a()     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebb.run():void");
    }
}
