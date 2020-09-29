package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mbl reason: default package */
public final class mbl {
    private final jro a;

    public mbl(jro jro) {
        this.a = jro;
    }

    @Deprecated
    public final void a(Context context) {
        a((Activity) context, mbt.g().a(this.a).a());
    }

    @Deprecated
    public final void a(Context context, Uri uri) {
        a((Activity) context, mbt.g().a(this.a).a(uri).a());
    }

    @Deprecated
    public final void a(Context context, Uri uri, SubView subView) {
        a((Activity) context, mbt.g().a(this.a).a(uri).a(subView).a());
    }

    public static void a(Activity activity, mbt mbt) {
        activity.startActivity(PremiumSignupActivity.a(activity, mbt));
    }
}
