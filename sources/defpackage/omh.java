package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: omh reason: default package */
public final class omh implements LicenseLayoutProvider {
    private static ImmutableList<FormatListType> b = ImmutableList.a(FormatListType.PLAYLIST, FormatListType.CAR_MIX, FormatListType.P2S, FormatListType.EDITORIAL);
    public vld a;
    private final ozl c;
    private final hfx d;
    private final rqb e;
    private final ozm f;
    private final tvn g;
    private final vre h;

    public omh(ozl ozl, hfx hfx, rqb rqb, ozm ozm, tvn tvn, vre vre) {
        this.c = ozl;
        this.d = hfx;
        this.e = rqb;
        this.f = ozm;
        this.g = tvn;
        this.h = vre;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (r0.d(r3) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout a() {
        /*
            r7 = this;
            vld r0 = r7.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            vld r3 = r7.a
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            ozl r4 = r7.c
            fqn r4 = r4.getFlags()
            boolean r4 = defpackage.jus.b(r4)
            if (r4 == 0) goto L_0x002b
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_PREMIUM
            return r0
        L_0x002b:
            ozl r4 = r7.c
            fqn r4 = r4.getFlags()
            boolean r4 = defpackage.jus.c(r4)
            if (r4 == 0) goto L_0x004b
            rqb r0 = r7.e
            ozl r1 = r7.c
            fqn r1 = r1.getFlags()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0048
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS
            return r0
        L_0x0048:
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_FREE_TFT
            return r0
        L_0x004b:
            vld r4 = r7.a
            if (r4 != 0) goto L_0x0051
            r4 = 0
            goto L_0x008a
        L_0x0051:
            vlc r4 = r4.a()
            tvn r5 = r7.g
            java.lang.String r6 = r4.p()
            com.spotify.music.playlist.formatlisttype.FormatListType r5 = r5.a(r6)
            com.spotify.music.playlist.formatlisttype.FormatListType r6 = com.spotify.music.playlist.formatlisttype.FormatListType.P2S
            if (r5 != r6) goto L_0x0065
            r5 = 1
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            if (r5 == 0) goto L_0x007a
            ozm r5 = r7.f
            boolean r5 = r5.ak()
            if (r5 == 0) goto L_0x007a
            vre r5 = r7.h
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x007a
            r4 = 1
            goto L_0x008a
        L_0x007a:
            com.google.common.base.Optional r4 = r4.n()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r4 = r4.a(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
        L_0x008a:
            if (r4 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x0091
            if (r3 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r1 == 0) goto L_0x0097
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS
            return r0
        L_0x0097:
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN
            return r0
        L_0x009a:
            ozl r4 = r7.c
            fqn r4 = r4.getFlags()
            fqu r5 = defpackage.hds.c
            java.io.Serializable r4 = r4.a(r5)
            java.lang.String r5 = "Enabled"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00b5
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE
            return r0
        L_0x00b5:
            vld r0 = r7.a
            if (r0 == 0) goto L_0x00e4
            tvn r3 = r7.g
            vlc r0 = r0.a()
            java.lang.String r0 = r0.p()
            com.spotify.music.playlist.formatlisttype.FormatListType r0 = r3.a(r0)
            com.google.common.collect.ImmutableList<com.spotify.music.playlist.formatlisttype.FormatListType> r3 = b
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00e4
            hfx r0 = r7.d
            ozl r3 = r7.c
            fqn r3 = r3.getFlags()
            boolean r4 = r0.b(r3)
            if (r4 != 0) goto L_0x00e5
            boolean r0 = r0.d(r3)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r1 = 0
        L_0x00e5:
            if (r1 == 0) goto L_0x00ea
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.PREVIEWS_WHEN_FREE
            return r0
        L_0x00ea:
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.SHUFFLE_WHEN_FREE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omh.a():com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout");
    }

    public final FormatListType b() {
        vld vld = this.a;
        return vld == null ? FormatListType.PLAYLIST : this.g.a(vld.a().p());
    }

    public final String c() {
        vld vld = this.a;
        String str = "";
        if (vld == null) {
            return str;
        }
        String p = vld.a().p();
        return p == null ? str : p;
    }
}
