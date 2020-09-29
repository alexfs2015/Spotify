package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: uct reason: default package */
public final class uct implements vua<ucs> {
    private final wlc<SpSharedPreferences<Object>> a;

    private uct(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static uct a(wlc<SpSharedPreferences<Object>> wlc) {
        return new uct(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ucs((SpSharedPreferences) this.a.get());
    }
}
