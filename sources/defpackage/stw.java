package defpackage;

/* renamed from: stw reason: default package */
public final class stw implements wig<stv> {
    private final wzi<sue> a;
    private final wzi<String> b;

    private stw(wzi<sue> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static stw a(wzi<sue> wzi, wzi<String> wzi2) {
        return new stw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new stv((sue) this.a.get(), (String) this.b.get());
    }
}
