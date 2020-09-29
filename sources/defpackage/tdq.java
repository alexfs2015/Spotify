package defpackage;

/* renamed from: tdq reason: default package */
public final class tdq {
    private final url a;
    private final tjv b;
    private tfm c;

    public tdq(url url, tjv tjv) {
        this.a = url;
        this.b = tjv;
    }

    public final void a(tfm tfm) {
        this.c = tfm;
        this.a.a((a<T>) new $$Lambda$KNINl1yEQIhM7cJAsojaMF6Vvc<T>(this));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r1.equals(r8) == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.spotify.mobile.android.cosmos.player.v2.PlayerState r8) {
        /*
            r7 = this;
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r8.track()
            boolean r0 = defpackage.tek.a(r0)
            if (r0 == 0) goto L_0x0010
            tfm r8 = r7.c
            r8.c()
            return
        L_0x0010:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r8.track()
            java.lang.String r1 = "video"
            java.lang.String r2 = "media.type"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.String r5 = r0.uri()
            jst r5 = defpackage.jst.a(r5)
            com.spotify.mobile.android.util.LinkType r5 = r5.b
            java.util.Map r0 = r0.metadata()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.spotify.mobile.android.util.LinkType r6 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            if (r5 != r6) goto L_0x003c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x005f
            tjv r0 = r7.b
            java.util.Map r8 = r8.contextMetadata()
            java.lang.String r1 = "format_list_type"
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            com.spotify.music.playlist.formatlisttype.FormatListType r8 = r0.a(r8)
            com.spotify.music.playlist.formatlisttype.FormatListType r0 = com.spotify.music.playlist.formatlisttype.FormatListType.P2S
            if (r8 != r0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 != 0) goto L_0x008d
            tfm r8 = r7.c
            r8.a()
            return
        L_0x005f:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r8 = r8.track()
            if (r8 == 0) goto L_0x0084
            java.lang.String r0 = r8.uri()
            jst r0 = defpackage.jst.a(r0)
            com.spotify.mobile.android.util.LinkType r0 = r0.b
            java.util.Map r8 = r8.metadata()
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            com.spotify.mobile.android.util.LinkType r2 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            if (r0 != r2) goto L_0x0084
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r3 = 0
        L_0x0085:
            if (r3 == 0) goto L_0x008d
            tfm r8 = r7.c
            r8.a()
            return
        L_0x008d:
            tfm r8 = r7.c
            r8.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdq.a(com.spotify.mobile.android.cosmos.player.v2.PlayerState):void");
    }
}
