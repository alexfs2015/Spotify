package defpackage;

import io.reactivex.Scheduler;

/* renamed from: paj reason: default package */
public final class paj implements wig<pai> {
    private final wzi<Scheduler> a;
    private final wzi<opw> b;

    private paj(wzi<Scheduler> wzi, wzi<opw> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static paj a(wzi<Scheduler> wzi, wzi<opw> wzi2) {
        return new paj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pai((Scheduler) this.a.get(), (opw) this.b.get());
    }
}
