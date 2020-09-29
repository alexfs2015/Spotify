package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: kex reason: default package */
public final class kex implements vua<kew> {
    private final wlc<Player> a;

    private kex(wlc<Player> wlc) {
        this.a = wlc;
    }

    public static kex a(wlc<Player> wlc) {
        return new kex(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kew((Player) this.a.get());
    }
}
