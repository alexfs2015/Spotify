package defpackage;

import android.content.Context;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: unu reason: default package */
public final class unu implements vua<unt> {
    private final wlc<Context> a;
    private final wlc<jrp> b;
    private final wlc<b> c;
    private final wlc<SpSharedPreferences<Object>> d;
    private final wlc<gam> e;
    private final wlc<MovingOrchestrator> f;
    private final wlc<a> g;
    private final wlc<hfx> h;

    private unu(wlc<Context> wlc, wlc<jrp> wlc2, wlc<b> wlc3, wlc<SpSharedPreferences<Object>> wlc4, wlc<gam> wlc5, wlc<MovingOrchestrator> wlc6, wlc<a> wlc7, wlc<hfx> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static unu a(wlc<Context> wlc, wlc<jrp> wlc2, wlc<b> wlc3, wlc<SpSharedPreferences<Object>> wlc4, wlc<gam> wlc5, wlc<MovingOrchestrator> wlc6, wlc<a> wlc7, wlc<hfx> wlc8) {
        unu unu = new unu(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return unu;
    }

    public final /* synthetic */ Object get() {
        unt unt = new unt((Context) this.a.get(), (jrp) this.b.get(), (b) this.c.get(), (SpSharedPreferences) this.d.get(), (gam) this.e.get(), (MovingOrchestrator) this.f.get(), (a) this.g.get(), (hfx) this.h.get());
        return unt;
    }
}
