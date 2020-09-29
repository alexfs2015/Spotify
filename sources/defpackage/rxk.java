package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rxk reason: default package */
public final class rxk implements wig<rxj> {
    private final wzi<rxl> a;
    private final wzi<Scheduler> b;
    private final wzi<xgp> c;
    private final wzi<vuq> d;

    private rxk(wzi<rxl> wzi, wzi<Scheduler> wzi2, wzi<xgp> wzi3, wzi<vuq> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rxk a(wzi<rxl> wzi, wzi<Scheduler> wzi2, wzi<xgp> wzi3, wzi<vuq> wzi4) {
        return new rxk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rxj((rxl) this.a.get(), (Scheduler) this.b.get(), (xgp) this.c.get(), (vuq) this.d.get());
    }
}
