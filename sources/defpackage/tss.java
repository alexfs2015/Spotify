package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;

/* renamed from: tss reason: default package */
public final class tss implements a<PlayerTrack> {
    public final vcs a;
    public tst b;

    public tss(vcs vcs) {
        this.a = vcs;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.b.a(InterruptionUtil.isInterruptionUri(((PlayerTrack) obj).uri()) ? R.string.sas_interruption_title : R.string.video_ads_header_title);
    }
}