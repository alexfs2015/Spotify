package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: gsv reason: default package */
public final class gsv implements vua<gsu> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<kqe> c;
    private final wlc<gsy> d;
    private final wlc<uxc> e;
    private final wlc<ioa> f;
    private final wlc<Scheduler> g;

    private gsv(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<kqe> wlc3, wlc<gsy> wlc4, wlc<uxc> wlc5, wlc<ioa> wlc6, wlc<Scheduler> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static gsv a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<kqe> wlc3, wlc<gsy> wlc4, wlc<uxc> wlc5, wlc<ioa> wlc6, wlc<Scheduler> wlc7) {
        gsv gsv = new gsv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return gsv;
    }

    public final /* synthetic */ Object get() {
        gsu gsu = new gsu((RxResolver) this.a.get(), (rnf) this.b.get(), (kqe) this.c.get(), (gsy) this.d.get(), (uxc) this.e.get(), this.f, (Scheduler) this.g.get());
        return gsu;
    }
}
