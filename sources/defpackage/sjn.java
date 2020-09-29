package defpackage;

/* renamed from: sjn reason: default package */
public final class sjn implements wig<sjm> {
    private final wzi<sjy> a;
    private final wzi<Boolean> b;
    private final wzi<siw> c;

    private sjn(wzi<sjy> wzi, wzi<Boolean> wzi2, wzi<siw> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static sjn a(wzi<sjy> wzi, wzi<Boolean> wzi2, wzi<siw> wzi3) {
        return new sjn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sjm((sjy) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (siw) this.c.get());
    }
}
