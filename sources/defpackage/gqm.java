package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: gqm reason: default package */
public final class gqm {
    public static final b<Object, Boolean> a = b.b("marketing-opt-in-prefs-key");
    public static final b<Object, String> b = b.b("marketing-opt-in-contact-is-url-key");
    public final SpSharedPreferences<Object> c;

    public gqm(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }
}
