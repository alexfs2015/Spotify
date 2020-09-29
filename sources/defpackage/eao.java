package defpackage;

/* renamed from: eao reason: default package */
final class eao implements Runnable {
    private final /* synthetic */ eay a;
    private final /* synthetic */ dzv b;
    private final /* synthetic */ eah c;

    eao(eah eah, eay eay, dzv dzv) {
        this.c = eah;
        this.a = eay;
        this.b = dzv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            eah r0 = r4.c
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            eay r1 = r4.a     // Catch:{ all -> 0x002f }
            int r1 = r1.a     // Catch:{ all -> 0x002f }
            r2 = -1
            if (r1 == r2) goto L_0x002d
            eay r1 = r4.a     // Catch:{ all -> 0x002f }
            int r1 = r1.a     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != r2) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            eay r1 = r4.a     // Catch:{ all -> 0x002f }
            r1.a()     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = defpackage.cpx.a     // Catch:{ all -> 0x002f }
            dzv r2 = r4.b     // Catch:{ all -> 0x002f }
            r2.getClass()     // Catch:{ all -> 0x002f }
            eap r3 = new eap     // Catch:{ all -> 0x002f }
            r3.<init>(r2)     // Catch:{ all -> 0x002f }
            r1.execute(r3)     // Catch:{ all -> 0x002f }
            defpackage.clu.a()     // Catch:{ all -> 0x002f }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eao.run():void");
    }
}
