package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: kuj reason: default package */
public final class kuj {
    public static final b<Object, Boolean> a = b.b("key_canvas_enabled");
    public final SpSharedPreferences<Object> b;

    public kuj(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }

    public final boolean a() {
        return this.b.a(a, true);
    }
}
