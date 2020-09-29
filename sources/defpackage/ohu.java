package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: ohu reason: default package */
public final class ohu implements vua<oht> {
    private final wlc<osf> a;
    private final wlc<hdb> b;
    private final wlc<kxg> c;
    private final wlc<LicenseLayoutProvider> d;
    private final wlc<AndroidLibsPlaylistEntityConfigurationProperties> e;

    private ohu(wlc<osf> wlc, wlc<hdb> wlc2, wlc<kxg> wlc3, wlc<LicenseLayoutProvider> wlc4, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ohu a(wlc<osf> wlc, wlc<hdb> wlc2, wlc<kxg> wlc3, wlc<LicenseLayoutProvider> wlc4, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc5) {
        ohu ohu = new ohu(wlc, wlc2, wlc3, wlc4, wlc5);
        return ohu;
    }

    public final /* synthetic */ Object get() {
        oht oht = new oht((osf) this.a.get(), (hdb) this.b.get(), (kxg) this.c.get(), (LicenseLayoutProvider) this.d.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.e.get());
        return oht;
    }
}
