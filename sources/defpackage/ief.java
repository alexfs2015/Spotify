package defpackage;

import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;

/* renamed from: ief reason: default package */
public final class ief implements a {
    public final ier a;
    public final FrameLayout b;
    public final hza c;
    public fpt d;
    public final iep e;
    public final hzb f;
    public final a g = new $$Lambda$s_D7ClcMHjJkes32wOl58y70Ux8(this);

    public ief(ka kaVar, kyi kyi, fpt fpt, hyo hyo, iep iep, ies ies, tcn tcn, hzb hzb) {
        ies ies2 = ies;
        this.d = fpt;
        ier ier = new ier((kf) ies.a(((ka) fay.a(kaVar)).i(), 1), (kyi) ies.a((kyi) fay.a(kyi), 2), (hyo) ies.a(hyo, 3), (iep) ies.a(ies2.a.get(), 4), (hzf) ies.a(ies2.b.get(), 5), (hya) ies.a(ies2.c.get(), 6));
        this.a = ier;
        ka kaVar2 = kaVar;
        this.b = (FrameLayout) fay.a(kaVar.findViewById(R.id.screensaver_ad_container));
        hzd hzd = new hzd(tcn);
        this.c = new hza(hzd, hzd, hzd);
        this.e = iep;
        this.f = hzb;
    }

    public final void a(Ad ad) {
        ier ier = this.a;
        ier.b = ad;
        ier.a(this.b, this.d);
    }

    public final ier aq_() {
        return this.a;
    }
}
