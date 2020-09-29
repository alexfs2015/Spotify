package defpackage;

/* renamed from: tdz reason: default package */
public final class tdz implements wig<tdu> {
    private final wzi<tdx> a;
    private final wzi<tch> b;

    private tdz(wzi<tdx> wzi, wzi<tch> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tdz a(wzi<tdx> wzi, wzi<tch> wzi2) {
        return new tdz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tdu((tdx) this.a.get(), (tch) this.b.get());
    }
}
