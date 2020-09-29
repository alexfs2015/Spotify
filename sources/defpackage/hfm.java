package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: hfm reason: default package */
public final class hfm implements wig<Player> {
    private final wzi<PlayerFactory> a;
    private final wzi<sso> b;
    private final wzi<gkm> c;

    private hfm(wzi<PlayerFactory> wzi, wzi<sso> wzi2, wzi<gkm> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hfm a(wzi<PlayerFactory> wzi, wzi<sso> wzi2, wzi<gkm> wzi3) {
        return new hfm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(((sso) this.b.get()).toString(), uqo.aB, (gkm) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
