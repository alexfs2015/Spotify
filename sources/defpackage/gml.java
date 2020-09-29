package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: gml reason: default package */
public final class gml implements vua<PreSignupExperimentHelper> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<gmn> b;
    private final wlc<gao> c;

    private gml(wlc<SpSharedPreferences<Object>> wlc, wlc<gmn> wlc2, wlc<gao> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gml a(wlc<SpSharedPreferences<Object>> wlc, wlc<gmn> wlc2, wlc<gao> wlc3) {
        return new gml(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new PreSignupExperimentHelper((SpSharedPreferences) this.a.get(), (gmn) this.b.get(), (gao) this.c.get());
    }
}
