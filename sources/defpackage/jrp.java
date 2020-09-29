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

/* renamed from: jrp reason: default package */
public class jrp extends jry {
    private final a T = new a() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a(View view) {
            jrp.this.p().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.aQ.toString())));
        }

        public final void onOfflineSyncError(OfflineError offlineError) {
            if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
                uzy a2 = uzy.a(jrp.this.p().getString(R.string.toast_feature_premium_discovered), 3000).c(R.color.cat_white).b(R.color.cat_black).a(jrp.this.p().getString(R.string.premium_signup_title)).a((OnClickListener) new $$Lambda$jrp$1$iOVmHpKgkYTqplhYIHG5dCM5bw(this)).a();
                if (jrp.this.b.b()) {
                    jrp.this.b.a(a2);
                } else {
                    jrp.this.b.a = a2;
                }
            }
        }
    };
    public ttd a;
    public ToastieManager b;

    public static jrp a(fqn fqn) {
        jrp jrp = new jrp();
        fqo.a((Fragment) jrp, fqn);
        return jrp;
    }

    public final void A() {
        this.a.b(this.T);
        this.a.b();
        super.A();
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void z() {
        super.z();
        this.a.a(this.T);
        this.a.a();
    }
}
