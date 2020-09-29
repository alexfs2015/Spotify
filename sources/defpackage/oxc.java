package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: oxc reason: default package */
public final class oxc implements vua<ttf> {
    private final wlc<fpt> a;
    private final wlc<sih> b;
    private final wlc<Player> c;
    private final wlc<tvw> d;

    private oxc(wlc<fpt> wlc, wlc<sih> wlc2, wlc<Player> wlc3, wlc<tvw> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static oxc a(wlc<fpt> wlc, wlc<sih> wlc2, wlc<Player> wlc3, wlc<tvw> wlc4) {
        return new oxc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.a.get();
        ttf ttf = new ttf((sih) this.b.get(), (Player) this.c.get(), (tvw) this.d.get());
        ttf.a = fpt.b(rxd.a);
        return (ttf) vuf.a(ttf, "Cannot return null from a non-@Nullable @Provides method");
    }
}
