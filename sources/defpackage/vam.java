package defpackage;

/* renamed from: vam reason: default package */
public final class vam implements wig<val> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;
    private final wzi<jtz> c;

    private vam(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<jtz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static vam a(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<jtz> wzi3) {
        return new vam(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new val((jlr) this.a.get(), (uqm) this.b.get(), (jtz) this.c.get());
    }
}
