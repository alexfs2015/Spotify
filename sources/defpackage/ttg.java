package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ttg reason: default package */
public final class ttg implements vua<ttf> {
    private final wlc<sih> a;
    private final wlc<Player> b;
    private final wlc<tvw> c;

    private ttg(wlc<sih> wlc, wlc<Player> wlc2, wlc<tvw> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ttg a(wlc<sih> wlc, wlc<Player> wlc2, wlc<tvw> wlc3) {
        return new ttg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ttf((sih) this.a.get(), (Player) this.b.get(), (tvw) this.c.get());
    }
}
