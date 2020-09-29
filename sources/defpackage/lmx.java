package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: lmx reason: default package */
public final class lmx implements wig<Player> {
    private final wzi<PlayerFactory> a;
    private final wzi<sso> b;
    private final wzi<uqm> c;
    private final wzi<gkm> d;

    private lmx(wzi<PlayerFactory> wzi, wzi<sso> wzi2, wzi<uqm> wzi3, wzi<gkm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static Player a(PlayerFactory playerFactory, sso sso, uqm uqm, gkm gkm) {
        return (Player) wil.a(CC.a(playerFactory, sso, uqm, gkm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lmx a(wzi<PlayerFactory> wzi, wzi<sso> wzi2, wzi<uqm> wzi3, wzi<gkm> wzi4) {
        return new lmx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return a((PlayerFactory) this.a.get(), (sso) this.b.get(), (uqm) this.c.get(), (gkm) this.d.get());
    }
}
