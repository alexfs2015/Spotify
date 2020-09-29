package defpackage;

import io.reactivex.Scheduler;

/* renamed from: kni reason: default package */
public final class kni implements vua<knh> {
    private final wlc<kcv> a;
    private final wlc<Scheduler> b;
    private final wlc<rvv> c;

    public static knh a(kcv kcv, Scheduler scheduler, rvv rvv) {
        return new knh(kcv, scheduler, rvv);
    }

    public final /* synthetic */ Object get() {
        return new knh((kcv) this.a.get(), (Scheduler) this.b.get(), (rvv) this.c.get());
    }
}
