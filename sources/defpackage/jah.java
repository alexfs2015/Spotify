package defpackage;

import io.reactivex.Scheduler;

/* renamed from: jah reason: default package */
public final class jah implements wig<jag> {
    private final wzi<jai> a;
    private final wzi<jbm> b;
    private final wzi<jbo> c;
    private final wzi<jbi> d;
    private final wzi<jal> e;
    private final wzi<Scheduler> f;

    private jah(wzi<jai> wzi, wzi<jbm> wzi2, wzi<jbo> wzi3, wzi<jbi> wzi4, wzi<jal> wzi5, wzi<Scheduler> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static jah a(wzi<jai> wzi, wzi<jbm> wzi2, wzi<jbo> wzi3, wzi<jbi> wzi4, wzi<jal> wzi5, wzi<Scheduler> wzi6) {
        jah jah = new jah(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return jah;
    }

    public final /* synthetic */ Object get() {
        jag jag = new jag((jai) this.a.get(), (jbm) this.b.get(), (jbo) this.c.get(), (jbi) this.d.get(), (jal) this.e.get(), (Scheduler) this.f.get());
        return jag;
    }
}
