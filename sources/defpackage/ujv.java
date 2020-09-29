package defpackage;

/* renamed from: ujv reason: default package */
public final class ujv implements wig<uju> {
    private final wzi<ukc> a;
    private final wzi<ukf> b;

    private ujv(wzi<ukc> wzi, wzi<ukf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ujv a(wzi<ukc> wzi, wzi<ukf> wzi2) {
        return new ujv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uju((ukc) this.a.get(), (ukf) this.b.get());
    }
}
