package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: sxp reason: default package */
public final class sxp implements vua<sxo> {
    private final wlc<Player> a;
    private final wlc<url> b;
    private final wlc<rbe> c;
    private final wlc<urz> d;
    private final wlc<sxj> e;
    private final wlc<sih> f;

    private sxp(wlc<Player> wlc, wlc<url> wlc2, wlc<rbe> wlc3, wlc<urz> wlc4, wlc<sxj> wlc5, wlc<sih> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static sxp a(wlc<Player> wlc, wlc<url> wlc2, wlc<rbe> wlc3, wlc<urz> wlc4, wlc<sxj> wlc5, wlc<sih> wlc6) {
        sxp sxp = new sxp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return sxp;
    }

    public final /* synthetic */ Object get() {
        sxo sxo = new sxo((Player) this.a.get(), (url) this.b.get(), (rbe) this.c.get(), (urz) this.d.get(), (sxj) this.e.get(), (sih) this.f.get());
        return sxo;
    }
}
