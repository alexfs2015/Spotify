package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qps reason: default package */
public final class qps implements vua<qpr> {
    private final wlc<Player> a;

    private qps(wlc<Player> wlc) {
        this.a = wlc;
    }

    public static qps a(wlc<Player> wlc) {
        return new qps(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qpr((Player) this.a.get());
    }
}
