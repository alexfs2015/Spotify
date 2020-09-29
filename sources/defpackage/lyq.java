package defpackage;

/* renamed from: lyq reason: default package */
public final class lyq implements wig<lyp> {
    private final wzi<viv> a;
    private final wzi<vig> b;

    private lyq(wzi<viv> wzi, wzi<vig> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lyq a(wzi<viv> wzi, wzi<vig> wzi2) {
        return new lyq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lyp((viv) this.a.get(), (vig) this.b.get());
    }
}
