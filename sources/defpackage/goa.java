package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: goa reason: default package */
public final class goa implements wig<PreSignupExperimentHelper> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<goc> b;
    private final wzi<gbp> c;

    private goa(wzi<SpSharedPreferences<Object>> wzi, wzi<goc> wzi2, wzi<gbp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static goa a(wzi<SpSharedPreferences<Object>> wzi, wzi<goc> wzi2, wzi<gbp> wzi3) {
        return new goa(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new PreSignupExperimentHelper((SpSharedPreferences) this.a.get(), (goc) this.b.get(), (gbp) this.c.get());
    }
}
