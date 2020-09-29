package defpackage;

/* renamed from: ryg reason: default package */
public final class ryg implements wig<ryf> {
    private final wzi<gmf> a;
    private final wzi<gmk> b;

    private ryg(wzi<gmf> wzi, wzi<gmk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ryg a(wzi<gmf> wzi, wzi<gmk> wzi2) {
        return new ryg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ryf((gmf) this.a.get(), (gmk) this.b.get());
    }
}
