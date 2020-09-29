package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: hcq reason: default package */
public final class hcq implements vua<Player> {
    private final wlc<PlayerFactory> a;
    private final wlc<sih> b;
    private final wlc<gjb> c;

    private hcq(wlc<PlayerFactory> wlc, wlc<sih> wlc2, wlc<gjb> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hcq a(wlc<PlayerFactory> wlc, wlc<sih> wlc2, wlc<gjb> wlc3) {
        return new hcq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(((PlayerFactory) this.a.get()).create(((sih) this.b.get()).toString(), udt.aB, (gjb) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
