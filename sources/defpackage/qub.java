package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader;

/* renamed from: qub reason: default package */
public final class qub implements vua<qua> {
    private final wlc<RxResolver> a;
    private final wlc<AlbumRecsLoader> b;
    private final wlc<qxq> c;
    private final wlc<CollectionStateProvider> d;
    private final wlc<jpb> e;
    private final wlc<wug> f;
    private final wlc<wug> g;

    private qub(wlc<RxResolver> wlc, wlc<AlbumRecsLoader> wlc2, wlc<qxq> wlc3, wlc<CollectionStateProvider> wlc4, wlc<jpb> wlc5, wlc<wug> wlc6, wlc<wug> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static qub a(wlc<RxResolver> wlc, wlc<AlbumRecsLoader> wlc2, wlc<qxq> wlc3, wlc<CollectionStateProvider> wlc4, wlc<jpb> wlc5, wlc<wug> wlc6, wlc<wug> wlc7) {
        qub qub = new qub(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return qub;
    }

    public final /* synthetic */ Object get() {
        qua qua = new qua((RxResolver) this.a.get(), (AlbumRecsLoader) this.b.get(), (qxq) this.c.get(), (CollectionStateProvider) this.d.get(), (jpb) this.e.get(), (wug) this.f.get(), (wug) this.g.get());
        return qua;
    }
}
