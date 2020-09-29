package defpackage;

/* renamed from: icc reason: default package */
public final class icc implements wig<icb> {
    private final wzi<kf> a;
    private final wzi<Boolean> b;

    private icc(wzi<kf> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static icc a(wzi<kf> wzi, wzi<Boolean> wzi2) {
        return new icc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new icb((kf) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
