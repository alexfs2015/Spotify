package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider;

/* renamed from: lsc reason: default package */
public final class lsc implements wig<lsb> {
    private final wzi<lrz> a;
    private final wzi<CollectionStateProvider> b;
    private final wzi<lon> c;
    private final wzi<AlbumOfflineStateProvider> d;
    private final wzi<utg> e;

    private lsc(wzi<lrz> wzi, wzi<CollectionStateProvider> wzi2, wzi<lon> wzi3, wzi<AlbumOfflineStateProvider> wzi4, wzi<utg> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static lsc a(wzi<lrz> wzi, wzi<CollectionStateProvider> wzi2, wzi<lon> wzi3, wzi<AlbumOfflineStateProvider> wzi4, wzi<utg> wzi5) {
        lsc lsc = new lsc(wzi, wzi2, wzi3, wzi4, wzi5);
        return lsc;
    }

    public final /* synthetic */ Object get() {
        lsb lsb = new lsb((lrz) this.a.get(), (CollectionStateProvider) this.b.get(), (lon) this.c.get(), (AlbumOfflineStateProvider) this.d.get(), (utg) this.e.get());
        return lsb;
    }
}
