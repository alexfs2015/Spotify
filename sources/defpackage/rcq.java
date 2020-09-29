package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader;

/* renamed from: rcq reason: default package */
public final class rcq implements wig<rcp> {
    private final wzi<RxResolver> a;
    private final wzi<AlbumRecsLoader> b;
    private final wzi<rgf> c;
    private final wzi<CollectionStateProvider> d;
    private final wzi<jrn> e;
    private final wzi<xil> f;
    private final wzi<xil> g;

    private rcq(wzi<RxResolver> wzi, wzi<AlbumRecsLoader> wzi2, wzi<rgf> wzi3, wzi<CollectionStateProvider> wzi4, wzi<jrn> wzi5, wzi<xil> wzi6, wzi<xil> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static rcq a(wzi<RxResolver> wzi, wzi<AlbumRecsLoader> wzi2, wzi<rgf> wzi3, wzi<CollectionStateProvider> wzi4, wzi<jrn> wzi5, wzi<xil> wzi6, wzi<xil> wzi7) {
        rcq rcq = new rcq(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return rcq;
    }

    public final /* synthetic */ Object get() {
        rcp rcp = new rcp((RxResolver) this.a.get(), (AlbumRecsLoader) this.b.get(), (rgf) this.c.get(), (CollectionStateProvider) this.d.get(), (jrn) this.e.get(), (xil) this.f.get(), (xil) this.g.get());
        return rcp;
    }
}
