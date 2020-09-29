package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;

/* renamed from: mui reason: default package */
public final class mui implements vua<muh> {
    private final wlc<heg> a;
    private final wlc<String> b;
    private final wlc<AlbumOfflineStateProvider> c;

    private mui(wlc<heg> wlc, wlc<String> wlc2, wlc<AlbumOfflineStateProvider> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mui a(wlc<heg> wlc, wlc<String> wlc2, wlc<AlbumOfflineStateProvider> wlc3) {
        return new mui(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new muh((heg) this.a.get(), (String) this.b.get(), (AlbumOfflineStateProvider) this.c.get());
    }
}
