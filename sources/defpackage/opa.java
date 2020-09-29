package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: opa reason: default package */
public final class opa implements vua<ooz> {
    private final wlc<SpSharedPreferences<Object>> a;

    private opa(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static opa a(wlc<SpSharedPreferences<Object>> wlc) {
        return new opa(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ooz((SpSharedPreferences) this.a.get());
    }
}
