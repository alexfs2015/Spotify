package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;

/* renamed from: swz reason: default package */
public final class swz implements a<PlayerTrack> {
    public final urn a;
    public final swr b;
    public sxe c;
    public final a<Ad> d = new $$Lambda$swz$McGJTrDzmOPnNuJ1A8hvml85U(this);
    private final int e;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (this.e == 1) {
            this.c.a(fax.b((String) playerTrack.metadata().get("advertiser")));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        this.c.a(ad.isVoiceAd() ? R.string.voice_ads_header_title : R.string.audio_ads_header_title);
    }

    public swz(urn urn, swr swr, int i) {
        this.a = urn;
        this.b = swr;
        this.e = i;
    }
}
