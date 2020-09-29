package defpackage;

/* renamed from: pdy reason: default package */
public final class pdy implements wig<pdx> {
    private final wzi<pef> a;
    private final wzi<Boolean> b;
    private final wzi<String> c;

    private pdy(wzi<pef> wzi, wzi<Boolean> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pdy a(wzi<pef> wzi, wzi<Boolean> wzi2, wzi<String> wzi3) {
        return new pdy(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pdx((pef) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (String) this.c.get());
    }
}
