package defpackage;

/* renamed from: rkf reason: default package */
public final class rkf implements wig<rke> {
    private final wzi<ure> a;
    private final wzi<rji> b;

    private rkf(wzi<ure> wzi, wzi<rji> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rkf a(wzi<ure> wzi, wzi<rji> wzi2) {
        return new rkf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rke((ure) this.a.get(), (rji) this.b.get());
    }
}
