package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: qbg reason: default package */
public final class qbg implements gvk {
    private final Player b;
    private final sih c;
    private final gxz d;

    public qbg(Player player, sih sih, gxz gxz) {
        this.b = player;
        this.c = sih;
        this.d = gxz;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        fay.a(guy);
        String string = ((gzp) fay.a(gzp)).data().string("uri");
        if (string != null) {
            this.b.play(PlayerContext.create(this.c.toString(), new PlayerTrack[]{PlayerTrack.create(string)}), new Builder().skipToIndex(0, 0).build());
            this.d.logInteraction(string, guy.b, "play", null);
        }
    }

    public static gzp a(String str) {
        return haa.builder().a("freeTierPlayTrack").a("uri", str).a();
    }
}
