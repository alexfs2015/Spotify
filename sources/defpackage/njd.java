package defpackage;

import io.reactivex.Scheduler;

/* renamed from: njd reason: default package */
public final class njd implements wig<njc> {
    private final wzi<niz> a;
    private final wzi<nja> b;
    private final wzi<niq> c;
    private final wzi<nji> d;
    private final wzi<Boolean> e;
    private final wzi<Scheduler> f;

    private njd(wzi<niz> wzi, wzi<nja> wzi2, wzi<niq> wzi3, wzi<nji> wzi4, wzi<Boolean> wzi5, wzi<Scheduler> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static njd a(wzi<niz> wzi, wzi<nja> wzi2, wzi<niq> wzi3, wzi<nji> wzi4, wzi<Boolean> wzi5, wzi<Scheduler> wzi6) {
        njd njd = new njd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return njd;
    }

    public final /* synthetic */ Object get() {
        njc njc = new njc((niz) this.a.get(), (nja) this.b.get(), (niq) this.c.get(), (nji) this.d.get(), ((Boolean) this.e.get()).booleanValue(), (Scheduler) this.f.get());
        return njc;
    }
}
