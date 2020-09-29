package defpackage;

import android.content.Context;

@cfp
/* renamed from: cdq reason: default package */
public abstract class cdq extends cmg {
    protected final cdu a;
    protected final Context b;
    protected final Object c = new Object();
    protected final Object d = new Object();
    protected final clr e;
    protected cgp f;

    protected cdq(Context context, clr clr, cdu cdu) {
        super(0);
        this.b = context;
        this.e = clr;
        this.f = clr.b;
        this.a = cdu;
    }

    /* access modifiers changed from: protected */
    public abstract clq a(int i);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[Catch:{ zzabk -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[Catch:{ zzabk -> 0x0013 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            r1 = 3
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x005c }
            clr r2 = r6.e     // Catch:{ all -> 0x005c }
            int r2 = r2.e     // Catch:{ all -> 0x005c }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzabk -> 0x0013 }
            r6.a(r3)     // Catch:{ zzabk -> 0x0013 }
            goto L_0x004c
        L_0x0013:
            r2 = move-exception
            int r3 = r2.mErrorCode     // Catch:{ all -> 0x005c }
            if (r3 == r1) goto L_0x0024
            r1 = -1
            if (r3 != r1) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            r2.getMessage()     // Catch:{ all -> 0x005c }
            r1 = 5
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x005c }
            goto L_0x002b
        L_0x0024:
            r2.getMessage()     // Catch:{ all -> 0x005c }
            r1 = 4
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x005c }
        L_0x002b:
            cgp r1 = r6.f     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0037
            cgp r1 = new cgp     // Catch:{ all -> 0x005c }
            r1.<init>(r3)     // Catch:{ all -> 0x005c }
        L_0x0034:
            r6.f = r1     // Catch:{ all -> 0x005c }
            goto L_0x0041
        L_0x0037:
            cgp r1 = new cgp     // Catch:{ all -> 0x005c }
            cgp r2 = r6.f     // Catch:{ all -> 0x005c }
            long r4 = r2.j     // Catch:{ all -> 0x005c }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x005c }
            goto L_0x0034
        L_0x0041:
            android.os.Handler r1 = defpackage.cmu.a     // Catch:{ all -> 0x005c }
            cdr r2 = new cdr     // Catch:{ all -> 0x005c }
            r2.<init>(r6)     // Catch:{ all -> 0x005c }
            r1.post(r2)     // Catch:{ all -> 0x005c }
            r2 = r3
        L_0x004c:
            clq r1 = r6.a(r2)     // Catch:{ all -> 0x005c }
            android.os.Handler r2 = defpackage.cmu.a     // Catch:{ all -> 0x005c }
            cds r3 = new cds     // Catch:{ all -> 0x005c }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x005c }
            r2.post(r3)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005f:
            throw r1
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdq.a():void");
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j);

    public void s_() {
    }
}
