package defpackage;

/* renamed from: rvg reason: default package */
public final class rvg implements wig<rvf> {
    private final wzi<ruo> a;
    private final wzi<rvh> b;

    private rvg(wzi<ruo> wzi, wzi<rvh> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rvg a(wzi<ruo> wzi, wzi<rvh> wzi2) {
        return new rvg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rvf((ruo) this.a.get(), (rvh) this.b.get());
    }
}
