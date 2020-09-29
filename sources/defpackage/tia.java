package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;

/* renamed from: tia reason: default package */
public final class tia implements a<PlayerTrack> {
    public final urn a;
    public tib b;

    public final /* synthetic */ void onChanged(Object obj) {
        this.b.a(InterruptionUtil.isInterruptionUri(((PlayerTrack) obj).uri()) ? R.string.sas_interruption_title : R.string.video_ads_header_title);
    }

    public tia(urn urn) {
        this.a = urn;
    }
}
