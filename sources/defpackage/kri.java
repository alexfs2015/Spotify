package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.a;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.concurrent.TimeUnit;

/* renamed from: kri reason: default package */
public final class kri implements fpe {
    private static final b<Object, Long> a = b.b("background_restrictions_next_scheduled_time");
    private static final b<Object, Integer> b = b.b("background_restrictions_times_shown");
    private final jrp c;
    private final SpSharedPreferences<Object> d;

    public kri(jrp jrp, SpSharedPreferences<Object> spSharedPreferences) {
        this.c = jrp;
        this.d = spSharedPreferences;
    }

    public final boolean a() {
        return this.c.a() >= this.d.a(a, 0);
    }

    public final void c() {
        a(1, 0);
    }

    public final void b() {
        long a2 = this.c.a();
        int a3 = this.d.a(b, 1);
        a(a3 + 1, a2 + TimeUnit.DAYS.toMillis((long) (a3 > 2 ? 7 : 1)));
    }

    private void a(int i, long j) {
        a a2 = this.d.a();
        a2.a(a, j);
        a2.a(b, i);
        a2.b();
    }
}
