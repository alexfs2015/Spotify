package defpackage;

import android.content.Intent;

/* renamed from: sze reason: default package */
public final class sze {
    public static sza a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("extra_pop_current_fragment", false);
        String stringExtra = intent.getStringExtra("extra_fragment_tag");
        return booleanExtra ? new d() : !fbo.a(stringExtra) ? sza.a(stringExtra) : intent.getBooleanExtra("extra_clear_backstack", false) ? new b() : new a();
    }

    public static syx b(Intent intent) {
        return new syx(intent.getBooleanExtra("extra_crossfade", false), intent.getIntExtra("extra_animation_in", 0), intent.getIntExtra("extra_animation_out", 0));
    }
}
