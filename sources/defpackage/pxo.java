package defpackage;

/* renamed from: pxo reason: default package */
public final class pxo {
    private static IllegalStateException a(a aVar) {
        return new IllegalStateException(String.format("dismiss request does not match displayStatus %s: ", new Object[]{aVar.a}));
    }

    public static kmw<pxp, pxm> a(pxp pxp) {
        return kmw.a(pxp, kmt.a(pxm.a("cards", pxp.c()), pxm.a("banners", pxp.a()), pxm.a("notes", pxp.b())));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.kng a(defpackage.pxp r9, defpackage.pxn.a r10) {
        /*
            java.lang.String r0 = r10.a
            int r1 = r0.hashCode()
            r2 = -336959801(0xffffffffebea66c7, float:-5.66748E26)
            java.lang.String r3 = "notes"
            java.lang.String r4 = "cards"
            java.lang.String r5 = "banners"
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 == r2) goto L_0x002f
            r2 = 94431075(0x5a0e763, float:1.5131326E-35)
            if (r1 == r2) goto L_0x0027
            r2 = 105008833(0x6424ec1, float:3.6545204E-35)
            if (r1 == r2) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0038
        L_0x0027:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x002f:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            if (r0 == 0) goto L_0x00a8
            if (r0 == r8) goto L_0x007c
            if (r0 != r6) goto L_0x006a
            pxq r0 = r9.b()
            boolean r0 = r0 instanceof defpackage.pxq.a
            if (r0 == 0) goto L_0x0065
            pxq$b r10 = new pxq$b
            r10.<init>()
            pxp r9 = r9.b(r10)
            pxm[] r10 = new defpackage.pxm[r8]
            pxq$b r0 = new pxq$b
            r0.<init>()
            pxm r0 = defpackage.pxm.a(r3, r0)
            r10[r7] = r0
            java.util.Set r10 = defpackage.kmt.a(r10)
            kng r9 = defpackage.kng.a(r9, r10)
            return r9
        L_0x0065:
            java.lang.IllegalStateException r9 = a(r10)
            throw r9
        L_0x006a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r10 = r10.a
            r0[r7] = r10
            java.lang.String r10 = "Should only be Card, Banner, or Note Format but is: %s"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            r9.<init>(r10)
            throw r9
        L_0x007c:
            pxq r0 = r9.a()
            boolean r0 = r0 instanceof defpackage.pxq.a
            if (r0 == 0) goto L_0x00a3
            pxq$b r10 = new pxq$b
            r10.<init>()
            pxp r9 = r9.a(r10)
            pxm[] r10 = new defpackage.pxm[r8]
            pxq$b r0 = new pxq$b
            r0.<init>()
            pxm r0 = defpackage.pxm.a(r5, r0)
            r10[r7] = r0
            java.util.Set r10 = defpackage.kmt.a(r10)
            kng r9 = defpackage.kng.a(r9, r10)
            return r9
        L_0x00a3:
            java.lang.IllegalStateException r9 = a(r10)
            throw r9
        L_0x00a8:
            pxq r0 = r9.c()
            boolean r0 = r0 instanceof defpackage.pxq.a
            if (r0 == 0) goto L_0x00cf
            pxq$b r10 = new pxq$b
            r10.<init>()
            pxp r9 = r9.c(r10)
            pxm[] r10 = new defpackage.pxm[r8]
            pxq$b r0 = new pxq$b
            r0.<init>()
            pxm r0 = defpackage.pxm.a(r4, r0)
            r10[r7] = r0
            java.util.Set r10 = defpackage.kmt.a(r10)
            kng r9 = defpackage.kng.a(r9, r10)
            return r9
        L_0x00cf:
            java.lang.IllegalStateException r9 = a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxo.a(pxp, pxn$a):kng");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pxp pxp, b bVar) {
        String str;
        if (!((pxp.c() instanceof a) || (pxp.a() instanceof a) || (pxp.b() instanceof a))) {
            return (kng) bVar.b.a((gee<b, R_>) new $$Lambda$pxo$t6sRc4OswmoibEkl7ey5AdY2kg4<b,R_>(pxp, bVar), (gee<a, R_>) new $$Lambda$pxo$1Vw3g9pVEbg8TK0jbUlIsNfoIcI<a,R_>(pxp, bVar), (gee<c, R_>) new $$Lambda$pxo$GIYoQXgLm11zAzwGeT8RmuBD4so<c,R_>(pxp, bVar));
        }
        pxm[] pxmArr = new pxm[1];
        qag qag = bVar.a;
        pxx pxx = bVar.b;
        if (pxp.c() instanceof a) {
            str = "card-already-showing";
        } else if (pxp.a() instanceof a) {
            str = "banner-already-showing";
        } else if (pxp.b() instanceof a) {
            str = "note-already-showing";
        } else {
            throw new IllegalStateException("None of the expected formats are displaying");
        }
        pxmArr[0] = pxm.a(qag, pxx, str);
        return kng.a(kmt.a(pxmArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pxp pxp, b bVar, a aVar) {
        if (pxp.a() instanceof c) {
            return kng.a(kmt.a(pxm.a(bVar.a, bVar.b, "npv-showing")));
        }
        pxq a = pxq.a(bVar.a, bVar.b);
        return kng.a(pxp.a(a), kmt.a(pxm.a(bVar.a, bVar.b), pxm.a("banners", a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pxp pxp, b bVar, b bVar2) {
        if (pxp.c() instanceof c) {
            return kng.a(kmt.a(pxm.a(bVar.a, bVar.b, "card-display-unavailable")));
        }
        pxq a = pxq.a(bVar.a, bVar.b);
        return kng.a(pxp.c(a), kmt.a(pxm.a(bVar.a, bVar.b), pxm.a("cards", a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pxp pxp, b bVar, c cVar) {
        if (pxp.b() instanceof c) {
            return kng.a(kmt.a(pxm.a(bVar.a, bVar.b, "npv-showing")));
        }
        pxq a = pxq.a(bVar.a, bVar.b);
        return kng.a(pxp.b(pxq.a(bVar.a, bVar.b)), kmt.a(pxm.a(bVar.a, bVar.b), pxm.a("notes", a)));
    }

    public static kng<pxp, pxm> a(pxp pxp, pxn pxn) {
        return (kng) pxn.a(new $$Lambda$pxo$KDVDXr5FzscToYdNwpc9Gqx5xvo(pxp), new $$Lambda$pxo$w9sQyvYWIZ1TJRkTG769JjRWFYk(pxp));
    }
}
