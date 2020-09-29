package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: sqz reason: default package */
public final class sqz extends ush {
    private final Player a;
    private final rfy b;
    private final tin c;

    public sqz(Player player, url url, usj usj, usg usg, rfy rfy, tin tin) {
        super(player, url, usj, usg);
        this.a = player;
        this.b = rfy;
        this.c = tin;
    }

    public final void a() {
        super.a();
        this.b.a.b();
        if (((PlayerState) fay.a(this.a.getLastPlayerState())).restrictions().disallowPeekingNextReasons().contains(DisallowReasons.MFT)) {
            this.c.a();
        }
    }
}
