package defpackage;

/* renamed from: njd reason: default package */
public final class njd implements wuu<njo, gzz, njo> {
    private final ndh a;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object call(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            njo r7 = (defpackage.njo) r7
            gzz r8 = (defpackage.gzz) r8
            gzz r0 = r7.a()
            java.lang.String r1 = "home-loading-empty-view"
            boolean r1 = defpackage.nde.a(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = "home-error-empty-view"
            boolean r1 = defpackage.nde.a(r0, r1)
            if (r1 != 0) goto L_0x0029
            boolean r1 = defpackage.nde.a(r0)
            if (r1 != 0) goto L_0x0029
            boolean r1 = a(r0)
            if (r1 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            boolean r4 = a(r8)
            if (r4 == 0) goto L_0x005b
            gzq r4 = r8.custom()
            java.util.List r5 = r8.body()
            boolean r4 = defpackage.nes.a(r4, r5)
            if (r4 != 0) goto L_0x005b
            gzq r4 = r8.custom()
            java.lang.String r5 = "offline"
            boolean r4 = r4.boolValue(r5, r3)
            if (r4 != 0) goto L_0x005b
            int r0 = defpackage.ndh.a(r0)
            int r4 = defpackage.ndh.a(r8)
            if (r0 == r4) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r1 != 0) goto L_0x0062
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            if (r2 == 0) goto L_0x0070
            njo$a r7 = r7.d()
            njo$a r7 = r7.a(r8)
            njo r7 = r7.a()
        L_0x0070:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njd.call(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public njd(ndh ndh) {
        this.a = ndh;
    }

    private static boolean a(gzz gzz) {
        return !gzz.body().isEmpty();
    }
}
