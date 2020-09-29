package defpackage;

/* renamed from: qmk reason: default package */
public final class qmk implements wig<ijt> {
    private final wzi<qmd> a;
    private final wzi<fqn> b;
    private final wzi<jxz> c;
    private final wzi<ijr> d;

    private qmk(wzi<qmd> wzi, wzi<fqn> wzi2, wzi<jxz> wzi3, wzi<ijr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qmk a(wzi<qmd> wzi, wzi<fqn> wzi2, wzi<jxz> wzi3, wzi<ijr> wzi4) {
        return new qmk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (ijt) wil.a(new ijt((qmd) this.a.get(), (fqn) this.b.get(), (jxz) this.c.get(), (ijr) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
