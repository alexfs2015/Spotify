package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;

/* renamed from: sww reason: default package */
public final class sww implements a, a<Ad> {
    public a a;
    private final swr b;
    private final hzh c;
    private final hzl d;
    private final hzj e;
    private final urt f;
    private final ify g;
    private final int h;
    private Ad i;
    private sxd j;
    private Long k;

    public final /* synthetic */ void onChanged(Object obj) {
        Ad ad = (Ad) obj;
        this.i = ad;
        FeaturedActionType featuredActionType = ad.getFeaturedActionType();
        if (ad.getAdType() == AdType.OFFER_AD) {
            if (featuredActionType == FeaturedActionType.OPT_OUT) {
                this.j.a(ad.getButtonText());
                this.j.a(Boolean.TRUE);
                this.j.b(Boolean.FALSE);
                this.j.c(Boolean.FALSE);
            } else if (featuredActionType == FeaturedActionType.OPT_IN) {
                this.j.a(Boolean.FALSE);
                this.j.a((String) null);
                this.j.b(Boolean.TRUE);
                this.j.b(ad.getButtonText());
            }
        } else if (ad.getAdType() == AdType.END_CARD_AD) {
            this.j.a(ad.getButtonText(), false);
            this.j.c(Boolean.TRUE);
            this.j.a(Boolean.FALSE);
            this.j.b(Boolean.FALSE);
        } else {
            if (this.h == 2) {
                this.j.c(ad.advertiser());
                this.j.d(Boolean.TRUE);
            }
            if (this.i.isVoiceAd()) {
                this.e.a = this.a;
            }
            this.j.a(ad.getButtonText(), ify.a(ad));
            this.j.b(Boolean.FALSE);
            this.j.a(Boolean.FALSE);
            this.j.c(Boolean.TRUE);
        }
    }

    public sww(swr swr, hzh hzh, hzl hzl, hzj hzj, urt urt, ify ify, int i2) {
        this.b = swr;
        this.c = hzh;
        this.d = hzl;
        this.e = hzj;
        this.f = urt;
        this.g = ify;
        this.h = i2;
    }

    public final void a() {
        this.c.accept(this.i, this.k);
    }

    public final void b() {
        this.d.accept(this.i, this.k);
    }

    public final void c() {
        this.e.accept(this.i, this.k);
    }

    public final void a(sxd sxd) {
        this.j = sxd;
        this.j.a((a) this);
        this.f.a((a<T>) new $$Lambda$sww$_othtY12jr4iezPfyJBI8TjBPFE<T>(this));
        this.b.a((a<T>) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.k = l;
    }
}
