package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: uuy reason: default package */
public final class uuy {
    static final b<Object, Boolean> a = b.a("last_known_is_logged_out_status");
    final SpSharedPreferences<Object> b;

    public uuy(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }

    public final void a(boolean z) {
        this.b.a().a(a, z).b();
    }
}
