package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sor reason: default package */
public final class sor implements wig<soq> {
    private final wzi<vai> a;
    private final wzi<snx> b;
    private final wzi<Scheduler> c;
    private final wzi<Integer> d;

    private sor(wzi<vai> wzi, wzi<snx> wzi2, wzi<Scheduler> wzi3, wzi<Integer> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sor a(wzi<vai> wzi, wzi<snx> wzi2, wzi<Scheduler> wzi3, wzi<Integer> wzi4) {
        return new sor(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new soq((vai) this.a.get(), (snx) this.b.get(), (Scheduler) this.c.get(), ((Integer) this.d.get()).intValue());
    }
}
