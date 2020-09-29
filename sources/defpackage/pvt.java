package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: pvt reason: default package */
final class pvt {
    private final Context a;
    private final ToastieManager b;

    pvt(Context context, ToastieManager toastieManager) {
        this.a = context;
        this.b = toastieManager;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.aQ.toString())));
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        uzy a2 = uzy.a(this.a.getString(R.string.toast_feature_premium_discovered), 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.a.getString(R.string.premium_signup_title)).a((OnClickListener) new $$Lambda$pvt$Pn8TF2skETrCPV3VyYuT1z8DQyQ(this)).a();
        if (this.b.b()) {
            this.b.a(a2);
        } else {
            this.b.a = a2;
        }
    }
}
