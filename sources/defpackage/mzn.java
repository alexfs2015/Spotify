package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;

/* renamed from: mzn reason: default package */
public final class mzn implements wig<mzm> {
    private final wzi<String> a;
    private final wzi<lar> b;
    private final wzi<lav> c;
    private final wzi<AlbumOfflineStateProvider> d;

    private mzn(wzi<String> wzi, wzi<lar> wzi2, wzi<lav> wzi3, wzi<AlbumOfflineStateProvider> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mzn a(wzi<String> wzi, wzi<lar> wzi2, wzi<lav> wzi3, wzi<AlbumOfflineStateProvider> wzi4) {
        return new mzn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mzm((String) this.a.get(), (lar) this.b.get(), (lav) this.c.get(), (AlbumOfflineStateProvider) this.d.get());
    }
}
