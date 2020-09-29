package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: mfl reason: default package */
public final class mfl implements vua<mfk> {
    private final wlc<SpSharedPreferences<Object>> a;

    private mfl(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static mfl a(wlc<SpSharedPreferences<Object>> wlc) {
        return new mfl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mfk((SpSharedPreferences) this.a.get());
    }
}
