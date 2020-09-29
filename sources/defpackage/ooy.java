package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: ooy reason: default package */
public final class ooy implements wig<oox> {
    private final wzi<ozl> a;
    private final wzi<hfx> b;
    private final wzi<lap> c;
    private final wzi<LicenseLayoutProvider> d;
    private final wzi<AndroidLibsPlaylistEntityConfigurationProperties> e;

    private ooy(wzi<ozl> wzi, wzi<hfx> wzi2, wzi<lap> wzi3, wzi<LicenseLayoutProvider> wzi4, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ooy a(wzi<ozl> wzi, wzi<hfx> wzi2, wzi<lap> wzi3, wzi<LicenseLayoutProvider> wzi4, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi5) {
        ooy ooy = new ooy(wzi, wzi2, wzi3, wzi4, wzi5);
        return ooy;
    }

    public final /* synthetic */ Object get() {
        oox oox = new oox((ozl) this.a.get(), (hfx) this.b.get(), (lap) this.c.get(), (LicenseLayoutProvider) this.d.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.e.get());
        return oox;
    }
}
