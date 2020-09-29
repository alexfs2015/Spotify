package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;

/* renamed from: hdc reason: default package */
public final class hdc implements vua<hdb> {
    private final wlc<AndroidMusicLibsPlaylistProperties> a;

    private hdc(wlc<AndroidMusicLibsPlaylistProperties> wlc) {
        this.a = wlc;
    }

    public static hdc a(wlc<AndroidMusicLibsPlaylistProperties> wlc) {
        return new hdc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hdb((AndroidMusicLibsPlaylistProperties) this.a.get());
    }
}
