package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: mdf reason: default package */
public final class mdf implements vua<mdb> {
    private final wlc<hed> a;
    private final wlc<SpSharedPreferences<Object>> b;
    private final wlc<heg> c;
    private final wlc<jrp> d;

    private mdf(wlc<hed> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<heg> wlc3, wlc<jrp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mdf a(wlc<hed> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<heg> wlc3, wlc<jrp> wlc4) {
        return new mdf(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mdb((hed) this.a.get(), (SpSharedPreferences) this.b.get(), (heg) this.c.get(), (jrp) this.d.get());
    }
}
