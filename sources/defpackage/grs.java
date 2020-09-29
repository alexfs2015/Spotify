package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: grs reason: default package */
public final class grs implements vua<grr> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<jug> b;

    private grs(wlc<SpSharedPreferences<Object>> wlc, wlc<jug> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static grs a(wlc<SpSharedPreferences<Object>> wlc, wlc<jug> wlc2) {
        return new grs(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new grr((SpSharedPreferences) this.a.get(), (jug) this.b.get());
    }
}
