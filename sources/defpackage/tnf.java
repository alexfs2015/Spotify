package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tnf reason: default package */
public final class tnf implements vua<tne> {
    private final wlc<tng> a;
    private final wlc<tnl> b;
    private final wlc<tlh> c;
    private final wlc<Flowable<PlayerState>> d;
    private final wlc<rxh> e;
    private final wlc<wug> f;

    private tnf(wlc<tng> wlc, wlc<tnl> wlc2, wlc<tlh> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<rxh> wlc5, wlc<wug> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static tnf a(wlc<tng> wlc, wlc<tnl> wlc2, wlc<tlh> wlc3, wlc<Flowable<PlayerState>> wlc4, wlc<rxh> wlc5, wlc<wug> wlc6) {
        tnf tnf = new tnf(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return tnf;
    }

    public final /* synthetic */ Object get() {
        tne tne = new tne((tng) this.a.get(), (tnl) this.b.get(), (tlh) this.c.get(), (Flowable) this.d.get(), (rxh) this.e.get(), (wug) this.f.get());
        return tne;
    }
}
