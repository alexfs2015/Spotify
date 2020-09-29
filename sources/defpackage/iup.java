package defpackage;

/* renamed from: iup reason: default package */
public final class iup implements wig<has> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;
    private final wzi<a> c;

    private iup(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iup a(wzi<jlr> wzi, wzi<uqm> wzi2, wzi<a> wzi3) {
        return new iup(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (has) wil.a(new hat((jlr) this.a.get(), (uqm) this.b.get(), (a) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
