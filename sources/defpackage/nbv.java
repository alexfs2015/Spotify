package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: nbv reason: default package */
public final class nbv implements vua<nbn> {
    private final wlc<ghm> a;
    private final wlc<SpSharedPreferences<Object>> b;

    private nbv(wlc<ghm> wlc, wlc<SpSharedPreferences<Object>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nbv a(wlc<ghm> wlc, wlc<SpSharedPreferences<Object>> wlc2) {
        return new nbv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        SpSharedPreferences spSharedPreferences = (SpSharedPreferences) this.b.get();
        return (nbn) vuf.a(CC.a((ghm) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
