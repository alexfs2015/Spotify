package defpackage;

/* renamed from: uhy reason: default package */
public final class uhy implements wig<uhx> {
    private final wzi<jtz> a;
    private final wzi<jlr> b;
    private final wzi<gkq> c;
    private final wzi<sso> d;

    private uhy(wzi<jtz> wzi, wzi<jlr> wzi2, wzi<gkq> wzi3, wzi<sso> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uhy a(wzi<jtz> wzi, wzi<jlr> wzi2, wzi<gkq> wzi3, wzi<sso> wzi4) {
        return new uhy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new uhx((jtz) this.a.get(), (jlr) this.b.get(), (gkq) this.c.get(), (sso) this.d.get());
    }
}
