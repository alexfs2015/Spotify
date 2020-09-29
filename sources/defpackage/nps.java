package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: nps reason: default package */
public final class nps {
    public static final b<Object, Boolean> a = b.b("home-mix-tuning-education-shown");
    static final b<Object, Boolean> b = b.b("home-context-menu-education-shown");
    public final SpSharedPreferences<Object> c;

    public nps(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }
}
