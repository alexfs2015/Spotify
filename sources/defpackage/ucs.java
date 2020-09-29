package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ucs reason: default package */
public final class ucs {
    public static final b<Object, Boolean> a = b.b("social_listening_host_education_shown");
    public static final b<Object, Boolean> b = b.b("social_listening_participant_education_shown");
    public final SpSharedPreferences<Object> c;

    public ucs(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }
}
