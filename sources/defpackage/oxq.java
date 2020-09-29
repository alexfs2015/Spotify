package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oxq reason: default package */
public final class oxq implements wig<oxp> {
    private final wzi<tmu> a;
    private final wzi<opw> b;
    private final wzi<oxk> c;
    private final wzi<String> d;
    private final wzi<hec> e;
    private final wzi<Scheduler> f;

    private oxq(wzi<tmu> wzi, wzi<opw> wzi2, wzi<oxk> wzi3, wzi<String> wzi4, wzi<hec> wzi5, wzi<Scheduler> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static oxq a(wzi<tmu> wzi, wzi<opw> wzi2, wzi<oxk> wzi3, wzi<String> wzi4, wzi<hec> wzi5, wzi<Scheduler> wzi6) {
        oxq oxq = new oxq(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return oxq;
    }

    public final /* synthetic */ Object get() {
        oxp oxp = new oxp(this.a, this.b, this.c, this.d, this.e, this.f);
        return oxp;
    }
}
