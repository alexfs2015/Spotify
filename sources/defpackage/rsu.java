package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rsu reason: default package */
public final class rsu implements vua<rst> {
    private final wlc<rsv> a;
    private final wlc<rsy> b;
    private final wlc<Scheduler> c;

    private rsu(wlc<rsv> wlc, wlc<rsy> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rsu a(wlc<rsv> wlc, wlc<rsy> wlc2, wlc<Scheduler> wlc3) {
        return new rsu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rst((rsv) this.a.get(), (rsy) this.b.get(), (Scheduler) this.c.get());
    }
}
