package defpackage;

import io.reactivex.functions.BiFunction;

/* renamed from: mcj reason: default package */
public final class mcj implements BiFunction<hcs, hcs, hcs> {
    private static boolean a(hcs hcs) {
        return !hcs.body().isEmpty() && !hbb.a(hcs) && !mdl.a(hcs) && !mdl.a(hcs, "browse-loading-empty-view");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if ((!defpackage.mdi.b(r6) && defpackage.mdi.b(r5)) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (a(r6) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (defpackage.mdl.a(r6) != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object apply(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            hcs r5 = (defpackage.hcs) r5
            hcs r6 = (defpackage.hcs) r6
            hcj r0 = r6.custom()
            r1 = 0
            java.lang.String r2 = "browse:forceUpdate"
            boolean r0 = r0.boolValue(r2, r1)
            r2 = 1
            if (r0 == 0) goto L_0x001a
            boolean r0 = a(r6)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x001f
            goto L_0x009e
        L_0x001f:
            java.lang.String r0 = "browse-loading-empty-view"
            boolean r0 = defpackage.mdl.a(r5, r0)
            if (r0 != 0) goto L_0x00a0
            boolean r0 = a(r5)
            if (r0 != 0) goto L_0x0035
            boolean r0 = a(r6)
            if (r0 == 0) goto L_0x0035
            goto L_0x00a0
        L_0x0035:
            boolean r0 = a(r5)
            if (r0 == 0) goto L_0x0083
            boolean r0 = a(r6)
            if (r0 == 0) goto L_0x0083
            int r0 = defpackage.mdi.a(r6)
            int r3 = defpackage.mdi.a(r5)
            if (r0 <= r3) goto L_0x0053
            boolean r0 = defpackage.mdi.b(r5)
            if (r0 == 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 != 0) goto L_0x0067
            boolean r0 = defpackage.mdi.b(r6)
            if (r0 != 0) goto L_0x0064
            boolean r0 = defpackage.mdi.b(r5)
            if (r0 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            if (r1 == 0) goto L_0x009f
            hcs$a r5 = r5.toBuilder()
            java.util.List r0 = r6.body()
            hcs$a r5 = r5.b(r0)
            hcj r6 = r6.custom()
            hcs$a r5 = r5.a(r6)
            hcs r5 = r5.a()
            goto L_0x009f
        L_0x0083:
            boolean r0 = a(r5)
            if (r0 == 0) goto L_0x008f
            boolean r0 = a(r6)
            if (r0 == 0) goto L_0x009f
        L_0x008f:
            java.lang.String r0 = "browse-error-empty-view"
            boolean r0 = defpackage.mdl.a(r5, r0)
            if (r0 == 0) goto L_0x009e
            boolean r0 = defpackage.mdl.a(r6)
            if (r0 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r5 = r6
        L_0x009f:
            return r5
        L_0x00a0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcj.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}