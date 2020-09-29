package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mfo reason: default package */
public final class mfo {
    private final jty a;

    public mfo(jty jty) {
        this.a = jty;
    }

    public static void a(Activity activity, mfw mfw) {
        activity.startActivity(PremiumSignupActivity.a(activity, mfw));
    }

    @Deprecated
    public final void a(Context context) {
        a((Activity) context, mfw.g().a(this.a).a());
    }

    @Deprecated
    public final void a(Context context, Uri uri) {
        a((Activity) context, mfw.g().a(this.a).a(uri).a());
    }

    @Deprecated
    public final void a(Context context, Uri uri, SubView subView) {
        a((Activity) context, mfw.g().a(this.a).a(uri).a(subView).a());
    }
}
