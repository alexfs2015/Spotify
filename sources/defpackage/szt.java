package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: szt reason: default package */
public final class szt implements vua<szs> {
    private final wlc<Player> a;
    private final wlc<url> b;
    private final wlc<kxi> c;
    private final wlc<utd> d;
    private final wlc<szw> e;

    private szt(wlc<Player> wlc, wlc<url> wlc2, wlc<kxi> wlc3, wlc<utd> wlc4, wlc<szw> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static szt a(wlc<Player> wlc, wlc<url> wlc2, wlc<kxi> wlc3, wlc<utd> wlc4, wlc<szw> wlc5) {
        szt szt = new szt(wlc, wlc2, wlc3, wlc4, wlc5);
        return szt;
    }

    public final /* synthetic */ Object get() {
        szs szs = new szs((Player) this.a.get(), (url) this.b.get(), (kxi) this.c.get(), (utd) this.d.get(), (szw) this.e.get());
        return szs;
    }
}
