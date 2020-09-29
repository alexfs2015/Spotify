package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: new reason: invalid class name and default package */
public final class Cnew implements vua<net> {
    private final wlc<SpSharedPreferences<Object>> a;

    private Cnew(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static Cnew a(wlc<SpSharedPreferences<Object>> wlc) {
        return new Cnew(wlc);
    }

    public final /* synthetic */ Object get() {
        return new net((SpSharedPreferences) this.a.get());
    }
}
