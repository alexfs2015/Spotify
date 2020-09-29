package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mbo reason: default package */
public final class mbo implements wig<vvy<hcs>> {
    private final wzi<Scheduler> a;
    private final wzi<hcs> b;

    private mbo(wzi<Scheduler> wzi, wzi<hcs> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mbo a(wzi<Scheduler> wzi, wzi<hcs> wzi2) {
        return new mbo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (vvy) wil.a(new a((hcs) this.b.get(), (Scheduler) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
