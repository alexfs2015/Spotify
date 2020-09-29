package defpackage;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: ihe reason: default package */
public final class ihe {
    public final ihc a;
    Ad b;
    private FrameLayout c;
    private final kk d;
    private final lbr e;
    private final iba f;
    private final ibr g;
    private final iam h;

    /* renamed from: ihe$a */
    public interface a {
        ihe ap_();
    }

    public ihe(kk kkVar, lbr lbr, iba iba, ihc ihc, ibr ibr, iam iam) {
        this.d = (kk) fbp.a(kkVar);
        this.e = (lbr) fbp.a(lbr);
        this.f = iba;
        this.a = ihc;
        this.g = ibr;
        this.h = iam;
    }

    private void a(Fragment fragment) {
        if (fragment != null) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.d.a().a(fragment).d();
        }
    }

    private void a(Fragment fragment, String str, FrameLayout frameLayout) {
        this.c = frameLayout;
        this.c.bringToFront();
        this.d.a().a(this.c.getId(), fragment, str).b();
    }

    private void a(Ad ad, FrameLayout frameLayout, fqn fqn) {
        Assertion.a((Object) ad, "Need an ad to open screensaver ad fragment");
        a((Fragment) igx.a(ad, fqn), igx.a, frameLayout);
        this.e.a($$Lambda$ihe$eP16ViW_XFsEIUJIITp8MBNoevE.INSTANCE);
    }

    private void b(Ad ad, FrameLayout frameLayout, fqn fqn) {
        ial a2 = this.h.a(ad);
        if (fqn != null && ibr.a(fqn)) {
            this.f.a(a2);
        } else if (fqn == null || !ibr.b(fqn)) {
            Logger.b("[AudioPlus] - received audio+ ad for control group", new Object[0]);
        } else {
            a((Fragment) iat.a(a2), iat.a, frameLayout);
            this.e.a($$Lambda$ihe$DceY9QZFN9je_yJzYZhyLqmBeAo.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d() {
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean e() {
        return true;
    }

    public final void a() {
        Fragment a2 = this.d.a(igx.a);
        this.e.a(null);
        a(a2);
    }

    public final void a(FrameLayout frameLayout, fqn fqn) {
        Ad ad = this.b;
        if (ad != null) {
            if (ad.isAudioPlus()) {
                b(this.b, (FrameLayout) fbp.a(frameLayout), fqn);
            } else {
                a(this.b, (FrameLayout) fbp.a(frameLayout), fqn);
            }
            this.b = null;
        }
    }

    public final void b() {
        Fragment a2 = this.d.a(iat.a);
        this.e.a(null);
        a(a2);
    }

    public final void c() {
        this.f.a();
    }
}
