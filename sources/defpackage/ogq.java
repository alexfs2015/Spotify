package defpackage;

/* renamed from: ogq reason: default package */
public final class ogq implements wig<ogp> {
    private final wzi<ogn> a;
    private final wzi<jtz> b;

    private ogq(wzi<ogn> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ogq a(wzi<ogn> wzi, wzi<jtz> wzi2) {
        return new ogq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ogp((ogn) this.a.get(), (jtz) this.b.get());
    }
}
