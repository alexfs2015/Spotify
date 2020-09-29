package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: jyr reason: default package */
public final class jyr implements vua<jzv> {
    private final wlc<Context> a;
    private final wlc<gdz<fko>> b;
    private final wlc<jzs> c;
    private final wlc<gbd> d;
    private final wlc<Scheduler> e;
    private final wlc<jzx> f;
    private final wlc<jye> g;

    private jyr(wlc<Context> wlc, wlc<gdz<fko>> wlc2, wlc<jzs> wlc3, wlc<gbd> wlc4, wlc<Scheduler> wlc5, wlc<jzx> wlc6, wlc<jye> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static jyr a(wlc<Context> wlc, wlc<gdz<fko>> wlc2, wlc<jzs> wlc3, wlc<gbd> wlc4, wlc<Scheduler> wlc5, wlc<jzx> wlc6, wlc<jye> wlc7) {
        jyr jyr = new jyr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return jyr;
    }

    public final /* synthetic */ Object get() {
        jzv jzv = new jzv((Context) this.a.get(), (gdz) this.b.get(), (jzs) this.c.get(), (gbd) this.d.get(), (Scheduler) this.e.get(), (jzx) this.f.get(), (jye) this.g.get());
        return (jzv) vuf.a(jzv, "Cannot return null from a non-@Nullable @Provides method");
    }
}
