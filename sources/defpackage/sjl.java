package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: sjl reason: default package */
public final class sjl implements vua<sjk> {
    private final wlc<SpSharedPreferences<Object>> a;

    private sjl(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static sjl a(wlc<SpSharedPreferences<Object>> wlc) {
        return new sjl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sjk((SpSharedPreferences) this.a.get());
    }
}
