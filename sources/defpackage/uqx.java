package defpackage;

import android.app.Application;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: uqx reason: default package */
public final class uqx {
    public static final b<Object, Boolean> a = b.a("freetiereducation.PREFS_SKIP_EDUCATION_SHOWN");
    public final SpSharedPreferences<Object> b;

    public uqx(Application application, jyg jyg) {
        this.b = jyg.a(application);
    }
}
