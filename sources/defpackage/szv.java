package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: szv reason: default package */
public final class szv implements vua<szu> {
    private final wlc<Player> a;
    private final wlc<url> b;
    private final wlc<sih> c;
    private final wlc<kxi> d;
    private final wlc<rbe> e;
    private final wlc<utd> f;
    private final wlc<szw> g;

    private szv(wlc<Player> wlc, wlc<url> wlc2, wlc<sih> wlc3, wlc<kxi> wlc4, wlc<rbe> wlc5, wlc<utd> wlc6, wlc<szw> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static szv a(wlc<Player> wlc, wlc<url> wlc2, wlc<sih> wlc3, wlc<kxi> wlc4, wlc<rbe> wlc5, wlc<utd> wlc6, wlc<szw> wlc7) {
        szv szv = new szv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return szv;
    }

    public final /* synthetic */ Object get() {
        szu szu = new szu((Player) this.a.get(), (url) this.b.get(), (sih) this.c.get(), (kxi) this.d.get(), (rbe) this.e.get(), (utd) this.f.get(), (szw) this.g.get());
        return szu;
    }
}
