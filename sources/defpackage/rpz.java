package defpackage;

/* renamed from: rpz reason: default package */
public final class rpz implements wig<rpy> {
    private final wzi<szp> a;
    private final wzi<rom> b;

    private rpz(wzi<szp> wzi, wzi<rom> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rpz a(wzi<szp> wzi, wzi<rom> wzi2) {
        return new rpz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rpy((szp) this.a.get(), (rom) this.b.get());
    }
}
