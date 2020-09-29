package defpackage;

/* renamed from: lnx reason: default package */
public final class lnx implements wig<lnw> {
    private final wzi<kf> a;
    private final wzi<Boolean> b;

    private lnx(wzi<kf> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lnx a(wzi<kf> wzi, wzi<Boolean> wzi2) {
        return new lnx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lnw((kf) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
