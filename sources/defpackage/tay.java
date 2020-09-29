package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: tay reason: default package */
public final class tay implements a, a<PlayerTrack> {
    private final wlc<PlayerState> a;
    private final tbc b;
    private final iww c;
    private final urn d;
    private final taw e;
    private final utj f;
    private taz g;

    public final /* synthetic */ void onChanged(Object obj) {
        LinkType linkType = jst.a(((PlayerTrack) obj).uri()).b;
        this.g.setEnabled(linkType == LinkType.TRACK || linkType == LinkType.SHOW_EPISODE);
    }

    public tay(wlc<PlayerState> wlc, tbc tbc, iww iww, urn urn, utj utj, taw taw) {
        this.a = wlc;
        this.b = tbc;
        this.c = iww;
        this.d = urn;
        this.f = utj;
        this.e = taw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r13 = this;
            wlc<com.spotify.mobile.android.cosmos.player.v2.PlayerState> r0 = r13.a
            java.lang.Object r0 = r0.get()
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = (com.spotify.mobile.android.cosmos.player.v2.PlayerState) r0
            if (r0 == 0) goto L_0x007b
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r0.track()
            if (r1 != 0) goto L_0x0011
            goto L_0x007b
        L_0x0011:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r0.track()
            java.lang.Object r1 = defpackage.fay.a(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r1
            java.lang.String r2 = r1.uri()
            jst r2 = defpackage.jst.a(r2)
            com.spotify.mobile.android.util.LinkType r2 = r2.b
            java.util.Map r3 = r1.metadata()
            java.lang.String r4 = "title"
            java.lang.Object r4 = r3.get(r4)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r4 = "artist_name"
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = defpackage.fax.a(r4)
            if (r5 == 0) goto L_0x0044
            java.lang.String r2 = ""
        L_0x0042:
            r10 = r2
            goto L_0x0051
        L_0x0044:
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            if (r2 != r5) goto L_0x004a
            r10 = r4
            goto L_0x0051
        L_0x004a:
            tbc r2 = r13.b
            java.lang.String r2 = r2.a(r4)
            goto L_0x0042
        L_0x0051:
            java.lang.String r2 = "image_url"
            java.lang.Object r2 = r3.get(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            taw r2 = r13.e
            boolean r2 = r2.apply(r0)
            if (r2 == 0) goto L_0x0067
            java.lang.String r0 = r0.contextUri()
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r8 = r0
            utj r0 = r13.f
            r0.n()
            iww r5 = r13.c
            java.lang.String r6 = r1.uri()
            jnu r12 = defpackage.jnu.a
            java.lang.String r11 = ""
            r5.a(r6, r7, r8, r9, r10, r11, r12)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tay.a():void");
    }

    public final void a(taz taz) {
        this.g = (taz) fay.a(taz);
        this.g.a(this);
        this.d.a((a<T>) this);
    }
}
