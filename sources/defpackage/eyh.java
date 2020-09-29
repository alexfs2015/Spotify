package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eyh reason: default package */
final class eyh<TResult> implements eyp<TResult> {
    final Object a = new Object();
    exv b;
    private final Executor c;

    public eyh(Executor executor, exv exv) {
        this.c = executor;
        this.b = exv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.c.execute(new defpackage.eyi(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.exz r2) {
        /*
            r1 = this;
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            exv r0 = r1.b     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.c
            eyi r0 = new eyi
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyh.a(exz):void");
    }
}
