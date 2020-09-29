package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lsh reason: default package */
public final class lsh implements vua<lsg> {
    private final wlc<lse> a;
    private final wlc<AssistedCurationSearchLogger> b;
    private final wlc<ryz> c;
    private final wlc<sfu> d;
    private final wlc<sgn> e;

    private lsh(wlc<lse> wlc, wlc<AssistedCurationSearchLogger> wlc2, wlc<ryz> wlc3, wlc<sfu> wlc4, wlc<sgn> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lsh a(wlc<lse> wlc, wlc<AssistedCurationSearchLogger> wlc2, wlc<ryz> wlc3, wlc<sfu> wlc4, wlc<sgn> wlc5) {
        lsh lsh = new lsh(wlc, wlc2, wlc3, wlc4, wlc5);
        return lsh;
    }

    public final /* synthetic */ Object get() {
        lsg lsg = new lsg((lse) this.a.get(), (AssistedCurationSearchLogger) this.b.get(), (ryz) this.c.get(), (sfu) this.d.get(), (sgn) this.e.get());
        return lsg;
    }
}
