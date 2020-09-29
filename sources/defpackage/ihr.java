package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.TracksOfflineState;

/* renamed from: ihr reason: default package */
public final class ihr implements vua<gky<TracksOfflineState>> {
    private final wlc<gkz> a;

    private ihr(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static ihr a(wlc<gkz> wlc) {
        return new ihr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(TracksOfflineState.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
