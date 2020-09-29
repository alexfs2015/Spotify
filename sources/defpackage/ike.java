package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.TracksOfflineState;

/* renamed from: ike reason: default package */
public final class ike implements wig<gmm<TracksOfflineState>> {
    private final wzi<gmn> a;

    private ike(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static ike a(wzi<gmn> wzi) {
        return new ike(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(TracksOfflineState.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
