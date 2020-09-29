package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: uwk reason: default package */
public final class uwk implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private uwk(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static uwk a(wzi<PlayerFactory> wzi) {
        return new uwk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(ViewUris.bU.toString(), uqo.bg, rta.B), "Cannot return null from a non-@Nullable @Provides method");
    }
}
