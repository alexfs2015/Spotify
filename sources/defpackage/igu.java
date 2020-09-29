package defpackage;

/* renamed from: igu reason: default package */
public final class igu implements wig<igt> {
    private final wzi<ihc> a;
    private final wzi<ihf> b;
    private final wzi<tmu> c;
    private final wzi<ibn> d;

    private igu(wzi<ihc> wzi, wzi<ihf> wzi2, wzi<tmu> wzi3, wzi<ibn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static igu a(wzi<ihc> wzi, wzi<ihf> wzi2, wzi<tmu> wzi3, wzi<ibn> wzi4) {
        return new igu(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new igt(this.a, this.b, this.c, this.d);
    }
}
