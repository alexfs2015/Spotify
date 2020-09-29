package defpackage;

/* renamed from: qfk reason: default package */
public final class qfk implements wig<sqd> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;
    private final wzi<jtz> c;

    private qfk(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<jtz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qfk a(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<jtz> wzi3) {
        return new qfk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (sqd) wil.a(new qht((jlr) this.a.get(), (uqm) this.b.get(), (jtz) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
