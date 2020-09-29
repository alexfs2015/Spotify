package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kvc reason: default package */
public final class kvc implements vua<kvb> {
    private final wlc<SpSharedPreferences<Object>> a;

    private kvc(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static kvc a(wlc<SpSharedPreferences<Object>> wlc) {
        return new kvc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kvb((SpSharedPreferences) this.a.get());
    }
}
