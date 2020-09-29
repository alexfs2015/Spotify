package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.Observable;

/* renamed from: gtt reason: default package */
public final class gtt implements gts {
    private static b<Object, Boolean> a = b.b("key_driving_mode");
    private static b<Object, Boolean> b = b.b("key_driving_mode_always_on");
    private final gud c;
    private final SpSharedPreferences<Object> d;

    public gtt(gud gud, SpSharedPreferences<Object> spSharedPreferences) {
        this.c = gud;
        this.d = spSharedPreferences;
    }

    public final void a(boolean z) {
        this.d.a().a(a, z).b();
    }

    public final boolean a() {
        return this.d.a(a, true);
    }

    public final void b(boolean z) {
        this.c.a(z);
        this.d.a().a(b, z).b();
    }

    public final boolean b() {
        return this.d.a(b, false);
    }

    public final Observable<Update<Boolean>> c() {
        return this.d.f(a);
    }

    public final Observable<Update<Boolean>> d() {
        return this.d.f(b);
    }
}
