package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: gpk reason: default package */
public final class gpk {
    public static final b<Object, Boolean> a = b.a("prompt_set_password");
    public static final b<Object, String> b = b.a("one_time_reset_password_token");
    public final SpSharedPreferences<Object> c;

    public gpk(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }
}
