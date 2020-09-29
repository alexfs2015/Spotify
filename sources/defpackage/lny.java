package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.AlbumOfflineState;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.TracksOfflineState;

/* renamed from: lny reason: default package */
public final class lny implements vua<AlbumOfflineStateProvider> {
    private final wlc<gky<AlbumOfflineState>> a;
    private final wlc<gky<TracksOfflineState>> b;

    private lny(wlc<gky<AlbumOfflineState>> wlc, wlc<gky<TracksOfflineState>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lny a(wlc<gky<AlbumOfflineState>> wlc, wlc<gky<TracksOfflineState>> wlc2) {
        return new lny(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new AlbumOfflineStateProvider((gky) this.a.get(), (gky) this.b.get());
    }
}
