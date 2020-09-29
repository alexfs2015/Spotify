package defpackage;

/* renamed from: nms reason: default package */
public final class nms implements c<hcs, hcs> {
    private final xii<Boolean> a;
    private final xii<Boolean> b;

    nms(xii<Boolean> xii, xii<Boolean> xii2) {
        this.a = (xii) fbp.a(xii);
        this.b = (xii) fbp.a(xii2);
    }

    private static hcs a(hcs hcs) {
        return hcs.toBuilder().a((hcm) null).a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.hcs a(java.lang.Boolean r5, java.lang.Boolean r6, defpackage.hcs r7) {
        /*
            hcm r0 = r7.header()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.util.List r0 = r0.children()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0018
            java.lang.Object r0 = r0.get(r1)
            hcm r0 = (defpackage.hcm) r0
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r2 = 1
            if (r0 == 0) goto L_0x002e
            hck r3 = r0.componentId()
            java.lang.String r3 = r3.id()
            java.lang.String r4 = "freetier:homeHeader"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0046
            java.util.List r5 = r7.body()
            fcp r5 = defpackage.fcp.a(r5)
            -$$Lambda$nms$j_2KUDCVvVZU4RakA3UfS5w0x2E r6 = defpackage.$$Lambda$nms$j_2KUDCVvVZU4RakA3UfS5w0x2E.INSTANCE
            boolean r5 = r5.b(r6)
            if (r5 == 0) goto L_0x0084
            hcs r5 = a(r7)
            return r5
        L_0x0046:
            if (r0 == 0) goto L_0x005a
            hck r3 = r0.componentId()
            java.lang.String r3 = r3.id()
            java.lang.String r4 = "freetier:tasteOnboardingHomeHeader"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0084
            if (r0 == 0) goto L_0x0070
            java.util.List r0 = r0.children()
            fcp r0 = defpackage.fcp.a(r0)
            -$$Lambda$nms$-qEdswKxVvMlMD53RR7pktfBRWA r3 = defpackage.$$Lambda$nms$qEdswKxVvMlMD53RR7pktfBRWA.INSTANCE
            boolean r0 = r0.b(r3)
            if (r0 != 0) goto L_0x0070
            r1 = 1
        L_0x0070:
            if (r1 == 0) goto L_0x0079
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L_0x0084
            goto L_0x007f
        L_0x0079:
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0084
        L_0x007f:
            hcs r5 = a(r7)
            return r5
        L_0x0084:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nms.a(java.lang.Boolean, java.lang.Boolean, hcs):hcs");
    }

    /* access modifiers changed from: private */
    public static boolean a(hcm hcm) {
        if (hcm != null) {
            if ("freetier:secondaryButton".equals(hcm.componentId().id())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean b(hcm hcm) {
        if (hcm != null) {
            if ("home:recentlyPlayedCarousel".equals(hcm.componentId().id())) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a(this.a, this.b, (xii) obj, (xja<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$nms$UgC5OdQMxZfHTnIN7gbWHxOxFg0.INSTANCE);
    }
}
