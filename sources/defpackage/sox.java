package defpackage;

import android.content.Intent;

/* renamed from: sox reason: default package */
public final class sox {
    public static sot a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("extra_pop_current_fragment", false);
        String stringExtra = intent.getStringExtra("extra_fragment_tag");
        boolean booleanExtra2 = intent.getBooleanExtra("extra_clear_backstack", false);
        if (booleanExtra) {
            return new d();
        }
        if (!fax.a(stringExtra)) {
            return sot.a(stringExtra);
        }
        return booleanExtra2 ? new b() : new a();
    }

    public static soq b(Intent intent) {
        return new soq(intent.getBooleanExtra("extra_crossfade", false), intent.getIntExtra("extra_animation_in", 0), intent.getIntExtra("extra_animation_out", 0));
    }
}
