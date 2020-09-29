package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: opk reason: default package */
public final class opk implements wig<opj> {
    private final wzi<ozl> a;
    private final wzi<hfx> b;
    private final wzi<AndroidLibsPlaylistEntityConfigurationProperties> c;

    private opk(wzi<ozl> wzi, wzi<hfx> wzi2, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static opj a(ozl ozl, hfx hfx, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        return new opj(ozl, hfx, androidLibsPlaylistEntityConfigurationProperties);
    }

    public static opk a(wzi<ozl> wzi, wzi<hfx> wzi2, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi3) {
        return new opk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new opj((ozl) this.a.get(), (hfx) this.b.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.c.get());
    }
}
