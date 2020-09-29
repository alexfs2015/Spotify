package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: qll reason: default package */
public final class qll implements sqw {
    private final Player a;
    private final skq b;

    public qll(skq skq, Player player) {
        this.a = player;
        this.b = (skq) fbp.a(skq);
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb.toString());
        this.a.play((PlayerContext) fbp.a(createFromContextUrl), new Builder().build());
        String b2 = ute.b(str);
        if (b2 != null) {
            this.b.b(b2, str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Station for uri ");
        sb2.append(str);
        sb2.append("could not be created");
        Assertion.b(sb2.toString());
    }
}
