package defpackage;

/* renamed from: jtx reason: default package */
public final class jtx implements wig<jtw> {
    private final wzi<mh> a;
    private final wzi<uyx> b;

    private jtx(wzi<mh> wzi, wzi<uyx> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jtx a(wzi<mh> wzi, wzi<uyx> wzi2) {
        return new jtx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jtw((mh) this.a.get(), (uyx) this.b.get());
    }
}
