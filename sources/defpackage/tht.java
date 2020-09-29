package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: tht reason: default package */
public final class tht implements a, a<Ad> {
    public final thp a;
    public final urn b;
    public thu c;
    public final urt d;
    Long e;
    boolean f;
    public final a<Long> g = new a<Long>() {
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            tht.this.e = (Long) obj;
        }
    };
    public final a<PlayerTrack> h = new a<PlayerTrack>() {
        public final /* synthetic */ void onChanged(Object obj) {
            PlayerTrack playerTrack = (PlayerTrack) obj;
            tht.this.f = InterruptionUtil.isInterruptionUri(playerTrack.uri());
        }
    };
    private final hzj i;
    private final thy j;
    private Ad k;

    public final /* synthetic */ void onChanged(Object obj) {
        Ad ad = (Ad) obj;
        this.k = ad;
        if (this.f) {
            this.c.a(false);
        } else if (fax.a(ad.clickUrl())) {
            this.c.a(false);
        } else {
            this.c.a(true);
            if (ad.hasAction()) {
                this.c.a(ad.getButtonText());
            } else {
                this.c.a(this.j.a());
            }
        }
    }

    public tht(thp thp, hzj hzj, urt urt, urn urn, thy thy) {
        this.a = thp;
        this.i = hzj;
        this.d = urt;
        this.b = urn;
        this.j = thy;
    }

    public final void a() {
        this.i.accept(this.k, this.e);
    }
}
