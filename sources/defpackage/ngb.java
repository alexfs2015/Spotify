package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ngb reason: default package */
public final class ngb implements vua<vit<gzz>> {
    private final wlc<Scheduler> a;
    private final wlc<nde> b;

    private ngb(wlc<Scheduler> wlc, wlc<nde> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ngb a(wlc<Scheduler> wlc, wlc<nde> wlc2) {
        return new ngb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        nde nde = (nde) this.b.get();
        a aVar = new a(nde.b(), (Scheduler) this.a.get());
        aVar.a = 200;
        return (vit) vuf.a(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
