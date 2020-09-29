package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: rzy reason: default package */
public final class rzy implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private rzy(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static rzy a(wzi<PlayerFactory> wzi) {
        return new rzy(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(ViewUris.bZ.toString(), uqo.aO, rta.y), "Cannot return null from a non-@Nullable @Provides method");
    }
}
