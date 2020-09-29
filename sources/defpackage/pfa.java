package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: pfa reason: default package */
public final class pfa {
    public static final b<Object, Boolean> a = b.a("preload_notification_has_never_logged_in");
    public static final b<Object, Long> b = b.a("preload_notification_first_time_app_started_millis");
    private static final b<Object, Integer> d = b.a("preload_notification_times_been_shown");
    public final SpSharedPreferences<Object> c;

    public pfa(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }

    public final boolean a() {
        return this.c.a(a, true);
    }

    public final long b() {
        return this.c.a(b, -1);
    }

    public final int c() {
        return this.c.a(d, 0);
    }

    public final void d() {
        this.c.a().a(d, c() + 1).b();
    }
}
