package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: sjk reason: default package */
public final class sjk {
    public static final b<Object, Integer> a = b.b("number_of_education_overlay_shown");
    final SpSharedPreferences<Object> b;

    public sjk(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }

    public final int a() {
        return this.b.a(a, 0);
    }
}
