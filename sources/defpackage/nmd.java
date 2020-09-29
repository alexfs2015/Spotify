package defpackage;

import io.reactivex.Single;

/* renamed from: nmd reason: default package */
public final class nmd implements wig<nmc> {
    private final wzi<String> a;
    private final wzi<Single<Boolean>> b;
    private final wzi<lav> c;
    private final wzi<lar> d;
    private final wzi<vjj> e;
    private final wzi<vjv> f;

    private nmd(wzi<String> wzi, wzi<Single<Boolean>> wzi2, wzi<lav> wzi3, wzi<lar> wzi4, wzi<vjj> wzi5, wzi<vjv> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static nmd a(wzi<String> wzi, wzi<Single<Boolean>> wzi2, wzi<lav> wzi3, wzi<lar> wzi4, wzi<vjj> wzi5, wzi<vjv> wzi6) {
        nmd nmd = new nmd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return nmd;
    }

    public final /* synthetic */ Object get() {
        nmc nmc = new nmc((String) this.a.get(), (Single) this.b.get(), (lav) this.c.get(), (lar) this.d.get(), (vjj) this.e.get(), (vjv) this.f.get());
        return nmc;
    }
}
