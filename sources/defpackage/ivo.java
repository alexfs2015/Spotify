package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ivo reason: default package */
public final class ivo {
    public static final b<Object, Boolean> a = b.b("has_navigated_to_npv");
    public final fpt b;
    public final SpSharedPreferences<Object> c;

    public ivo(fpt fpt, SpSharedPreferences<Object> spSharedPreferences) {
        this.b = fpt;
        this.c = spSharedPreferences;
    }

    public final void a() {
        this.c.a().a(a, true).b();
    }
}
