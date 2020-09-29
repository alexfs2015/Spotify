package defpackage;

import android.app.Application;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: uel reason: default package */
public final class uel {
    public static final b<Object, Boolean> a = b.a("freetiereducation.PREFS_SKIP_EDUCATION_SHOWN");
    public final SpSharedPreferences<Object> b;

    public uel(Application application, jvy jvy) {
        this.b = jvy.a(application);
    }
}
