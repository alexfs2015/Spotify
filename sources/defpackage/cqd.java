package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cqd reason: default package */
final /* synthetic */ class cqd implements Runnable {
    private final cqt a;
    private final cqi b;
    private final Class c;
    private final cps d;
    private final Executor e;

    cqd(cqt cqt, cqi cqi, Class cls, cps cps, Executor executor) {
        this.a = cqt;
        this.b = cqi;
        this.c = cls;
        this.d = cps;
        this.e = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            cqt r0 = r6.a
            cqi r1 = r6.b
            java.lang.Class r2 = r6.c
            cps r3 = r6.d
            java.util.concurrent.Executor r4 = r6.e
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0014, Exception -> 0x0012 }
            r0.b(r1)     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0014, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            goto L_0x0022
        L_0x0014:
            r1 = move-exception
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L_0x0022
        L_0x001d:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
        L_0x0022:
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L_0x0034
            cqh r1 = defpackage.cpx.a(r1)
            cqi r1 = defpackage.cpx.a(r1, r3, r4)
            defpackage.cpx.a(r1, r0)
            return
        L_0x0034:
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqd.run():void");
    }
}
