package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oig reason: default package */
public final class oig implements vua<oif> {
    private final wlc<osf> a;
    private final wlc<hdb> b;
    private final wlc<AndroidLibsPlaylistEntityConfigurationProperties> c;

    private oig(wlc<osf> wlc, wlc<hdb> wlc2, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oig a(wlc<osf> wlc, wlc<hdb> wlc2, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc3) {
        return new oig(wlc, wlc2, wlc3);
    }

    public static oif a(osf osf, hdb hdb, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        return new oif(osf, hdb, androidLibsPlaylistEntityConfigurationProperties);
    }

    public final /* synthetic */ Object get() {
        return new oif((osf) this.a.get(), (hdb) this.b.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.c.get());
    }
}
