package defpackage;

/* renamed from: lor reason: default package */
public final class lor implements wig<loq> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private lor(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lor a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new lor(wzi, wzi2);
    }

    public static loq b(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new loq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new loq(this.a, this.b);
    }
}
