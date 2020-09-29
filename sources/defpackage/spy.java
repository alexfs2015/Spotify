package defpackage;

/* renamed from: spy reason: default package */
public final class spy implements wig<spx> {
    private final wzi<slm> a;

    private spy(wzi<slm> wzi) {
        this.a = wzi;
    }

    public static spy a(wzi<slm> wzi) {
        return new spy(wzi);
    }

    public final /* synthetic */ Object get() {
        return new spx((slm) this.a.get());
    }
}
