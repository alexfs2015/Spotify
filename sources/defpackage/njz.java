package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: njz reason: default package */
public final class njz implements vua<njy> {
    private final wlc<SpSharedPreferences<Object>> a;

    private njz(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static njz a(wlc<SpSharedPreferences<Object>> wlc) {
        return new njz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new njy((SpSharedPreferences) this.a.get());
    }
}
