package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: tsl reason: default package */
public final class tsl implements a, a<Ad> {
    public final tsh a;
    public final vcs b;
    public tsm c;
    public final vcy d;
    Long e;
    boolean f;
    public final a<Long> g = new a<Long>() {
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            tsl.this.e = (Long) obj;
        }
    };
    public final a<PlayerTrack> h = new a<PlayerTrack>() {
        public final /* synthetic */ void onChanged(Object obj) {
            PlayerTrack playerTrack = (PlayerTrack) obj;
            tsl.this.f = InterruptionUtil.isInterruptionUri(playerTrack.uri());
        }
    };
    private final ibv i;
    private final tsq j;
    private Ad k;

    public tsl(tsh tsh, ibv ibv, vcy vcy, vcs vcs, tsq tsq) {
        this.a = tsh;
        this.i = ibv;
        this.d = vcy;
        this.b = vcs;
        this.j = tsq;
    }

    public final void a() {
        this.i.accept(this.k, this.e);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Ad ad = (Ad) obj;
        this.k = ad;
        if (this.f) {
            this.c.a(false);
        } else if (fbo.a(ad.clickUrl())) {
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
}
