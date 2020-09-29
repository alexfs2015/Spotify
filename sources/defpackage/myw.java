package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;

/* renamed from: myw reason: default package */
public final class myw implements wig<gmm<OfflineState>> {
    private final wzi<gmn> a;

    private myw(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static myw a(wzi<gmn> wzi) {
        return new myw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(OfflineState.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
