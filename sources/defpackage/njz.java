package defpackage;

import io.reactivex.Scheduler;

/* renamed from: njz reason: default package */
public final class njz implements wig<njy> {
    private final wzi<npd> a;
    private final wzi<Scheduler> b;
    private final wzi<nks> c;
    private final wzi<gwp> d;
    private final wzi<szp> e;
    private final wzi<nki> f;
    private final wzi<String> g;

    private njz(wzi<npd> wzi, wzi<Scheduler> wzi2, wzi<nks> wzi3, wzi<gwp> wzi4, wzi<szp> wzi5, wzi<nki> wzi6, wzi<String> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static njz a(wzi<npd> wzi, wzi<Scheduler> wzi2, wzi<nks> wzi3, wzi<gwp> wzi4, wzi<szp> wzi5, wzi<nki> wzi6, wzi<String> wzi7) {
        njz njz = new njz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return njz;
    }

    public final /* synthetic */ Object get() {
        njy njy = new njy((npd) this.a.get(), (Scheduler) this.b.get(), (nks) this.c.get(), (gwp) this.d.get(), (szp) this.e.get(), (nki) this.f.get(), (String) this.g.get());
        return njy;
    }
}
