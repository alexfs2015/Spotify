package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: szl reason: default package */
public final class szl {
    private final Context a;

    public szl(Context context) {
        this.a = (Context) fbp.a(context);
    }

    private static boolean a(String str) {
        return jva.a(str).b != LinkType.DUMMY;
    }

    public final Intent a(szk szk) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) fbp.a(szk.a())));
        if (a(szk.a())) {
            intent.setFlags(67108864);
            intent.setClassName(this.a, "com.spotify.music.MainActivity");
        }
        if (!fbo.a(szk.b())) {
            intent.putExtra("title", szk.b());
        }
        if (szk.d()) {
            intent.putExtra("extra_clear_backstack", true);
        }
        if (szk.e()) {
            intent.putExtra("extra_crossfade", true);
        }
        if (szk.f() != 0) {
            intent.putExtra("extra_animation_in", szk.f());
        }
        if (szk.g() != 0) {
            intent.putExtra("extra_animation_out", szk.g());
        }
        if (szk.h()) {
            intent.putExtra("extra_pop_current_fragment", true);
        }
        if (!fbo.a(szk.i())) {
            intent.putExtra("extra_fragment_tag", szk.i());
        }
        if (!fbo.a(szk.c())) {
            intent.putExtra("tag", szk.c());
        }
        return intent;
    }
}
