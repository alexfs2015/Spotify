package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: pvw reason: default package */
public final class pvw implements vua<pvv> {
    private final wlc<ryz> a;
    private final wlc<sfu> b;
    private final wlc<sgn> c;
    private final wlc<gys> d;
    private final wlc<Player> e;
    private final wlc<gxz> f;
    private final wlc<saj> g;

    private pvw(wlc<ryz> wlc, wlc<sfu> wlc2, wlc<sgn> wlc3, wlc<gys> wlc4, wlc<Player> wlc5, wlc<gxz> wlc6, wlc<saj> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static pvw a(wlc<ryz> wlc, wlc<sfu> wlc2, wlc<sgn> wlc3, wlc<gys> wlc4, wlc<Player> wlc5, wlc<gxz> wlc6, wlc<saj> wlc7) {
        pvw pvw = new pvw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return pvw;
    }

    public final /* synthetic */ Object get() {
        pvv pvv = new pvv((ryz) this.a.get(), (sfu) this.b.get(), (sgn) this.c.get(), (gys) this.d.get(), (Player) this.e.get(), (gxz) this.f.get(), (saj) this.g.get());
        return pvv;
    }
}
