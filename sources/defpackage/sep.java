package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sep reason: default package */
public final class sep implements vua<seo> {
    private final wlc<sfn> a;
    private final wlc<sfb> b;
    private final wlc<Scheduler> c;

    private sep(wlc<sfn> wlc, wlc<sfb> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sep a(wlc<sfn> wlc, wlc<sfb> wlc2, wlc<Scheduler> wlc3) {
        return new sep(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new seo((sfn) this.a.get(), (sfb) this.b.get(), (Scheduler) this.c.get());
    }
}
