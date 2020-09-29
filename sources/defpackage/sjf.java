package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: sjf reason: default package */
public final class sjf implements vua<sje> {
    private final wlc<String> a;
    private final wlc<Player> b;
    private final wlc<guz> c;
    private final wlc<sjv> d;
    private final wlc<sjx> e;

    private sjf(wlc<String> wlc, wlc<Player> wlc2, wlc<guz> wlc3, wlc<sjv> wlc4, wlc<sjx> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static sjf a(wlc<String> wlc, wlc<Player> wlc2, wlc<guz> wlc3, wlc<sjv> wlc4, wlc<sjx> wlc5) {
        sjf sjf = new sjf(wlc, wlc2, wlc3, wlc4, wlc5);
        return sjf;
    }

    public final /* synthetic */ Object get() {
        sje sje = new sje((String) this.a.get(), (Player) this.b.get(), (guz) this.c.get(), (sjv) this.d.get(), (sjx) this.e.get());
        return sje;
    }
}
