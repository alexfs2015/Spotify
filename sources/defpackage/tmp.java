package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tmp reason: default package */
public final class tmp implements vua<tmo> {
    private final wlc<tmq> a;
    private final wlc<uxc> b;
    private final wlc<tmr> c;
    private final wlc<Player> d;
    private final wlc<PlayOrigin> e;
    private final wlc<wug> f;

    private tmp(wlc<tmq> wlc, wlc<uxc> wlc2, wlc<tmr> wlc3, wlc<Player> wlc4, wlc<PlayOrigin> wlc5, wlc<wug> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static tmp a(wlc<tmq> wlc, wlc<uxc> wlc2, wlc<tmr> wlc3, wlc<Player> wlc4, wlc<PlayOrigin> wlc5, wlc<wug> wlc6) {
        tmp tmp = new tmp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return tmp;
    }

    public final /* synthetic */ Object get() {
        tmo tmo = new tmo((tmq) this.a.get(), (uxc) this.b.get(), (tmr) this.c.get(), (Player) this.d.get(), (PlayOrigin) this.e.get(), (wug) this.f.get());
        return tmo;
    }
}
