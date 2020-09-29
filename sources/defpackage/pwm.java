package defpackage;

import io.reactivex.Scheduler;

/* renamed from: pwm reason: default package */
public final class pwm implements wig<pwl> {
    private final wzi<qan> a;
    private final wzi<qbe> b;
    private final wzi<qbc> c;
    private final wzi<jtz> d;
    private final wzi<hgy> e;
    private final wzi<pwp> f;
    private final wzi<pxf> g;
    private final wzi<Scheduler> h;

    private pwm(wzi<qan> wzi, wzi<qbe> wzi2, wzi<qbc> wzi3, wzi<jtz> wzi4, wzi<hgy> wzi5, wzi<pwp> wzi6, wzi<pxf> wzi7, wzi<Scheduler> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static pwm a(wzi<qan> wzi, wzi<qbe> wzi2, wzi<qbc> wzi3, wzi<jtz> wzi4, wzi<hgy> wzi5, wzi<pwp> wzi6, wzi<pxf> wzi7, wzi<Scheduler> wzi8) {
        pwm pwm = new pwm(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return pwm;
    }

    public final /* synthetic */ Object get() {
        pwl pwl = new pwl((qan) this.a.get(), (qbe) this.b.get(), (qbc) this.c.get(), (jtz) this.d.get(), (hgy) this.e.get(), (pwp) this.f.get(), (pxf) this.g.get(), (Scheduler) this.h.get());
        return pwl;
    }
}
