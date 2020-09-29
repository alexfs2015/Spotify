package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nwb reason: default package */
public final class nwb implements vua<nwa> {
    private final wlc<nvy> a;
    private final wlc<rvg> b;
    private final wlc<nuv> c;
    private final wlc<nvu> d;
    private final wlc<Scheduler> e;
    private final wlc<rvv> f;

    public static nwa a(nvy nvy, rvg rvg, nuv nuv, Object obj, Scheduler scheduler, rvv rvv) {
        nwa nwa = new nwa(nvy, rvg, nuv, (nvu) obj, scheduler, rvv);
        return nwa;
    }

    public final /* synthetic */ Object get() {
        nwa nwa = new nwa((nvy) this.a.get(), (rvg) this.b.get(), (nuv) this.c.get(), (nvu) this.d.get(), (Scheduler) this.e.get(), (rvv) this.f.get());
        return nwa;
    }
}
