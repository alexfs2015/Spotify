package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: pav reason: default package */
public final class pav {
    private static b<Object, Boolean> a = b.b("show-playlist-story-header-tooltip");
    private final SpSharedPreferences<Object> b;

    public pav(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = (SpSharedPreferences) fbp.a(spSharedPreferences);
    }

    public final void a() {
        this.b.a().a(a, false).b();
    }

    public final boolean b() {
        return this.b.a(a, true);
    }
}
