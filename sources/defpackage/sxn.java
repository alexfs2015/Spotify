package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: sxn reason: default package */
public final class sxn implements vua<sxm> {
    private final wlc<Player> a;
    private final wlc<url> b;
    private final wlc<kxc> c;
    private final wlc<urz> d;
    private final wlc<sxj> e;

    private sxn(wlc<Player> wlc, wlc<url> wlc2, wlc<kxc> wlc3, wlc<urz> wlc4, wlc<sxj> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static sxn a(wlc<Player> wlc, wlc<url> wlc2, wlc<kxc> wlc3, wlc<urz> wlc4, wlc<sxj> wlc5) {
        sxn sxn = new sxn(wlc, wlc2, wlc3, wlc4, wlc5);
        return sxn;
    }

    public final /* synthetic */ Object get() {
        sxm sxm = new sxm((Player) this.a.get(), (url) this.b.get(), (kxc) this.c.get(), (urz) this.d.get(), (sxj) this.e.get());
        return sxm;
    }
}
