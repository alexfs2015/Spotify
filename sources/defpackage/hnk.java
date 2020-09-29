package defpackage;

/* renamed from: hnk reason: default package */
public final class hnk implements wig<hnj> {
    private final wzi<gil> a;
    private final wzi<rxi> b;

    private hnk(wzi<gil> wzi, wzi<rxi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hnk a(wzi<gil> wzi, wzi<rxi> wzi2) {
        return new hnk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hnj((gil) this.a.get(), (rxi) this.b.get());
    }
}
