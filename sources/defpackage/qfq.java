package defpackage;

/* renamed from: qfq reason: default package */
public final class qfq implements wig<Boolean> {
    private final wzi<uuc> a;
    private final wzi<fqn> b;

    private qfq(wzi<uuc> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qfq a(wzi<uuc> wzi, wzi<fqn> wzi2) {
        return new qfq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        uuc uuc = (uuc) this.a.get();
        fqn fqn = (fqn) this.b.get();
        return Boolean.valueOf(((fqn) fbp.a(fqn)).b(uub.a) || ((fqn) fbp.a(fqn)).b(uub.b));
    }
}
