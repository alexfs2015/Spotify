package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.premiumreactivation.NotificationDay;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: ppr reason: default package */
public class ppr extends jry {
    public ppu T;
    public jty U;
    private xok V;
    private Intent W;
    private String X;
    public ppx a;
    public xil b;

    /* access modifiers changed from: private */
    public void a(NotificationDay notificationDay) {
        this.W = PremiumSignupActivity.a((Context) fbp.a(p()), mfw.g().a(SubView.CANCEL_STATE_INTERSTITIAL).a("").a(Uri.parse("https://www.spotify.com/redirect/csi/?platform=android")).a(this.U).a());
        this.X = notificationDay.a();
        if (this.Y != null) {
            this.Y.a((jry) this);
        }
    }

    public static ppr e() {
        ppr ppr = new ppr();
        ppr.g(new Bundle());
        return ppr;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(jue jue) {
        super.a(jue);
        if (this.W != null) {
            this.Y.a((jry) this);
        }
    }

    public final void aP_() {
        super.aP_();
        if (this.W == null) {
            this.V.a(this.a.a().a(this.b).a((xis<? super T>) new $$Lambda$ppr$eaRG4zviNx9k6uRUn49bbhwiDI8<Object>(this), (xis<Throwable>) $$Lambda$ppr$TO42yXlUkTiyHsk6LJiVnlGx3IM.INSTANCE));
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.V = new xok();
        if (bundle != null) {
            this.W = (Intent) bundle.getParcelable("reactivation-activity-intent");
            this.X = bundle.getString("notification-id");
        }
    }

    public final void c() {
        super.c();
        if (this.W != null) {
            ppx ppx = this.a;
            NotificationDay a2 = NotificationDay.a(this.X);
            if (a2 != null) {
                ppx.a.a.a().a(a2.mPreferenceKey, true).b();
            }
            a(this.W);
            this.W = null;
            this.T.a("impression");
        }
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("reactivation-activity-intent", this.W);
        bundle.putString("notification-id", this.X);
        super.e(bundle);
    }

    public final void h() {
        this.V.unsubscribe();
        super.h();
    }
}
