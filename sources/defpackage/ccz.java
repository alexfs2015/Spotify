package defpackage;

import android.content.Context;

@cey
/* renamed from: ccz reason: default package */
public abstract class ccz extends clp {
    protected final cdd a;
    protected final Context b;
    protected final Object c = new Object();
    protected final Object d = new Object();
    protected final cla e;
    protected cfy f;

    protected ccz(Context context, cla cla, cdd cdd) {
        super(0);
        this.b = context;
        this.e = cla;
        this.f = cla.b;
        this.a = cdd;
    }

    /* access modifiers changed from: protected */
    public abstract ckz a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(long j);

    public void s_() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[Catch:{ zzabk -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[Catch:{ zzabk -> 0x0013 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            r1 = 3
            defpackage.cow.a(r1)     // Catch:{ all -> 0x005c }
            cla r2 = r6.e     // Catch:{ all -> 0x005c }
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
            defpackage.cow.a(r1)     // Catch:{ all -> 0x005c }
            goto L_0x002b
        L_0x0024:
            r2.getMessage()     // Catch:{ all -> 0x005c }
            r1 = 4
            defpackage.cow.a(r1)     // Catch:{ all -> 0x005c }
        L_0x002b:
            cfy r1 = r6.f     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0037
            cfy r1 = new cfy     // Catch:{ all -> 0x005c }
            r1.<init>(r3)     // Catch:{ all -> 0x005c }
        L_0x0034:
            r6.f = r1     // Catch:{ all -> 0x005c }
            goto L_0x0041
        L_0x0037:
            cfy r1 = new cfy     // Catch:{ all -> 0x005c }
            cfy r2 = r6.f     // Catch:{ all -> 0x005c }
            long r4 = r2.j     // Catch:{ all -> 0x005c }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x005c }
            goto L_0x0034
        L_0x0041:
            android.os.Handler r1 = defpackage.cmd.a     // Catch:{ all -> 0x005c }
            cda r2 = new cda     // Catch:{ all -> 0x005c }
            r2.<init>(r6)     // Catch:{ all -> 0x005c }
            r1.post(r2)     // Catch:{ all -> 0x005c }
            r2 = r3
        L_0x004c:
            ckz r1 = r6.a(r2)     // Catch:{ all -> 0x005c }
            android.os.Handler r2 = defpackage.cmd.a     // Catch:{ all -> 0x005c }
            cdb r3 = new cdb     // Catch:{ all -> 0x005c }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccz.a():void");
    }
}
