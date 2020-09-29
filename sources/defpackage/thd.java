package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;

/* renamed from: thd reason: default package */
public final class thd implements a, a<Ad> {
    public a a;
    private final tgy b;
    private final ibt c;
    private final ibx d;
    private final ibv e;
    private final vcy f;
    private final iil g;
    private final int h;
    private Ad i;
    private thk j;
    private Long k;

    public thd(tgy tgy, ibt ibt, ibx ibx, ibv ibv, vcy vcy, iil iil, int i2) {
        this.b = tgy;
        this.c = ibt;
        this.d = ibx;
        this.e = ibv;
        this.f = vcy;
        this.g = iil;
        this.h = i2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.k = l;
    }

    public final void a() {
        this.c.accept(this.i, this.k);
    }

    public final void a(thk thk) {
        this.j = thk;
        this.j.a((a) this);
        this.f.a((a<T>) new $$Lambda$thd$PMzA4EtZC_iNXoRHuapiask7M<T>(this));
        this.b.a((a<T>) this);
    }

    public final void b() {
        this.d.accept(this.i, this.k);
    }

    public final void c() {
        this.e.accept(this.i, this.k);
    }

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
            this.j.a(ad.getButtonText(), iil.a(ad));
            this.j.b(Boolean.FALSE);
            this.j.a(Boolean.FALSE);
            this.j.c(Boolean.TRUE);
        }
    }
}
