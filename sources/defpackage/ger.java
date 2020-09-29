package defpackage;

/* renamed from: ger reason: default package */
public final class ger implements wig<geq> {
    private final wzi<giz> a;
    private final wzi<rwl> b;

    private ger(wzi<giz> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ger a(wzi<giz> wzi, wzi<rwl> wzi2) {
        return new ger(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new geq((giz) this.a.get(), (rwl) this.b.get());
    }
}
