package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: qke reason: default package */
public final class qke implements gxk {
    private final Player b;
    private final sso c;
    private final has d;

    public qke(Player player, sso sso, has has) {
        this.b = player;
        this.c = sso;
        this.d = has;
    }

    public static hci a(String str) {
        return hct.builder().a("freeTierPlayTrack").a("uri", str).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        fbp.a(gwy);
        String string = ((hci) fbp.a(hci)).data().string("uri");
        if (string != null) {
            this.b.play(PlayerContext.create(this.c.toString(), new PlayerTrack[]{PlayerTrack.create(string)}), new Builder().skipToIndex(0, 0).build());
            this.d.logInteraction(string, gwy.b, "play", null);
        }
    }
}
