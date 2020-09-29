package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;
import com.squareup.picasso.Picasso;

/* renamed from: thf reason: default package */
public final class thf implements a<PlayerTrack> {
    public a a;
    private final vcs b;
    private final vcy c;
    private final tgy d;
    private final ibt e;
    private final ibv f;
    private final Picasso g;
    private ImageView h;
    private Ad i;
    private Long j;

    public thf(vcs vcs, tgy tgy, ibt ibt, ibv ibv, vcy vcy, Picasso picasso) {
        this.b = vcs;
        this.d = tgy;
        this.e = ibt;
        this.f = ibv;
        this.c = vcy;
        this.g = picasso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        Ad ad = this.i;
        if (ad != null) {
            if (ad.getAdType() != AdType.OFFER_AD) {
                if (this.i.isVoiceAd()) {
                    this.f.a = this.a;
                }
                this.f.accept(this.i, this.j);
            } else if (this.i.getFeaturedActionType() == FeaturedActionType.OPT_IN) {
                this.e.accept(this.i, this.j);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        this.i = ad;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.j = l;
    }

    public final void a(ImageView imageView) {
        this.h = imageView;
        this.h.setOnClickListener(new $$Lambda$thf$fDAFFT6CRJ1yN7a4u9F1VqD7Us(this));
        this.c.a((a<T>) new $$Lambda$thf$mvdoHG1BTgO94i0GnbK28xZi4<T>(this));
        this.b.a((a<T>) this);
        this.d.a((a<T>) new $$Lambda$thf$HfrR23Tk8rrjTrvpKYkZtA_A<T>(this));
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (PlayerTrackUtil.isAd(playerTrack)) {
            this.g.a(iyd.a(playerTrack)).a(this.h);
        }
    }
}
