package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exw reason: default package */
final class exw<TResult> implements exy<TResult> {
    final Object a = new Object();
    exh<? super TResult> b;
    private final Executor c;

    public exw(Executor executor, exh<? super TResult> exh) {
        this.c = executor;
        this.b = exh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.c.execute(new defpackage.exx(r2, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.exi<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            exh<? super TResult> r1 = r2.b     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.c
            exx r1 = new exx
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exw.a(exi):void");
    }
}
