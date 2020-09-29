package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;

/* renamed from: qlv reason: default package */
public final class qlv implements vua<qlu> {
    private final wlc<gky<ArtistSearchResponse>> a;
    private final wlc<jrp> b;
    private final wlc<qmc> c;
    private final wlc<qmc> d;

    private qlv(wlc<gky<ArtistSearchResponse>> wlc, wlc<jrp> wlc2, wlc<qmc> wlc3, wlc<qmc> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qlv a(wlc<gky<ArtistSearchResponse>> wlc, wlc<jrp> wlc2, wlc<qmc> wlc3, wlc<qmc> wlc4) {
        return new qlv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qlu((gky) this.a.get(), (jrp) this.b.get(), (qmc) this.c.get(), (qmc) this.d.get());
    }
}
