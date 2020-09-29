package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.AlbumOfflineState;

/* renamed from: ijz reason: default package */
public final class ijz implements wig<gmm<AlbumOfflineState>> {
    private final wzi<gmn> a;

    private ijz(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static ijz a(wzi<gmn> wzi) {
        return new ijz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(AlbumOfflineState.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
