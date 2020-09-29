package defpackage;

import io.reactivex.Scheduler;

/* renamed from: qpy reason: default package */
public final class qpy implements vua<qpx> {
    private final wlc<qpr> a;
    private final wlc<qpp> b;
    private final wlc<Boolean> c;
    private final wlc<Scheduler> d;
    private final wlc<qpt> e;

    private qpy(wlc<qpr> wlc, wlc<qpp> wlc2, wlc<Boolean> wlc3, wlc<Scheduler> wlc4, wlc<qpt> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qpy a(wlc<qpr> wlc, wlc<qpp> wlc2, wlc<Boolean> wlc3, wlc<Scheduler> wlc4, wlc<qpt> wlc5) {
        qpy qpy = new qpy(wlc, wlc2, wlc3, wlc4, wlc5);
        return qpy;
    }

    public final /* synthetic */ Object get() {
        qpx qpx = new qpx((qpr) this.a.get(), (qpp) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (Scheduler) this.d.get(), (qpt) this.e.get());
        return qpx;
    }
}
