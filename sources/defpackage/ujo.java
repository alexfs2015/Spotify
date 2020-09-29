package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ujo reason: default package */
public final class ujo implements vua<ujn> {
    private final wlc<SpSharedPreferences<Object>> a;

    private ujo(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static ujo a(wlc<SpSharedPreferences<Object>> wlc) {
        return new ujo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ujn((SpSharedPreferences) this.a.get());
    }
}
