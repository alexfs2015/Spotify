package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: kxs reason: default package */
public final class kxs {
    public static final b<Object, Boolean> a = b.b("key_canvas_enabled");
    public final SpSharedPreferences<Object> b;

    public kxs(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }

    public final boolean a() {
        return this.b.a(a, true);
    }
}
