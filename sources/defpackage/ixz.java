package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ixz reason: default package */
public final class ixz {
    public static final b<Object, Boolean> a = b.b("has_navigated_to_npv");
    public final fqn b;
    public final SpSharedPreferences<Object> c;

    public ixz(fqn fqn, SpSharedPreferences<Object> spSharedPreferences) {
        this.b = fqn;
        this.c = spSharedPreferences;
    }

    public final void a() {
        this.c.a().a(a, true).b();
    }
}
