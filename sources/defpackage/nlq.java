package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nlq reason: default package */
public final class nlq implements wig<vvy<hcs>> {
    private final wzi<Scheduler> a;
    private final wzi<nit> b;

    private nlq(wzi<Scheduler> wzi, wzi<nit> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nlq a(wzi<Scheduler> wzi, wzi<nit> wzi2) {
        return new nlq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        nit nit = (nit) this.b.get();
        a aVar = new a(nit.b(), (Scheduler) this.a.get());
        aVar.a = 200;
        return (vvy) wil.a(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
