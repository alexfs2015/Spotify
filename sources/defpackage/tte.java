package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tte reason: default package */
public final class tte implements vua<ttd> {
    private final wlc<ttf> a;
    private final wlc<Player> b;
    private final wlc<tvw> c;
    private final wlc<sih> d;
    private final wlc<ttv> e;

    private tte(wlc<ttf> wlc, wlc<Player> wlc2, wlc<tvw> wlc3, wlc<sih> wlc4, wlc<ttv> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static tte a(wlc<ttf> wlc, wlc<Player> wlc2, wlc<tvw> wlc3, wlc<sih> wlc4, wlc<ttv> wlc5) {
        tte tte = new tte(wlc, wlc2, wlc3, wlc4, wlc5);
        return tte;
    }

    public final /* synthetic */ Object get() {
        ttd ttd = new ttd((ttf) this.a.get(), (Player) this.b.get(), (tvw) this.c.get(), (sih) this.d.get(), (ttv) this.e.get());
        return ttd;
    }
}
