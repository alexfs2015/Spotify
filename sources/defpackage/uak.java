package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: uak reason: default package */
public final class uak implements vua<uaj> {
    private final wlc<Player> a;
    private final wlc<jrp> b;
    private final wlc<tzx> c;

    private uak(wlc<Player> wlc, wlc<jrp> wlc2, wlc<tzx> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static uak a(wlc<Player> wlc, wlc<jrp> wlc2, wlc<tzx> wlc3) {
        return new uak(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new uaj(vtz.b(this.a), (jrp) this.b.get(), (tzx) this.c.get());
    }
}
