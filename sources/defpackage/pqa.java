package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pqa reason: default package */
public final class pqa implements vua<ppx> {
    private final wlc<ghm> a;
    private final wlc<SpSharedPreferences<Object>> b;
    private final wlc<jrs> c;
    private final wlc<ppy> d;

    private pqa(wlc<ghm> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<jrs> wlc3, wlc<ppy> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pqa a(wlc<ghm> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<jrs> wlc3, wlc<ppy> wlc4) {
        return new pqa(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ppx((ghm) this.a.get(), (SpSharedPreferences) this.b.get(), (jrs) this.c.get(), (ppy) this.d.get());
    }
}
