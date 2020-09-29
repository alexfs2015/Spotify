package defpackage;

import io.reactivex.Scheduler;

/* renamed from: tgx reason: default package */
public final class tgx implements wig<tgw> {
    private final wzi<igd> a;
    private final wzi<Scheduler> b;
    private final wzi<Scheduler> c;

    private tgx(wzi<igd> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tgx a(wzi<igd> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        return new tgx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tgw((igd) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get());
    }
}
