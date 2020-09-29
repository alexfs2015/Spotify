package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.offline.OfflineError;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: jpd reason: default package */
public class jpd extends jpm {
    private final a T = new a() {
        public final void onOfflineSyncError(OfflineError offlineError) {
            if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
                uos a2 = uos.a(jpd.this.p().getString(R.string.toast_feature_premium_discovered), 3000).c(R.color.cat_white).b(R.color.cat_black).a(jpd.this.p().getString(R.string.premium_signup_title)).a((OnClickListener) new $$Lambda$jpd$1$e6HXtpjyMjLawFTDb8lGtZcEGQ(this)).a();
                if (jpd.this.b.b()) {
                    jpd.this.b.a(a2);
                } else {
                    jpd.this.b.a = a2;
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(View view) {
            jpd.this.p().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.aR.toString())));
        }
    };
    public til a;
    public ToastieManager b;

    public static jpd a(fpt fpt) {
        jpd jpd = new jpd();
        fpu.a((Fragment) jpd, fpt);
        return jpd;
    }

    public final void z() {
        super.z();
        this.a.a(this.T);
        this.a.a();
    }

    public final void A() {
        this.a.b(this.T);
        this.a.b();
        super.A();
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }
}
