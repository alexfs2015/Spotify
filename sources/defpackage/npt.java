package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: npt reason: default package */
public final class npt implements wig<nps> {
    private final wzi<SpSharedPreferences<Object>> a;

    private npt(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static npt a(wzi<SpSharedPreferences<Object>> wzi) {
        return new npt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nps((SpSharedPreferences) this.a.get());
    }
}
