package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: luq reason: default package */
public final class luq implements luu {
    private final Player a;

    public luq(Player player) {
        this.a = player;
    }

    public final void a(String str) {
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb.toString());
        this.a.play((PlayerContext) fay.a(createFromContextUrl), new Builder().build());
    }
}
