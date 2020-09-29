package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: upn reason: default package */
public final class upn {
    public static final b<Object, Boolean> a = b.b("social_listening_host_education_shown");
    public static final b<Object, Boolean> b = b.b("social_listening_participant_education_shown");
    public final SpSharedPreferences<Object> c;

    public upn(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }
}
