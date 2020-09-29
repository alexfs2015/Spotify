package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: pmx reason: default package */
final class pmx {
    private final Context a;
    private final ToastieManager b;

    pmx(Context context, ToastieManager toastieManager) {
        this.a = context;
        this.b = toastieManager;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        uos a2 = uos.a(this.a.getString(R.string.toast_feature_premium_discovered), 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.a.getString(R.string.premium_signup_title)).a((OnClickListener) new $$Lambda$pmx$68MTXnBklK9HNHlBC0RSy7GgyJM(this)).a();
        if (this.b.b()) {
            this.b.a(a2);
        } else {
            this.b.a = a2;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.aR.toString())));
    }
}
