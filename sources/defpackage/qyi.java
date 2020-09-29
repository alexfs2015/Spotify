package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qyi reason: default package */
public final class qyi implements vua<qyh> {
    private final wlc<qyj> a;
    private final wlc<Player> b;
    private final wlc<sih> c;
    private final wlc<qsr> d;

    private qyi(wlc<qyj> wlc, wlc<Player> wlc2, wlc<sih> wlc3, wlc<qsr> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qyi a(wlc<qyj> wlc, wlc<Player> wlc2, wlc<sih> wlc3, wlc<qsr> wlc4) {
        return new qyi(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qyh((qyj) this.a.get(), (Player) this.b.get(), (sih) this.c.get(), (qsr) this.d.get());
    }
}
