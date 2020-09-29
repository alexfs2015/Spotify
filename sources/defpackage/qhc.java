package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qhc reason: default package */
public final class qhc implements vua<qhb> {
    private final wlc<spi> a;
    private final wlc<SpSharedPreferences<Object>> b;
    private final wlc<jjf> c;
    private final wlc<jrp> d;

    public static qhb a(spi spi, SpSharedPreferences<Object> spSharedPreferences, jjf jjf, jrp jrp) {
        return new qhb(spi, spSharedPreferences, jjf, jrp);
    }

    public final /* synthetic */ Object get() {
        return new qhb((spi) this.a.get(), (SpSharedPreferences) this.b.get(), (jjf) this.c.get(), (jrp) this.d.get());
    }
}
