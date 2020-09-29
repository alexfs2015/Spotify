package defpackage;

import android.app.Application;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: jyi reason: default package */
public final class jyi implements wig<SpSharedPreferences<Object>> {
    private final wzi<Application> a;
    private final wzi<jyg> b;

    private jyi(wzi<Application> wzi, wzi<jyg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static SpSharedPreferences<Object> a(Application application, jyg jyg) {
        return (SpSharedPreferences) wil.a(jyg.a(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static jyi a(wzi<Application> wzi, wzi<jyg> wzi2) {
        return new jyi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Application) this.a.get(), (jyg) this.b.get());
    }
}
