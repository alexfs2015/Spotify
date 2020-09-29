package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tbg reason: default package */
public final class tbg extends vdm {
    private final Player a;
    private final rpa b;
    private final ttf c;

    public tbg(Player player, vcq vcq, vdo vdo, vdl vdl, rpa rpa, ttf ttf) {
        super(player, vcq, vdo, vdl);
        this.a = player;
        this.b = rpa;
        this.c = ttf;
    }

    public final void a() {
        super.a();
        this.b.a.b();
        if (((PlayerState) fbp.a(this.a.getLastPlayerState())).restrictions().disallowPeekingNextReasons().contains(DisallowReasons.MFT)) {
            this.c.a();
        }
    }
}
