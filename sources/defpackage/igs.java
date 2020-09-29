package defpackage;

import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;

/* renamed from: igs reason: default package */
public final class igs implements a {
    public final ihe a;
    public final FrameLayout b;
    public final ibm c;
    public fqn d;
    public final ihc e;
    public final ibn f;
    public final a g = new $$Lambda$5jRBy0jnrLbtHR07_g_NCtlN9Qc(this);

    public igs(kf kfVar, lbr lbr, fqn fqn, iba iba, ihc ihc, ihf ihf, tmu tmu, ibn ibn) {
        ihf ihf2 = ihf;
        this.d = fqn;
        ihe ihe = new ihe((kk) ihf.a(((kf) fbp.a(kfVar)).i(), 1), (lbr) ihf.a((lbr) fbp.a(lbr), 2), (iba) ihf.a(iba, 3), (ihc) ihf.a(ihf2.a.get(), 4), (ibr) ihf.a(ihf2.b.get(), 5), (iam) ihf.a(ihf2.c.get(), 6));
        this.a = ihe;
        kf kfVar2 = kfVar;
        this.b = (FrameLayout) fbp.a(kfVar.findViewById(R.id.screensaver_ad_container));
        ibp ibp = new ibp(tmu);
        this.c = new ibm(ibp, ibp, ibp);
        this.e = ihc;
        this.f = ibn;
    }

    public final void a(Ad ad) {
        ihe ihe = this.a;
        ihe.b = ad;
        ihe.a(this.b, this.d);
    }

    public final ihe ap_() {
        return this.a;
    }
}
