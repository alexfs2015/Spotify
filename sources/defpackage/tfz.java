package defpackage;

/* renamed from: tfz reason: default package */
public final class tfz implements tml {
    private final tvn a;

    public tfz(tvn tvn) {
        this.a = tvn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if ((r7.a.a((java.lang.String) r8.contextMetadata().get(com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata.FORMAT_LIST_TYPE)) == com.spotify.music.playlist.formatlisttype.FormatListType.P2S) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.spotify.mobile.android.cosmos.player.v2.PlayerState r8, defpackage.fqn r9) {
        /*
            r7 = this;
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r9 = r8.track()
            java.lang.Object r9 = defpackage.fbp.a(r9)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r9 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r9
            java.lang.String r0 = r9.uri()
            jva r0 = defpackage.jva.a(r0)
            com.spotify.mobile.android.util.LinkType r0 = r0.b
            java.util.Map r1 = r9.metadata()
            java.lang.String r2 = "media.type"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            java.lang.String r4 = "video"
            r5 = 1
            r6 = 0
            if (r0 != r3) goto L_0x0030
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x004e
            java.util.Map r8 = r8.contextMetadata()
            tvn r0 = r7.a
            java.lang.String r1 = "format_list_type"
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            com.spotify.music.playlist.formatlisttype.FormatListType r8 = r0.a(r8)
            com.spotify.music.playlist.formatlisttype.FormatListType r0 = com.spotify.music.playlist.formatlisttype.FormatListType.P2S
            if (r8 != r0) goto L_0x004b
            r8 = 1
            goto L_0x004c
        L_0x004b:
            r8 = 0
        L_0x004c:
            if (r8 == 0) goto L_0x0071
        L_0x004e:
            java.lang.String r8 = r9.uri()
            jva r8 = defpackage.jva.a(r8)
            com.spotify.mobile.android.util.LinkType r8 = r8.b
            java.util.Map r9 = r9.metadata()
            java.lang.Object r9 = r9.get(r2)
            java.lang.String r9 = (java.lang.String) r9
            com.spotify.mobile.android.util.LinkType r0 = com.spotify.mobile.android.util.LinkType.LIVE_EVENT
            if (r8 != r0) goto L_0x006e
            boolean r8 = r4.equals(r9)
            if (r8 == 0) goto L_0x006e
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            if (r8 == 0) goto L_0x0072
        L_0x0071:
            return r5
        L_0x0072:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfz.a(com.spotify.mobile.android.cosmos.player.v2.PlayerState, fqn):boolean");
    }
}
