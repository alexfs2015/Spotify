package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: upl reason: default package */
public final class upl implements vua<upk> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<jrp> b;

    private upl(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static upl a(wlc<SpSharedPreferences<Object>> wlc, wlc<jrp> wlc2) {
        return new upl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new upk((SpSharedPreferences) this.a.get(), (jrp) this.b.get());
    }
}
