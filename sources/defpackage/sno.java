package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sno reason: default package */
public final class sno implements wig<snn> {
    private final wzi<spu> a;
    private final wzi<soe> b;
    private final wzi<Scheduler> c;
    private final wzi<Boolean> d;
    private final wzi<snp> e;
    private final wzi<Integer> f;

    private sno(wzi<spu> wzi, wzi<soe> wzi2, wzi<Scheduler> wzi3, wzi<Boolean> wzi4, wzi<snp> wzi5, wzi<Integer> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static sno a(wzi<spu> wzi, wzi<soe> wzi2, wzi<Scheduler> wzi3, wzi<Boolean> wzi4, wzi<snp> wzi5, wzi<Integer> wzi6) {
        sno sno = new sno(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return sno;
    }

    public final /* synthetic */ Object get() {
        snn snn = new snn((spu) this.a.get(), (soe) this.b.get(), (Scheduler) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (snp) this.e.get(), ((Integer) this.f.get()).intValue());
        return snn;
    }
}
