package defpackage;

import io.reactivex.Scheduler;

/* renamed from: occ reason: default package */
public final class occ implements wig<ocb> {
    private final wzi<ocl> a;
    private final wzi<obt> b;
    private final wzi<kfb> c;
    private final wzi<ocj> d;
    private final wzi<Scheduler> e;

    private occ(wzi<ocl> wzi, wzi<obt> wzi2, wzi<kfb> wzi3, wzi<ocj> wzi4, wzi<Scheduler> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static occ a(wzi<ocl> wzi, wzi<obt> wzi2, wzi<kfb> wzi3, wzi<ocj> wzi4, wzi<Scheduler> wzi5) {
        occ occ = new occ(wzi, wzi2, wzi3, wzi4, wzi5);
        return occ;
    }

    public final /* synthetic */ Object get() {
        ocb ocb = new ocb((ocl) this.a.get(), (obt) this.b.get(), (kfb) this.c.get(), (ocj) this.d.get(), (Scheduler) this.e.get());
        return ocb;
    }
}
