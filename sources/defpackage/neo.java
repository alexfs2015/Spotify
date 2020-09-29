package defpackage;

import io.reactivex.Scheduler;

/* renamed from: neo reason: default package */
public final class neo implements vua<nen> {
    private final wlc<nem> a;
    private final wlc<rnf> b;
    private final wlc<Boolean> c;
    private final wlc<Scheduler> d;

    private neo(wlc<nem> wlc, wlc<rnf> wlc2, wlc<Boolean> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static neo a(wlc<nem> wlc, wlc<rnf> wlc2, wlc<Boolean> wlc3, wlc<Scheduler> wlc4) {
        return new neo(wlc, wlc2, wlc3, wlc4);
    }

    public static nen a(nem nem, rnf rnf, boolean z, Scheduler scheduler) {
        return new nen(nem, rnf, z, scheduler);
    }

    public final /* synthetic */ Object get() {
        return new nen((nem) this.a.get(), (rnf) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (Scheduler) this.d.get());
    }
}
