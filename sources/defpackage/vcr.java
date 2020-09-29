package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: vcr reason: default package */
public final class vcr implements wig<vcq> {
    private final wzi<Player> a;
    private final wzi<a> b;
    private final wzi<PlayerState> c;

    private vcr(wzi<Player> wzi, wzi<a> wzi2, wzi<PlayerState> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static vcr a(wzi<Player> wzi, wzi<a> wzi2, wzi<PlayerState> wzi3) {
        return new vcr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new vcq((Player) this.a.get(), (a) this.b.get(), this.c);
    }
}
