package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: liv reason: default package */
public final class liv implements vua<Player> {
    private final wlc<PlayerFactory> a;
    private final wlc<sih> b;
    private final wlc<udr> c;
    private final wlc<gjb> d;

    private liv(wlc<PlayerFactory> wlc, wlc<sih> wlc2, wlc<udr> wlc3, wlc<gjb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static liv a(wlc<PlayerFactory> wlc, wlc<sih> wlc2, wlc<udr> wlc3, wlc<gjb> wlc4) {
        return new liv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(CC.a((PlayerFactory) this.a.get(), (sih) this.b.get(), (udr) this.c.get(), (gjb) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
