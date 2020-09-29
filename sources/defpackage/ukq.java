package defpackage;

/* renamed from: ukq reason: default package */
public final class ukq implements wig<ukp> {
    private final wzi<fqn> a;
    private final wzi<sye> b;

    private ukq(wzi<fqn> wzi, wzi<sye> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ukq a(wzi<fqn> wzi, wzi<sye> wzi2) {
        return new ukq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ukp((fqn) this.a.get(), (sye) this.b.get());
    }
}
