package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: thv reason: default package */
public final class thv implements a<PlayerTrack> {
    public final urn a;
    public thw b;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        this.b.a(!InterruptionUtil.isInterruptionUri(playerTrack.uri()));
        this.b.a(fax.b((String) playerTrack.metadata().get("advertiser")));
    }

    public thv(urn urn) {
        this.a = urn;
    }
}
