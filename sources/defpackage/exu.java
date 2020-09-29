package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exu reason: default package */
final class exu<TResult> implements exy<TResult> {
    final Object a = new Object();
    exg b;
    private final Executor c;

    public exu(Executor executor, exg exg) {
        this.c = executor;
        this.b = exg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.c.execute(new defpackage.exv(r2, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.exi<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.b()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            exg r1 = r2.b     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.c
            exv r1 = new exv
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exu.a(exi):void");
    }
}
