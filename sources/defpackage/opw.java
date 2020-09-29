package defpackage;

/* renamed from: opw reason: default package */
public final class opw {
    private final vkw a;

    public opw(vkw vkw) {
        this.a = vkw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014b, code lost:
        if (((r2 == null && r3 == null) || (r2 != null && r3 != null && android.text.TextUtils.equals(r2.a(), r3.a()) && android.text.TextUtils.equals(r2.b(), r3.b()) && android.text.TextUtils.equals(r2.c(), r3.c()))) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.oqg r8, defpackage.oqg r9) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0006
            if (r9 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r8 == 0) goto L_0x017b
            if (r9 != 0) goto L_0x000d
            goto L_0x017b
        L_0x000d:
            vkw r2 = r7.a
            vlc r2 = r8.a()
            vlc r3 = r9.a()
            if (r2 != 0) goto L_0x001e
            if (r3 != 0) goto L_0x001e
        L_0x001b:
            r2 = 1
            goto L_0x0150
        L_0x001e:
            if (r2 == 0) goto L_0x014f
            if (r3 != 0) goto L_0x0024
            goto L_0x014f
        L_0x0024:
            java.lang.String r4 = r2.getUri()
            java.lang.String r5 = r3.getUri()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014f
            java.lang.String r4 = r2.a()
            java.lang.String r5 = r3.a()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014f
            java.lang.String r4 = r2.b()
            java.lang.String r5 = r3.b()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014f
            java.lang.String r4 = r2.u()
            java.lang.String r5 = r3.u()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014f
            boolean r4 = r2.e()
            boolean r5 = r3.e()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.f()
            boolean r5 = r3.f()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.g()
            boolean r5 = r3.g()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.h()
            boolean r5 = r3.h()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.i()
            boolean r5 = r3.i()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.j()
            boolean r5 = r3.j()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.k()
            boolean r5 = r3.k()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.l()
            boolean r5 = r3.l()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.m()
            boolean r5 = r3.m()
            if (r4 != r5) goto L_0x014f
            boolean r4 = r2.o()
            boolean r5 = r3.o()
            if (r4 != r5) goto L_0x014f
            vli r4 = r2.s()
            vli r5 = r3.s()
            if (r4 != r5) goto L_0x014f
            int r4 = r2.t()
            int r5 = r3.t()
            if (r4 != r5) goto L_0x014f
            int r4 = r2.v()
            int r5 = r3.v()
            if (r4 != r5) goto L_0x014f
            java.lang.String r4 = r2.p()
            java.lang.String r5 = r3.p()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014f
            com.google.common.collect.ImmutableMap r4 = r2.q()
            int r4 = r4.size()
            com.google.common.collect.ImmutableMap r5 = r3.q()
            int r5 = r5.size()
            if (r4 != r5) goto L_0x014f
            com.spotify.playlist.models.Covers r4 = r2.c()
            com.spotify.playlist.models.Covers r5 = r3.c()
            boolean r4 = defpackage.vkw.a(r4, r5)
            if (r4 == 0) goto L_0x014f
            vlg r2 = r2.d()
            vlg r3 = r3.d()
            if (r2 != 0) goto L_0x011a
            if (r3 != 0) goto L_0x011a
        L_0x0118:
            r2 = 1
            goto L_0x014b
        L_0x011a:
            if (r2 == 0) goto L_0x014a
            if (r3 != 0) goto L_0x011f
            goto L_0x014a
        L_0x011f:
            java.lang.String r4 = r2.a()
            java.lang.String r5 = r3.a()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014a
            java.lang.String r4 = r2.b()
            java.lang.String r5 = r3.b()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x014a
            java.lang.String r2 = r2.c()
            java.lang.String r3 = r3.c()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x014a
            goto L_0x0118
        L_0x014a:
            r2 = 0
        L_0x014b:
            if (r2 == 0) goto L_0x014f
            goto L_0x001b
        L_0x014f:
            r2 = 0
        L_0x0150:
            if (r2 == 0) goto L_0x017b
            boolean r2 = r7.b(r8, r9)
            if (r2 == 0) goto L_0x017b
            int r2 = r8.c()
            int r3 = r9.c()
            if (r2 != r3) goto L_0x017b
            long r2 = r8.d()
            long r4 = r9.d()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x017b
            long r2 = r8.e()
            long r8 = r9.e()
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x017b
            return r0
        L_0x017b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opw.a(oqg, oqg):boolean");
    }

    public final boolean b(oqg oqg, oqg oqg2) {
        if (oqg == null && oqg2 == null) {
            return true;
        }
        return oqg != null && oqg2 != null && oqg.b().equals(oqg2.b()) && oqg.l() == oqg2.l();
    }
}
