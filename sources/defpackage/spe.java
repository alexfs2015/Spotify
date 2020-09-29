package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: spe reason: default package */
public final class spe {
    private final Context a;

    public spe(Context context) {
        this.a = (Context) fay.a(context);
    }

    public final Intent a(spd spd) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) fay.a(spd.a())));
        if (a(spd.a())) {
            intent.setFlags(67108864);
            intent.setClassName(this.a, "com.spotify.music.MainActivity");
        }
        if (!fax.a(spd.b())) {
            intent.putExtra("title", spd.b());
        }
        if (spd.d()) {
            intent.putExtra("extra_clear_backstack", true);
        }
        if (spd.e()) {
            intent.putExtra("extra_crossfade", true);
        }
        if (spd.f() != 0) {
            intent.putExtra("extra_animation_in", spd.f());
        }
        if (spd.g() != 0) {
            intent.putExtra("extra_animation_out", spd.g());
        }
        if (spd.h()) {
            intent.putExtra("extra_pop_current_fragment", true);
        }
        if (!fax.a(spd.i())) {
            intent.putExtra("extra_fragment_tag", spd.i());
        }
        if (!fax.a(spd.c())) {
            intent.putExtra("tag", spd.c());
        }
        return intent;
    }

    private static boolean a(String str) {
        return jst.a(str).b != LinkType.DUMMY;
    }
}
