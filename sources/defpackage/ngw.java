package defpackage;

/* renamed from: ngw reason: default package */
public final class ngw implements c<gzz, gzz> {
    private final wud<Boolean> a;
    private final wud<Boolean> b;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a(this.a, this.b, (wud) obj, (wuv<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$ngw$_shCIhmVZv9KROhqzLLUJizLgg.INSTANCE);
    }

    ngw(wud<Boolean> wud, wud<Boolean> wud2) {
        this.a = (wud) fay.a(wud);
        this.b = (wud) fay.a(wud2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.gzz a(java.lang.Boolean r5, java.lang.Boolean r6, defpackage.gzz r7) {
        /*
            gzt r0 = r7.header()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.util.List r0 = r0.children()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0018
            java.lang.Object r0 = r0.get(r1)
            gzt r0 = (defpackage.gzt) r0
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r2 = 1
            if (r0 == 0) goto L_0x002e
            gzr r3 = r0.componentId()
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
            fbx r5 = defpackage.fbx.a(r5)
            -$$Lambda$ngw$Zv2rq9N8DetbgorxmI1c6Ar3MDg r6 = defpackage.$$Lambda$ngw$Zv2rq9N8DetbgorxmI1c6Ar3MDg.INSTANCE
            boolean r5 = r5.b(r6)
            if (r5 == 0) goto L_0x0084
            gzz r5 = a(r7)
            return r5
        L_0x0046:
            if (r0 == 0) goto L_0x005a
            gzr r3 = r0.componentId()
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
            fbx r0 = defpackage.fbx.a(r0)
            -$$Lambda$ngw$qT8P8LRCyB6wZTbJZiQstJcvCxY r3 = defpackage.$$Lambda$ngw$qT8P8LRCyB6wZTbJZiQstJcvCxY.INSTANCE
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
            gzz r5 = a(r7)
            return r5
        L_0x0084:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngw.a(java.lang.Boolean, java.lang.Boolean, gzz):gzz");
    }

    private static gzz a(gzz gzz) {
        return gzz.toBuilder().a((gzt) null).a();
    }

    /* access modifiers changed from: private */
    public static boolean a(gzt gzt) {
        if (gzt != null) {
            if ("freetier:secondaryButton".equals(gzt.componentId().id())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean b(gzt gzt) {
        if (gzt != null) {
            if ("home:recentlyPlayedCarousel".equals(gzt.componentId().id())) {
                return true;
            }
        }
        return false;
    }
}
