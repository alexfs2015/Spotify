package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: djb reason: default package */
public final class djb extends djw {
    private static volatile dgz d;
    private static final Object e = new Object();
    private cyt f = null;

    public djb(dil dil, String str, String str2, dbr dbr, int i, cyt cyt) {
        super(dil, str, str2, dbr, i, 27);
        this.f = cyt;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r11 = this;
            dgz r0 = d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            dgz r0 = d
            java.lang.String r0 = r0.a
            boolean r0 = defpackage.dit.b(r0)
            if (r0 != 0) goto L_0x002b
            dgz r0 = d
            java.lang.String r0 = r0.a
            java.lang.String r3 = "E"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x002b
            dgz r0 = d
            java.lang.String r0 = r0.a
            java.lang.String r3 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = e
            monitor-enter(r0)
            r3 = 0
            boolean r4 = defpackage.dit.b(r3)     // Catch:{ all -> 0x00d8 }
            r5 = 4
            r6 = 2
            r7 = 3
            if (r4 != 0) goto L_0x003d
            r4 = 4
            goto L_0x007a
        L_0x003d:
            defpackage.dit.b(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0079
            dil r4 = r11.a     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.j     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0074
            dsf<java.lang.Boolean> r4 = defpackage.dsp.bM     // Catch:{ all -> 0x00d8 }
            dsn r8 = defpackage.dpn.f()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0074
            dsf<java.lang.Boolean> r4 = defpackage.dsp.bN     // Catch:{ all -> 0x00d8 }
            dsn r8 = defpackage.dpn.f()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0079
            r4 = 3
            goto L_0x007a
        L_0x0079:
            r4 = 2
        L_0x007a:
            java.lang.reflect.Method r8 = r11.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x00d8 }
            dil r10 = r11.a     // Catch:{ all -> 0x00d8 }
            android.content.Context r10 = r10.a()     // Catch:{ all -> 0x00d8 }
            r9[r1] = r10     // Catch:{ all -> 0x00d8 }
            if (r4 != r6) goto L_0x0089
            r1 = 1
        L_0x0089:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00d8 }
            r9[r2] = r1     // Catch:{ all -> 0x00d8 }
            dsf<java.lang.Boolean> r1 = defpackage.dsp.bG     // Catch:{ all -> 0x00d8 }
            dsn r2 = defpackage.dpn.f()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x00d8 }
            r9[r6] = r1     // Catch:{ all -> 0x00d8 }
            java.lang.Object r1 = r8.invoke(r3, r9)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d8 }
            dgz r2 = new dgz     // Catch:{ all -> 0x00d8 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d8 }
            d = r2     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = r2.a     // Catch:{ all -> 0x00d8 }
            boolean r1 = defpackage.dit.b(r1)     // Catch:{ all -> 0x00d8 }
            if (r1 != 0) goto L_0x00bc
            dgz r1 = d     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "E"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00d6
        L_0x00bc:
            if (r4 == r7) goto L_0x00c8
            if (r4 == r5) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            dgz r1 = d     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = r3.a     // Catch:{ all -> 0x00d8 }
            r1.a = r2     // Catch:{ all -> 0x00d8 }
            goto L_0x00d6
        L_0x00c8:
            java.lang.String r1 = r11.c()     // Catch:{ all -> 0x00d8 }
            boolean r2 = defpackage.dit.b(r1)     // Catch:{ all -> 0x00d8 }
            if (r2 != 0) goto L_0x00d6
            dgz r2 = d     // Catch:{ all -> 0x00d8 }
            r2.a = r1     // Catch:{ all -> 0x00d8 }
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x00d8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            throw r1
        L_0x00db:
            dbr r0 = r11.b
            monitor-enter(r0)
            dgz r1 = d     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x010e
            dbr r1 = r11.b     // Catch:{ all -> 0x0110 }
            dgz r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x0110 }
            r1.n = r2     // Catch:{ all -> 0x0110 }
            dbr r1 = r11.b     // Catch:{ all -> 0x0110 }
            dgz r2 = d     // Catch:{ all -> 0x0110 }
            long r2 = r2.b     // Catch:{ all -> 0x0110 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0110 }
            r1.t = r2     // Catch:{ all -> 0x0110 }
            dbr r1 = r11.b     // Catch:{ all -> 0x0110 }
            dgz r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0110 }
            r1.s = r2     // Catch:{ all -> 0x0110 }
            dbr r1 = r11.b     // Catch:{ all -> 0x0110 }
            dgz r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x0110 }
            r1.C = r2     // Catch:{ all -> 0x0110 }
            dbr r1 = r11.b     // Catch:{ all -> 0x0110 }
            dgz r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0110 }
            r1.D = r2     // Catch:{ all -> 0x0110 }
        L_0x010e:
            monitor-exit(r0)     // Catch:{ all -> 0x0110 }
            return
        L_0x0110:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0110 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djb.a():void");
    }

    private final String c() {
        try {
            if (this.a.g != null) {
                this.a.g.get();
            }
            dbr dbr = this.a.f;
            if (!(dbr == null || dbr.n == null)) {
                return dbr.n;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }
}