package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider;

/* renamed from: loc reason: default package */
public final class loc implements vua<lob> {
    private final wlc<lnz> a;
    private final wlc<CollectionStateProvider> b;
    private final wlc<lkn> c;
    private final wlc<AlbumOfflineStateProvider> d;
    private final wlc<uhs> e;

    private loc(wlc<lnz> wlc, wlc<CollectionStateProvider> wlc2, wlc<lkn> wlc3, wlc<AlbumOfflineStateProvider> wlc4, wlc<uhs> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static loc a(wlc<lnz> wlc, wlc<CollectionStateProvider> wlc2, wlc<lkn> wlc3, wlc<AlbumOfflineStateProvider> wlc4, wlc<uhs> wlc5) {
        loc loc = new loc(wlc, wlc2, wlc3, wlc4, wlc5);
        return loc;
    }

    public final /* synthetic */ Object get() {
        lob lob = new lob((lnz) this.a.get(), (CollectionStateProvider) this.b.get(), (lkn) this.c.get(), (AlbumOfflineStateProvider) this.d.get(), (uhs) this.e.get());
        return lob;
    }
}
