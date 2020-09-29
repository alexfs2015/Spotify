package defpackage;

/* renamed from: sxq reason: default package */
public final class sxq implements b {
    private final sxp a;

    public sxq(sxp sxp) {
        this.a = sxp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r2 != null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getAction()
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r6.getDataString()
            jva r0 = defpackage.jva.a(r0)
            sxp r1 = r5.a
            com.spotify.mobile.android.util.Assertion.a(r6)
            com.spotify.mobile.android.util.Assertion.a(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            java.lang.String r4 = ""
            if (r2 < r3) goto L_0x004f
            java.lang.String r2 = "android.intent.extra.REFERRER"
            boolean r3 = r6.hasExtra(r2)
            if (r3 == 0) goto L_0x003a
            android.os.Parcelable r2 = r6.getParcelableExtra(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.toString()
        L_0x0038:
            r4 = r2
            goto L_0x004f
        L_0x003a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r2 < r3) goto L_0x004f
            java.lang.String r2 = "android.intent.extra.REFERRER_NAME"
            boolean r3 = r6.hasExtra(r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r2 = r6.getStringExtra(r2)
            if (r2 == 0) goto L_0x004f
            goto L_0x0038
        L_0x004f:
            boolean r2 = defpackage.fbo.a(r4)
            if (r2 == 0) goto L_0x005d
            boolean r2 = defpackage.saf.a(r6)
            if (r2 == 0) goto L_0x005d
            java.lang.String r4 = "com.facebook.katana"
        L_0x005d:
            boolean r2 = defpackage.fbo.a(r4)
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = "com.spotify.music.intent.extra.EXTRA_SPOTIFY_INTERNAL_REFERRER_NAME"
            java.lang.String r4 = r6.getStringExtra(r2)
        L_0x0069:
            boolean r6 = defpackage.fbo.a(r4)
            if (r6 == 0) goto L_0x008b
            boolean r6 = r0.m()
            if (r6 != 0) goto L_0x008b
            boolean r6 = r0.l()
            if (r6 != 0) goto L_0x008b
            android.net.Uri r6 = r0.a
            java.lang.String r2 = "si"
            java.lang.String r6 = r6.getQueryParameter(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x009d
        L_0x008b:
            jlr r6 = r1.a
            hdr$l r1 = new hdr$l
            java.lang.String r2 = r0.g()
            java.lang.String r0 = r0.h()
            r1.<init>(r4, r2, r0)
            r6.a(r1)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxq.a(android.content.Intent):void");
    }
}
