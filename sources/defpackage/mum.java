package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;

/* renamed from: mum reason: default package */
public final class mum implements vua<mul> {
    private final wlc<String> a;
    private final wlc<kxi> b;
    private final wlc<kxm> c;
    private final wlc<AlbumOfflineStateProvider> d;

    private mum(wlc<String> wlc, wlc<kxi> wlc2, wlc<kxm> wlc3, wlc<AlbumOfflineStateProvider> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mum a(wlc<String> wlc, wlc<kxi> wlc2, wlc<kxm> wlc3, wlc<AlbumOfflineStateProvider> wlc4) {
        return new mum(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mul((String) this.a.get(), (kxi) this.b.get(), (kxm) this.c.get(), (AlbumOfflineStateProvider) this.d.get());
    }
}
