package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hms reason: default package */
public final class hms implements vua<hmr> {
    private final wlc<idw> a;
    private final wlc<ifi> b;
    private final wlc<ieb> c;
    private final wlc<idz> d;
    private final wlc<ids> e;
    private final wlc<Scheduler> f;

    private hms(wlc<idw> wlc, wlc<ifi> wlc2, wlc<ieb> wlc3, wlc<idz> wlc4, wlc<ids> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static hms a(wlc<idw> wlc, wlc<ifi> wlc2, wlc<ieb> wlc3, wlc<idz> wlc4, wlc<ids> wlc5, wlc<Scheduler> wlc6) {
        hms hms = new hms(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return hms;
    }

    public final /* synthetic */ Object get() {
        hmr hmr = new hmr(this.a, this.b, this.c, this.d, this.e, this.f);
        return hmr;
    }
}
