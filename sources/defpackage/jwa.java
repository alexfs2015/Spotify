package defpackage;

import android.app.Application;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: jwa reason: default package */
public final class jwa implements vua<SpSharedPreferences<Object>> {
    private final wlc<Application> a;
    private final wlc<jvy> b;

    private jwa(wlc<Application> wlc, wlc<jvy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jwa a(wlc<Application> wlc, wlc<jvy> wlc2) {
        return new jwa(wlc, wlc2);
    }

    public static SpSharedPreferences<Object> a(Application application, jvy jvy) {
        return (SpSharedPreferences) vuf.a(jvy.a(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Application) this.a.get(), (jvy) this.b.get());
    }
}
