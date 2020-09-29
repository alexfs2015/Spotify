package defpackage;

/* renamed from: pix reason: default package */
public final class pix implements wig<piw> {
    private final wzi<String> a;
    private final wzi<piq> b;

    private pix(wzi<String> wzi, wzi<piq> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pix a(wzi<String> wzi, wzi<piq> wzi2) {
        return new pix(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new piw((String) this.a.get(), (piq) this.b.get());
    }
}
