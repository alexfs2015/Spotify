package defpackage;

/* renamed from: ujx reason: default package */
public final class ujx implements wig<ujw> {
    private final wzi<ukc> a;
    private final wzi<ukf> b;

    private ujx(wzi<ukc> wzi, wzi<ukf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ujx a(wzi<ukc> wzi, wzi<ukf> wzi2) {
        return new ujx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ujw((ukc) this.a.get(), (ukf) this.b.get());
    }
}
