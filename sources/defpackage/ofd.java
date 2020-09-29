package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: ofd reason: default package */
public final class ofd implements LicenseLayoutProvider {
    private static ImmutableList<FormatListType> b = ImmutableList.a(FormatListType.PLAYLIST, FormatListType.CAR_MIX, FormatListType.P2S, FormatListType.EDITORIAL);
    public uza a;
    private final osf c;
    private final hdb d;
    private final rgz e;
    private final osg f;
    private final tjv g;
    private final vej h;

    public ofd(osf osf, hdb hdb, rgz rgz, osg osg, tjv tjv, vej vej) {
        this.c = osf;
        this.d = hdb;
        this.e = rgz;
        this.f = osg;
        this.g = tjv;
        this.h = vej;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (r0.h(r3) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout a() {
        /*
            r7 = this;
            uza r0 = r7.a
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
            uza r3 = r7.a
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            osf r4 = r7.c
            fpt r4 = r4.getFlags()
            boolean r4 = defpackage.jsl.b(r4)
            if (r4 == 0) goto L_0x002b
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_PREMIUM
            return r0
        L_0x002b:
            osf r4 = r7.c
            fpt r4 = r4.getFlags()
            boolean r4 = defpackage.jsl.c(r4)
            if (r4 == 0) goto L_0x004b
            rgz r0 = r7.e
            osf r1 = r7.c
            fpt r1 = r1.getFlags()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0048
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS
            return r0
        L_0x0048:
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.ON_DEMAND_WHEN_FREE_TFT
            return r0
        L_0x004b:
            uza r4 = r7.a
            if (r4 != 0) goto L_0x0051
            r4 = 0
            goto L_0x008a
        L_0x0051:
            uyz r4 = r4.a()
            tjv r5 = r7.g
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
            osg r5 = r7.f
            boolean r5 = r5.ak()
            if (r5 == 0) goto L_0x007a
            vej r5 = r7.h
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
            osf r4 = r7.c
            fpt r4 = r4.getFlags()
            fqa r5 = defpackage.haz.c
            java.io.Serializable r4 = r4.a(r5)
            java.lang.String r5 = "Enabled"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00b5
            com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout r0 = com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE
            return r0
        L_0x00b5:
            uza r0 = r7.a
            if (r0 == 0) goto L_0x00e4
            tjv r3 = r7.g
            uyz r0 = r0.a()
            java.lang.String r0 = r0.p()
            com.spotify.music.playlist.formatlisttype.FormatListType r0 = r3.a(r0)
            com.google.common.collect.ImmutableList<com.spotify.music.playlist.formatlisttype.FormatListType> r3 = b
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00e4
            hdb r0 = r7.d
            osf r3 = r7.c
            fpt r3 = r3.getFlags()
            boolean r4 = r0.f(r3)
            if (r4 != 0) goto L_0x00e5
            boolean r0 = r0.h(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofd.a():com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider$LicenseLayout");
    }

    public final FormatListType b() {
        uza uza = this.a;
        if (uza == null) {
            return FormatListType.PLAYLIST;
        }
        return this.g.a(uza.a().p());
    }

    public final String c() {
        uza uza = this.a;
        String str = "";
        if (uza == null) {
            return str;
        }
        String p = uza.a().p();
        return p == null ? str : p;
    }
}
