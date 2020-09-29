package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: hco reason: default package */
public final class hco implements vua<Boolean> {
    private final wlc<SpSharedPreferences<Object>> a;

    private hco(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static hco a(wlc<SpSharedPreferences<Object>> wlc) {
        return new hco(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((SpSharedPreferences) this.a.get()).a(hcj.a, false));
    }
}
