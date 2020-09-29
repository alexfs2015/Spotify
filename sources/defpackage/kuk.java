package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kuk reason: default package */
public final class kuk implements vua<kuj> {
    private final wlc<SpSharedPreferences<Object>> a;

    private kuk(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static kuk a(wlc<SpSharedPreferences<Object>> wlc) {
        return new kuk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kuj((SpSharedPreferences) this.a.get());
    }
}
