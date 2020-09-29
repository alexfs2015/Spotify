package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: lmu reason: default package */
public final class lmu implements wig<Player> {
    private final wzi<PlayerFactory> a;
    private final wzi<sso> b;
    private final wzi<uqm> c;
    private final wzi<gkm> d;

    private lmu(wzi<PlayerFactory> wzi, wzi<sso> wzi2, wzi<uqm> wzi3, wzi<gkm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static lmu a(wzi<PlayerFactory> wzi, wzi<sso> wzi2, wzi<uqm> wzi3, wzi<gkm> wzi4) {
        return new lmu(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(CC.a((PlayerFactory) this.a.get(), (sso) this.b.get(), (uqm) this.c.get(), (gkm) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
