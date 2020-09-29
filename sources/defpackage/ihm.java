package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.AlbumOfflineState;

/* renamed from: ihm reason: default package */
public final class ihm implements vua<gky<AlbumOfflineState>> {
    private final wlc<gkz> a;

    private ihm(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static ihm a(wlc<gkz> wlc) {
        return new ihm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(AlbumOfflineState.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
