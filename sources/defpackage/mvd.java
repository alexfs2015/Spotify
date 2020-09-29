package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;

/* renamed from: mvd reason: default package */
public final class mvd implements vua<mvc> {
    private final wlc<String> a;
    private final wlc<AlbumOfflineStateProvider> b;

    private mvd(wlc<String> wlc, wlc<AlbumOfflineStateProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mvd a(wlc<String> wlc, wlc<AlbumOfflineStateProvider> wlc2) {
        return new mvd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mvc((String) this.a.get(), (AlbumOfflineStateProvider) this.b.get());
    }
}
