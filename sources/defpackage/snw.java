package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: snw reason: default package */
public final class snw implements vua<snt> {
    private final wlc<snq> a;
    private final wlc<snx> b;
    private final wlc<twu> c;
    private final wlc<hed> d;
    private final wlc<hec> e;
    private final wlc<Observable<Boolean>> f;
    private final wlc<Scheduler> g;

    private snw(wlc<snq> wlc, wlc<snx> wlc2, wlc<twu> wlc3, wlc<hed> wlc4, wlc<hec> wlc5, wlc<Observable<Boolean>> wlc6, wlc<Scheduler> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static snw a(wlc<snq> wlc, wlc<snx> wlc2, wlc<twu> wlc3, wlc<hed> wlc4, wlc<hec> wlc5, wlc<Observable<Boolean>> wlc6, wlc<Scheduler> wlc7) {
        snw snw = new snw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return snw;
    }

    public final /* synthetic */ Object get() {
        snt snt = new snt((snq) this.a.get(), (snx) this.b.get(), (twu) this.c.get(), (hed) this.d.get(), (hec) this.e.get(), (Observable) this.f.get(), (Scheduler) this.g.get());
        return snt;
    }
}
