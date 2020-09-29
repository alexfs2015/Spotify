package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lgk reason: default package */
public final class lgk implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private lgk(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static lgk a(wzi<PlayerFactory> wzi) {
        return new lgk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(ViewUris.v.toString(), uqo.P, rta.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
