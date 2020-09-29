package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: djs reason: default package */
public final class djs extends dkn {
    private static volatile dhq d;
    private static final Object e = new Object();
    private czk f = null;

    public djs(djc djc, String str, String str2, dci dci, int i, czk czk) {
        super(djc, str, str2, dci, i, 27);
        this.f = czk;
    }

    private final String c() {
        try {
            if (this.a.g != null) {
                this.a.g.get();
            }
            dci dci = this.a.f;
            if (!(dci == null || dci.n == null)) {
                return dci.n;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r11 = this;
            dhq r0 = d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            dhq r0 = d
            java.lang.String r0 = r0.a
            boolean r0 = defpackage.djk.b(r0)
            if (r0 != 0) goto L_0x002b
            dhq r0 = d
            java.lang.String r0 = r0.a
            java.lang.String r3 = "E"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x002b
            dhq r0 = d
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
            boolean r4 = defpackage.djk.b(r3)     // Catch:{ all -> 0x00d8 }
            r5 = 4
            r6 = 2
            r7 = 3
            if (r4 != 0) goto L_0x003d
            r4 = 4
            goto L_0x007a
        L_0x003d:
            defpackage.djk.b(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0079
            djc r4 = r11.a     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.j     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0074
            dsw<java.lang.Boolean> r4 = defpackage.dtg.bM     // Catch:{ all -> 0x00d8 }
            dte r8 = defpackage.dqe.f()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00d8 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0074
            dsw<java.lang.Boolean> r4 = defpackage.dtg.bN     // Catch:{ all -> 0x00d8 }
            dte r8 = defpackage.dqe.f()     // Catch:{ all -> 0x00d8 }
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
            djc r10 = r11.a     // Catch:{ all -> 0x00d8 }
            android.content.Context r10 = r10.a()     // Catch:{ all -> 0x00d8 }
            r9[r1] = r10     // Catch:{ all -> 0x00d8 }
            if (r4 != r6) goto L_0x0089
            r1 = 1
        L_0x0089:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00d8 }
            r9[r2] = r1     // Catch:{ all -> 0x00d8 }
            dsw<java.lang.Boolean> r1 = defpackage.dtg.bG     // Catch:{ all -> 0x00d8 }
            dte r2 = defpackage.dqe.f()     // Catch:{ all -> 0x00d8 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x00d8 }
            r9[r6] = r1     // Catch:{ all -> 0x00d8 }
            java.lang.Object r1 = r8.invoke(r3, r9)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d8 }
            dhq r2 = new dhq     // Catch:{ all -> 0x00d8 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d8 }
            d = r2     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = r2.a     // Catch:{ all -> 0x00d8 }
            boolean r1 = defpackage.djk.b(r1)     // Catch:{ all -> 0x00d8 }
            if (r1 != 0) goto L_0x00bc
            dhq r1 = d     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "E"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00d6
        L_0x00bc:
            if (r4 == r7) goto L_0x00c8
            if (r4 == r5) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            dhq r1 = d     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = r3.a     // Catch:{ all -> 0x00d8 }
            r1.a = r2     // Catch:{ all -> 0x00d8 }
            goto L_0x00d6
        L_0x00c8:
            java.lang.String r1 = r11.c()     // Catch:{ all -> 0x00d8 }
            boolean r2 = defpackage.djk.b(r1)     // Catch:{ all -> 0x00d8 }
            if (r2 != 0) goto L_0x00d6
            dhq r2 = d     // Catch:{ all -> 0x00d8 }
            r2.a = r1     // Catch:{ all -> 0x00d8 }
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x00d8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            throw r1
        L_0x00db:
            dci r0 = r11.b
            monitor-enter(r0)
            dhq r1 = d     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x010e
            dci r1 = r11.b     // Catch:{ all -> 0x0110 }
            dhq r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x0110 }
            r1.n = r2     // Catch:{ all -> 0x0110 }
            dci r1 = r11.b     // Catch:{ all -> 0x0110 }
            dhq r2 = d     // Catch:{ all -> 0x0110 }
            long r2 = r2.b     // Catch:{ all -> 0x0110 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0110 }
            r1.t = r2     // Catch:{ all -> 0x0110 }
            dci r1 = r11.b     // Catch:{ all -> 0x0110 }
            dhq r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0110 }
            r1.s = r2     // Catch:{ all -> 0x0110 }
            dci r1 = r11.b     // Catch:{ all -> 0x0110 }
            dhq r2 = d     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x0110 }
            r1.C = r2     // Catch:{ all -> 0x0110 }
            dci r1 = r11.b     // Catch:{ all -> 0x0110 }
            dhq r2 = d     // Catch:{ all -> 0x0110 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djs.a():void");
    }
}
