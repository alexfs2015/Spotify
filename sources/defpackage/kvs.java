package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: kvs reason: default package */
public final class kvs {
    static final b<Object, Boolean> a = b.b("capped_ondemand:can_snow_ondemand_education");
    static final b<Object, Boolean> b = b.b("capped_ondemand:has_seen_ondemand_education");
    private static final b<Object, Boolean> d = b.b("capped_ondemand:has_seen_shuffle_education");
    final SpSharedPreferences<Object> c;

    public kvs(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = (SpSharedPreferences) fay.a(spSharedPreferences);
    }

    public final void a(boolean z) {
        this.c.a().a(d, z).b();
    }

    public final boolean a() {
        return this.c.a(d, false);
    }

    public final boolean b() {
        return this.c.a(a, false);
    }

    public final boolean c() {
        return this.c.a(b, false);
    }
}
