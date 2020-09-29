package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: sny reason: default package */
public final class sny implements vua<snx> {
    private final wlc<SpSharedPreferences<Object>> a;

    private sny(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static sny a(wlc<SpSharedPreferences<Object>> wlc) {
        return new sny(wlc);
    }

    public final /* synthetic */ Object get() {
        return new snx((SpSharedPreferences) this.a.get());
    }
}
