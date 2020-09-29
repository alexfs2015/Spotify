package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;

/* renamed from: mut reason: default package */
public final class mut implements vua<AlbumOfflineStateProvider> {
    private final wlc<gky<OfflineState>> a;

    private mut(wlc<gky<OfflineState>> wlc) {
        this.a = wlc;
    }

    public static mut a(wlc<gky<OfflineState>> wlc) {
        return new mut(wlc);
    }

    public final /* synthetic */ Object get() {
        return new AlbumOfflineStateProvider((gky) this.a.get());
    }
}
