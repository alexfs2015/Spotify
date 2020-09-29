package defpackage;

import io.reactivex.Scheduler;

/* renamed from: gen reason: default package */
public final class gen implements wig<gel> {
    private final wzi<geo> a;
    private final wzi<geq> b;
    private final wzi<vwc> c;
    private final wzi<Scheduler> d;
    private final wzi<Scheduler> e;

    private gen(wzi<geo> wzi, wzi<geq> wzi2, wzi<vwc> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static gen a(wzi<geo> wzi, wzi<geq> wzi2, wzi<vwc> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5) {
        gen gen = new gen(wzi, wzi2, wzi3, wzi4, wzi5);
        return gen;
    }

    public final /* synthetic */ Object get() {
        gel gel = new gel((geo) this.a.get(), (geq) this.b.get(), (vwc) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get());
        return gel;
    }
}
