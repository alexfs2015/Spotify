package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mmg reason: default package */
public final class mmg implements wig<mmf> {
    private final wzi<mlv> a;
    private final wzi<ura> b;
    private final wzi<Scheduler> c;

    private mmg(wzi<mlv> wzi, wzi<ura> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mmg a(wzi<mlv> wzi, wzi<ura> wzi2, wzi<Scheduler> wzi3) {
        return new mmg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mmf((mlv) this.a.get(), (ura) this.b.get(), (Scheduler) this.c.get());
    }
}
