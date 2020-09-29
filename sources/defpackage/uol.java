package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: uol reason: default package */
public final class uol implements vua<uok> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<jrp> b;

    private uol(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uol a(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        return new uol(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uok((SpSharedPreferences) this.a.get(), (jrp) this.b.get());
    }
}
