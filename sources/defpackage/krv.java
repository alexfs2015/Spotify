package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: krv reason: default package */
public final class krv implements vua<kru> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<jrp> b;

    private krv(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static krv a(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        return new krv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kru((SpSharedPreferences) this.a.get(), (jrp) this.b.get());
    }
}
