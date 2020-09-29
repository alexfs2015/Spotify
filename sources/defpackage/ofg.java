package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: ofg reason: default package */
public final class ofg implements spt {
    public final void a(sps sps) {
        $$Lambda$ofg$2OCYY910QR2WuedmLQuJGaQPfY r0 = $$Lambda$ofg$2OCYY910QR2WuedmLQuJGaQPfY.INSTANCE;
        sps.a(LinkType.TOPLIST, "Playlist Entity: V1 Toplist", (spa) r0);
        sps.a(LinkType.PLAYLIST_V2, "Playlist Entity: V2", (spa) r0);
        sps.a(LinkType.PROFILE_PLAYLIST, "Playlist Entity: V1", (spa) r0);
        sps.a(LinkType.PLAYLIST_AUTOPLAY, "Playlist Entity: V1 Autoplay", (spa) r0);
        sps.a(LinkType.PLAYLIST_V2_AUTOPLAY, "Playlist Entity: V2 Autoplay", (spa) r0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.jol a(android.content.Intent r6, defpackage.jst r7, java.lang.String r8, defpackage.fpt r9, com.spotify.mobile.android.service.session.SessionState r10) {
        /*
            boolean r3 = r7.n()
            java.lang.String r8 = r7.o()
            java.lang.String r10 = r7.q()
            java.lang.Object r10 = defpackage.fay.a(r10)
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0021
            java.lang.String r2 = "open_all_songs_dialog"
            boolean r2 = r6.getBooleanExtra(r2, r0)
            if (r2 == 0) goto L_0x0021
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            com.google.common.base.Optional r4 = com.google.common.base.Optional.c(r8)
            if (r6 == 0) goto L_0x0056
            java.lang.String r6 = r6.getDataString()
            jst r6 = defpackage.jst.a(r6)
            java.lang.String r8 = r6.c
            java.lang.String r5 = "http://open.spotify.com/"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L_0x0051
            java.lang.String r8 = r6.c
            java.lang.String r5 = "https://open.spotify.com/"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L_0x0051
            java.lang.String r6 = r6.c
            java.lang.String r8 = "spotify://"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r6 = 0
            goto L_0x0052
        L_0x0051:
            r6 = 1
        L_0x0052:
            if (r6 == 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r0 = r9
            off r6 = defpackage.off.a(r0, r1, r2, r3, r4, r5)
            androidx.fragment.app.Fragment r8 = r6.ae()
            android.os.Bundle r8 = r8.i
            java.lang.Object r8 = defpackage.fay.a(r8)
            android.os.Bundle r8 = (android.os.Bundle) r8
            android.net.Uri r9 = r7.a
            java.lang.String r10 = "prid"
            java.lang.String r9 = r9.getQueryParameter(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0077
            goto L_0x0093
        L_0x0077:
            android.net.Uri r7 = r7.a
            java.lang.String r9 = "target_url"
            java.lang.String r7 = r7.getQueryParameter(r9)
            if (r7 == 0) goto L_0x0092
            android.net.Uri r7 = android.net.Uri.parse(r7)
            if (r7 == 0) goto L_0x0092
            boolean r9 = r7.isHierarchical()
            if (r9 == 0) goto L_0x0092
            java.lang.String r9 = r7.getQueryParameter(r10)
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            java.lang.String r7 = "key_algotorial_identifier"
            r8.putString(r7, r9)
            androidx.fragment.app.Fragment r7 = r6.ae()
            r7.g(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofg.a(android.content.Intent, jst, java.lang.String, fpt, com.spotify.mobile.android.service.session.SessionState):jol");
    }
}
