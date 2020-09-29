package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: mlr reason: default package */
public final class mlr implements vua<Observable<mlh>> {
    private final wlc<mla> a;
    private final wlc<mlt> b;
    private final wlc<Scheduler> c;

    private mlr(wlc<mla> wlc, wlc<mlt> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mlr a(wlc<mla> wlc, wlc<mlt> wlc2, wlc<Scheduler> wlc3) {
        return new mlr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((mla) this.a.get(), (mlt) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
