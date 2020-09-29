package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: gtu reason: default package */
public final class gtu implements vua<gtt> {
    private final wlc<gud> a;
    private final wlc<SpSharedPreferences<Object>> b;

    private gtu(wlc<gud> wlc, wlc<SpSharedPreferences<Object>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gtu a(wlc<gud> wlc, wlc<SpSharedPreferences<Object>> wlc2) {
        return new gtu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gtt((gud) this.a.get(), (SpSharedPreferences) this.b.get());
    }
}
