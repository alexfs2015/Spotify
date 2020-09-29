package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;

/* renamed from: hfy reason: default package */
public final class hfy implements wig<hfx> {
    private final wzi<AndroidMusicLibsPlaylistProperties> a;

    private hfy(wzi<AndroidMusicLibsPlaylistProperties> wzi) {
        this.a = wzi;
    }

    public static hfy a(wzi<AndroidMusicLibsPlaylistProperties> wzi) {
        return new hfy(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hfx((AndroidMusicLibsPlaylistProperties) this.a.get());
    }
}
