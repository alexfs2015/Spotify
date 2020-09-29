package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sow reason: default package */
public final class sow implements wig<sov> {
    private final wzi<spu> a;
    private final wzi<spi> b;
    private final wzi<Scheduler> c;

    private sow(wzi<spu> wzi, wzi<spi> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static sow a(wzi<spu> wzi, wzi<spi> wzi2, wzi<Scheduler> wzi3) {
        return new sow(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sov((spu) this.a.get(), (spi) this.b.get(), (Scheduler) this.c.get());
    }
}
