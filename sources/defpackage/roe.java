package defpackage;

import io.reactivex.Scheduler;

/* renamed from: roe reason: default package */
public final class roe implements vua<rod> {
    private final wlc<rof> a;
    private final wlc<Scheduler> b;
    private final wlc<wsk> c;
    private final wlc<vhl> d;

    private roe(wlc<rof> wlc, wlc<Scheduler> wlc2, wlc<wsk> wlc3, wlc<vhl> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static roe a(wlc<rof> wlc, wlc<Scheduler> wlc2, wlc<wsk> wlc3, wlc<vhl> wlc4) {
        return new roe(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rod((rof) this.a.get(), (Scheduler) this.b.get(), (wsk) this.c.get(), (vhl) this.d.get());
    }
}
