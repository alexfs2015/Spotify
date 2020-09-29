package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;
import com.squareup.picasso.Picasso;

/* renamed from: swy reason: default package */
public final class swy implements a<PlayerTrack> {
    public a a;
    private final urn b;
    private final urt c;
    private final swr d;
    private final hzh e;
    private final hzj f;
    private final Picasso g;
    private ImageView h;
    private Ad i;
    private Long j;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (PlayerTrackUtil.isAd(playerTrack)) {
            this.g.a(ivs.a(playerTrack)).a(this.h);
        }
    }

    public swy(urn urn, swr swr, hzh hzh, hzj hzj, urt urt, Picasso picasso) {
        this.b = urn;
        this.d = swr;
        this.e = hzh;
        this.f = hzj;
        this.c = urt;
        this.g = picasso;
    }

    public final void a(ImageView imageView) {
        this.h = imageView;
        this.h.setOnClickListener(new $$Lambda$swy$ORJw0qWtlumW1Bpg29ORscI0AY(this));
        this.c.a((a<T>) new $$Lambda$swy$83BNE0ldbCpb79KJrMoBsXrba0c<T>(this));
        this.b.a((a<T>) this);
        this.d.a((a<T>) new $$Lambda$swy$9azpHz16tidrD3XOFM2m4BEem18<T>(this));
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
    public /* synthetic */ void a(Long l) {
        this.j = l;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        this.i = ad;
    }
}
