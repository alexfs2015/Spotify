package defpackage;

import io.reactivex.Scheduler;

/* renamed from: orr reason: default package */
public final class orr implements wig<orq> {
    private final wzi<opw> a;
    private final wzi<orl> b;
    private final wzi<hec> c;
    private final wzi<szp> d;
    private final wzi<String> e;
    private final wzi<Scheduler> f;

    private orr(wzi<opw> wzi, wzi<orl> wzi2, wzi<hec> wzi3, wzi<szp> wzi4, wzi<String> wzi5, wzi<Scheduler> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static orr a(wzi<opw> wzi, wzi<orl> wzi2, wzi<hec> wzi3, wzi<szp> wzi4, wzi<String> wzi5, wzi<Scheduler> wzi6) {
        orr orr = new orr(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return orr;
    }

    public final /* synthetic */ Object get() {
        orq orq = new orq(this.a, this.b, this.c, this.d, this.e, this.f);
        return orq;
    }
}
