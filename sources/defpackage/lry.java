package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.AlbumOfflineState;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.TracksOfflineState;

/* renamed from: lry reason: default package */
public final class lry implements wig<AlbumOfflineStateProvider> {
    private final wzi<gmm<AlbumOfflineState>> a;
    private final wzi<gmm<TracksOfflineState>> b;

    private lry(wzi<gmm<AlbumOfflineState>> wzi, wzi<gmm<TracksOfflineState>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lry a(wzi<gmm<AlbumOfflineState>> wzi, wzi<gmm<TracksOfflineState>> wzi2) {
        return new lry(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new AlbumOfflineStateProvider((gmm) this.a.get(), (gmm) this.b.get());
    }
}
