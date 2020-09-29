package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lgz reason: default package */
public final class lgz implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private lgz(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static lgz a(wzi<PlayerFactory> wzi) {
        return new lgz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(ViewUris.w.toString(), uqo.Q, rta.g), "Cannot return null from a non-@Nullable @Provides method");
    }
}
