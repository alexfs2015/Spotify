package defpackage;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: ier reason: default package */
public final class ier {
    public final iep a;
    Ad b;
    private FrameLayout c;
    private final kf d;
    private final kyi e;
    private final hyo f;
    private final hzf g;
    private final hya h;

    /* renamed from: ier$a */
    public interface a {
        ier aq_();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d() {
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean e() {
        return true;
    }

    public ier(kf kfVar, kyi kyi, hyo hyo, iep iep, hzf hzf, hya hya) {
        this.d = (kf) fay.a(kfVar);
        this.e = (kyi) fay.a(kyi);
        this.f = hyo;
        this.a = iep;
        this.g = hzf;
        this.h = hya;
    }

    private void a(Ad ad, FrameLayout frameLayout, fpt fpt) {
        Assertion.a((Object) ad, "Need an ad to open screensaver ad fragment");
        a((Fragment) iek.a(ad, fpt), iek.a, frameLayout);
        this.e.a($$Lambda$ier$FuhkknYIxfRgyYQw0_YwoXHgW_s.INSTANCE);
    }

    public final void a() {
        Fragment a2 = this.d.a(iek.a);
        this.e.a(null);
        a(a2);
    }

    public final void a(FrameLayout frameLayout, fpt fpt) {
        Ad ad = this.b;
        if (ad != null) {
            if (ad.isAudioPlus()) {
                b(this.b, (FrameLayout) fay.a(frameLayout), fpt);
            } else {
                a(this.b, (FrameLayout) fay.a(frameLayout), fpt);
            }
            this.b = null;
        }
    }

    private void b(Ad ad, FrameLayout frameLayout, fpt fpt) {
        hxz a2 = this.h.a(ad);
        if (fpt != null && hzf.a(fpt)) {
            this.f.a(a2);
        } else if (fpt == null || !hzf.b(fpt)) {
            Logger.b("[AudioPlus] - received audio+ ad for control group", new Object[0]);
        } else {
            a((Fragment) hyh.a(a2), hyh.a, frameLayout);
            this.e.a($$Lambda$ier$yK8SkC76xr7D5ctOtg6ukCAsOw.INSTANCE);
        }
    }

    public final void b() {
        Fragment a2 = this.d.a(hyh.a);
        this.e.a(null);
        a(a2);
    }

    public final void c() {
        this.f.a();
    }

    private void a(Fragment fragment, String str, FrameLayout frameLayout) {
        this.c = frameLayout;
        this.c.bringToFront();
        this.d.a().a(this.c.getId(), fragment, str).b();
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
}
