package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sdi reason: default package */
public final class sdi implements wig<sdh> {
    private final wzi<lbi> a;
    private final wzi<scx> b;
    private final wzi<Scheduler> c;

    private sdi(wzi<lbi> wzi, wzi<scx> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static sdi a(wzi<lbi> wzi, wzi<scx> wzi2, wzi<Scheduler> wzi3) {
        return new sdi(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sdh(this.a, this.b, this.c);
    }
}
