package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hpj reason: default package */
public final class hpj implements wig<hpi> {
    private final wzi<igj> a;
    private final wzi<ihv> b;
    private final wzi<igo> c;
    private final wzi<igm> d;
    private final wzi<igf> e;
    private final wzi<Scheduler> f;

    private hpj(wzi<igj> wzi, wzi<ihv> wzi2, wzi<igo> wzi3, wzi<igm> wzi4, wzi<igf> wzi5, wzi<Scheduler> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static hpj a(wzi<igj> wzi, wzi<ihv> wzi2, wzi<igo> wzi3, wzi<igm> wzi4, wzi<igf> wzi5, wzi<Scheduler> wzi6) {
        hpj hpj = new hpj(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return hpj;
    }

    public final /* synthetic */ Object get() {
        hpi hpi = new hpi(this.a, this.b, this.c, this.d, this.e, this.f);
        return hpi;
    }
}
