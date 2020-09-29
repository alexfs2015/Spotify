package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tsn reason: default package */
public final class tsn implements a<PlayerTrack> {
    public final vcs a;
    public tso b;

    public tsn(vcs vcs) {
        this.a = vcs;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        this.b.a(!InterruptionUtil.isInterruptionUri(playerTrack.uri()));
        this.b.a(fbo.b((String) playerTrack.metadata().get("advertiser")));
    }
}
