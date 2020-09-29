package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;

/* renamed from: mzu reason: default package */
public final class mzu implements wig<AlbumOfflineStateProvider> {
    private final wzi<gmm<OfflineState>> a;

    private mzu(wzi<gmm<OfflineState>> wzi) {
        this.a = wzi;
    }

    public static mzu a(wzi<gmm<OfflineState>> wzi) {
        return new mzu(wzi);
    }

    public final /* synthetic */ Object get() {
        return new AlbumOfflineStateProvider((gmm) this.a.get());
    }
}
