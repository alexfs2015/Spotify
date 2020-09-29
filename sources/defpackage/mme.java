package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mme reason: default package */
public final class mme implements wig<mmd> {
    private final wzi<mlv> a;
    private final wzi<ura> b;
    private final wzi<Scheduler> c;

    private mme(wzi<mlv> wzi, wzi<ura> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mme a(wzi<mlv> wzi, wzi<ura> wzi2, wzi<Scheduler> wzi3) {
        return new mme(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mmd((mlv) this.a.get(), (ura) this.b.get(), (Scheduler) this.c.get());
    }
}
