package defpackage;

import io.reactivex.Scheduler;

/* renamed from: spb reason: default package */
public final class spb implements wig<spa> {
    private final wzi<snv> a;
    private final wzi<snk> b;
    private final wzi<Scheduler> c;
    private final wzi<snn> d;

    private spb(wzi<snv> wzi, wzi<snk> wzi2, wzi<Scheduler> wzi3, wzi<snn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static spb a(wzi<snv> wzi, wzi<snk> wzi2, wzi<Scheduler> wzi3, wzi<snn> wzi4) {
        return new spb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new spa((snv) this.a.get(), (snk) this.b.get(), (Scheduler) this.c.get(), (snn) this.d.get());
    }
}
