package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eyn reason: default package */
final class eyn<TResult> implements eyp<TResult> {
    final Object a = new Object();
    exy<? super TResult> b;
    private final Executor c;

    public eyn(Executor executor, exy<? super TResult> exy) {
        this.c = executor;
        this.b = exy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.c.execute(new defpackage.eyo(r2, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.exz<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            exy<? super TResult> r1 = r2.b     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.c
            eyo r1 = new eyo
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyn.a(exz):void");
    }
}
