package defpackage;

/* renamed from: lot reason: default package */
public final class lot implements wig<los> {
    private final wzi<szp> a;
    private final wzi<lou> b;
    private final wzi<loq> c;

    private lot(wzi<szp> wzi, wzi<lou> wzi2, wzi<loq> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static los a(szp szp, Object obj, Object obj2) {
        return new los(szp, (lou) obj, (loq) obj2);
    }

    public static lot a(wzi<szp> wzi, wzi<lou> wzi2, wzi<loq> wzi3) {
        return new lot(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new los((szp) this.a.get(), (lou) this.b.get(), (loq) this.c.get());
    }
}
