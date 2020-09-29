package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hgx reason: default package */
public final class hgx implements wig<hgw> {
    private final wzi<Scheduler> a;
    private final wzi<Scheduler> b;
    private final wzi<Scheduler> c;

    private hgx(wzi<Scheduler> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hgx a(wzi<Scheduler> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        return new hgx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hgw((Scheduler) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get());
    }
}
