package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kvz reason: default package */
public final class kvz implements vua<kvy> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<jrp> b;

    private kvz(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kvz a(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        return new kvz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kvy((SpSharedPreferences) this.a.get(), (jrp) this.b.get());
    }
}
