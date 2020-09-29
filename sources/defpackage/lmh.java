package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: lmh reason: default package */
public final class lmh {
    final Context a;
    private final lme b;
    private final jro c;

    public lmh(Context context, lme lme, jro jro) {
        this.a = context;
        this.b = lme;
        this.c = jro;
    }

    public final void a() {
        Context context = this.a;
        a a2 = mbt.g().a(SubView.NONE).a("");
        StringBuilder sb = new StringBuilder("https://www.spotify.com/account/subscription/");
        sb.append("?utm_source=spotify%26utm_medium=android_client%26utm_campaign=manage_subscription");
        this.a.startActivity(PremiumSignupActivity.a(context, a2.a(Uri.parse(sb.toString())).a(this.c).a()));
    }
}
