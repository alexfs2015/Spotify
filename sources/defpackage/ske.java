package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ske reason: default package */
public final class ske implements vua<skd> {
    private final wlc<Player> a;
    private final wlc<a> b;
    private final wlc<gyj> c;
    private final wlc<gzm> d;
    private final wlc<vol> e;

    private ske(wlc<Player> wlc, wlc<a> wlc2, wlc<gyj> wlc3, wlc<gzm> wlc4, wlc<vol> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ske a(wlc<Player> wlc, wlc<a> wlc2, wlc<gyj> wlc3, wlc<gzm> wlc4, wlc<vol> wlc5) {
        ske ske = new ske(wlc, wlc2, wlc3, wlc4, wlc5);
        return ske;
    }

    public final /* synthetic */ Object get() {
        skd skd = new skd((Player) this.a.get(), (a) this.b.get(), (gyj) this.c.get(), (gzm) this.d.get(), (vol) this.e.get());
        return skd;
    }
}
