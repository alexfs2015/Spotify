package defpackage;

/* renamed from: gpc reason: default package */
public final class gpc implements wig<gpb> {
    private final wzi<geb> a;
    private final wzi<got> b;
    private final wzi<gbp> c;

    private gpc(wzi<geb> wzi, wzi<got> wzi2, wzi<gbp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gpc a(wzi<geb> wzi, wzi<got> wzi2, wzi<gbp> wzi3) {
        return new gpc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gpb((geb) this.a.get(), (got) this.b.get(), (gbp) this.c.get());
    }
}
