package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: gnv reason: default package */
public final class gnv {
    public static final b<Object, Boolean> a = b.a("prompt_set_password");
    public static final b<Object, String> b = b.a("one_time_reset_password_token");
    public final SpSharedPreferences<Object> c;

    public gnv(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }
}
