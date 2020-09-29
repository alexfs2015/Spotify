package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: ocz reason: default package */
public final class ocz implements vua<ocy> {
    private final wlc<Context> a;
    private final wlc<Scheduler> b;
    private final wlc<Scheduler> c;
    private final wlc<ocx> d;
    private final wlc<ode> e;
    private final wlc<jjf> f;
    private final wlc<ocv> g;
    private final wlc<ocr> h;
    private final wlc<jro> i;
    private final wlc<gbd> j;

    public static ocy a(Context context, Scheduler scheduler, Scheduler scheduler2, ocx ocx, ode ode, jjf jjf, Object obj, ocr ocr, jro jro, gbd gbd) {
        ocy ocy = new ocy(context, scheduler, scheduler2, ocx, ode, jjf, (ocv) obj, ocr, jro, gbd);
        return ocy;
    }

    public final /* synthetic */ Object get() {
        ocy ocy = new ocy((Context) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get(), (ocx) this.d.get(), (ode) this.e.get(), (jjf) this.f.get(), (ocv) this.g.get(), (ocr) this.h.get(), (jro) this.i.get(), (gbd) this.j.get());
        return ocy;
    }
}
