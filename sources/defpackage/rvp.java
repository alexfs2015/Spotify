package defpackage;

import com.spotify.cosmos.android.util.CosmosRequestInterceptor;

/* renamed from: rvp reason: default package */
final class rvp implements CosmosRequestInterceptor {
    final rvv a;
    private final rvu b;

    rvp(rvv rvv, rvu rvu) {
        this.a = rvv;
        this.b = rvu;
    }

    public final void destroy() {
        this.b.destroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.cosmos.router.Lifetime resolve(com.spotify.cosmos.router.Request r9, com.spotify.cosmos.router.ResolveCallback r10) {
        /*
            r8 = this;
            rvv r0 = r8.a
            java.lang.String r1 = r9.getUri()
            java.lang.String r2 = "hm://"
            boolean r1 = r1.startsWith(r2)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = r9.getAction()
            java.lang.String r5 = "DELETE"
            boolean r5 = r5.equals(r1)
            java.lang.String r6 = "PUT"
            java.lang.String r7 = "POST"
            if (r5 != 0) goto L_0x0037
            java.lang.String r5 = "GET"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0037
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x0037
            boolean r5 = r6.equals(r1)
            if (r5 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = 1
        L_0x0038:
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0047
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r1 = 0
            goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            if (r5 == 0) goto L_0x0055
            if (r1 != 0) goto L_0x0053
            byte[] r1 = r9.getBody()
            int r1 = r1.length
            if (r1 != 0) goto L_0x0055
        L_0x0053:
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = r9.getUri()
            java.lang.String[] r5 = defpackage.rvw.a
            boolean r1 = defpackage.rvv.a(r5, r1)
            if (r1 == 0) goto L_0x0066
            r0 = 1
            goto L_0x0082
        L_0x0066:
            java.lang.String r1 = r9.getUri()
            java.lang.String[] r5 = defpackage.rvw.c
            boolean r1 = defpackage.rvv.a(r5, r1)
            if (r1 != 0) goto L_0x0081
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r9.getUri()
            java.lang.String[] r1 = defpackage.rvw.b
            boolean r0 = defpackage.rvv.a(r1, r0)
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r0 == 0) goto L_0x009f
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r9.getAction()
            r0[r4] = r1
            java.lang.String r1 = r9.getUri()
            r0[r3] = r1
            java.lang.String r1 = "HermesHttpProxy intercept %s %s request to run over HTTPS"
            com.spotify.base.java.logging.Logger.c(r1, r0)
            rvu r0 = r8.b
            com.spotify.cosmos.router.Lifetime r9 = r0.resolve(r9, r10)
            return r9
        L_0x009f:
            java.lang.String r9 = r9.getUri()
            boolean r10 = r9.startsWith(r2)
            if (r10 == 0) goto L_0x00d6
            java.lang.String[] r10 = defpackage.rvw.a
            boolean r10 = defpackage.rvv.a(r10, r9)
            if (r10 != 0) goto L_0x00c3
            java.lang.String[] r10 = defpackage.rvw.b
            boolean r10 = defpackage.rvv.a(r10, r9)
            if (r10 != 0) goto L_0x00c3
            java.lang.String[] r10 = defpackage.rvw.c
            boolean r10 = defpackage.rvv.a(r10, r9)
            if (r10 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r3 != 0) goto L_0x00d6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Hermes transport is not longer supported: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.spotify.mobile.android.util.Assertion.b(r9)
        L_0x00d6:
            com.spotify.cosmos.router.Lifetime r9 = com.spotify.cosmos.router.Lifetime.UNRESOLVED
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvp.resolve(com.spotify.cosmos.router.Request, com.spotify.cosmos.router.ResolveCallback):com.spotify.cosmos.router.Lifetime");
    }
}
