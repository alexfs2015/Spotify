package defpackage;

/* renamed from: ubd reason: default package */
public final class ubd implements wig<ubc> {
    private final wzi<twn> a;
    private final wzi<tzg> b;
    private final wzi<tza> c;
    private final wzi<txa> d;
    private final wzi<a> e;
    private final wzi<ubj> f;
    private final wzi<krv> g;
    private final wzi<Boolean> h;

    private ubd(wzi<twn> wzi, wzi<tzg> wzi2, wzi<tza> wzi3, wzi<txa> wzi4, wzi<a> wzi5, wzi<ubj> wzi6, wzi<krv> wzi7, wzi<Boolean> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static ubd a(wzi<twn> wzi, wzi<tzg> wzi2, wzi<tza> wzi3, wzi<txa> wzi4, wzi<a> wzi5, wzi<ubj> wzi6, wzi<krv> wzi7, wzi<Boolean> wzi8) {
        ubd ubd = new ubd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return ubd;
    }

    public final /* synthetic */ Object get() {
        ubc ubc = new ubc((twn) this.a.get(), (tzg) this.b.get(), (tza) this.c.get(), (txa) this.d.get(), wif.b(this.e), (ubj) this.f.get(), (krv) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return ubc;
    }
}
