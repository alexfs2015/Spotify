package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kqs reason: default package */
public final class kqs implements vua<Boolean> {
    private final wlc<SpSharedPreferences<Object>> a;

    private kqs(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static kqs a(wlc<SpSharedPreferences<Object>> wlc) {
        return new kqs(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((SpSharedPreferences) this.a.get()).a(kqp.a, true));
    }
}
