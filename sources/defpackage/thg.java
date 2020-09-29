package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;

/* renamed from: thg reason: default package */
public final class thg implements a<PlayerTrack> {
    public final vcs a;
    public final tgy b;
    public thl c;
    public final a<Ad> d = new $$Lambda$thg$zHYN5HWaU270xEEKo6FikwySNgs(this);
    private final int e;

    public thg(vcs vcs, tgy tgy, int i) {
        this.a = vcs;
        this.b = tgy;
        this.e = i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        this.c.a(ad.isVoiceAd() ? R.string.voice_ads_header_title : R.string.audio_ads_header_title);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (this.e == 1) {
            this.c.a(fbo.b((String) playerTrack.metadata().get("advertiser")));
        }
    }
}
