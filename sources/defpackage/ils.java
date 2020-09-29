package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ils reason: default package */
public final class ils implements vua<ilr> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<rnf> b;

    private ils(wlc<SpSharedPreferences<Object>> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ils a(wlc<SpSharedPreferences<Object>> wlc, wlc<rnf> wlc2) {
        return new ils(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ilr((SpSharedPreferences) this.a.get(), (rnf) this.b.get());
    }
}
