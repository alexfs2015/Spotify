package defpackage;

/* renamed from: qhv reason: default package */
public final class qhv implements wig<qhu> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;
    private final wzi<a> c;
    private final wzi<jtz> d;

    private qhv(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<a> wzi3, wzi<jtz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qhv a(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<a> wzi3, wzi<jtz> wzi4) {
        return new qhv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qhu((jlr) this.a.get(), (uqm) this.b.get(), (a) this.c.get(), (jtz) this.d.get());
    }
}
