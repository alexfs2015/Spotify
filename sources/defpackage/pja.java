package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.premiumreactivation.NotificationDay;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: pja reason: default package */
public class pja extends jpm {
    public pjd T;
    public jro U;
    private xag V;
    private Intent W;
    private String X;
    public pjg a;
    public wug b;

    public static pja e() {
        pja pja = new pja();
        pja.g(new Bundle());
        return pja;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.V = new xag();
        if (bundle != null) {
            this.W = (Intent) bundle.getParcelable("reactivation-activity-intent");
            this.X = bundle.getString("notification-id");
        }
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("reactivation-activity-intent", this.W);
        bundle.putString("notification-id", this.X);
        super.e(bundle);
    }

    public final void g() {
        super.g();
        if (this.W == null) {
            this.V.a(this.a.a().a(this.b).a((wun<? super T>) new $$Lambda$pja$BevIjiIm9zovMFSlaLexCMAMsPw<Object>(this), (wun<Throwable>) $$Lambda$pja$IZ8cbqnNFNONLShMNF85RZ4g6BE.INSTANCE));
        }
    }

    public final void h() {
        this.V.unsubscribe();
        super.h();
    }

    public final void a(jru jru) {
        super.a(jru);
        if (this.W != null) {
            this.Y.a((jpm) this);
        }
    }

    public final void c() {
        super.c();
        if (this.W != null) {
            pjg pjg = this.a;
            NotificationDay a2 = NotificationDay.a(this.X);
            if (a2 != null) {
                pjg.a.a.a().a(a2.mPreferenceKey, true).b();
            }
            a(this.W);
            this.W = null;
            this.T.a("impression");
        }
    }

    /* access modifiers changed from: private */
    public void a(NotificationDay notificationDay) {
        this.W = PremiumSignupActivity.a((Context) fay.a(p()), mbt.g().a(SubView.CANCEL_STATE_INTERSTITIAL).a("").a(Uri.parse("https://www.spotify.com/redirect/csi/?platform=android")).a(this.U).a());
        this.X = notificationDay.a();
        if (this.Y != null) {
            this.Y.a((jpm) this);
        }
    }
}
