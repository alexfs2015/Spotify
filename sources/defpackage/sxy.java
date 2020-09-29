package defpackage;

/* renamed from: sxy reason: default package */
public final class sxy implements wig<sxx> {
    private final wzi<sye> a;
    private final wzi<rtg> b;

    private sxy(wzi<sye> wzi, wzi<rtg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sxy a(wzi<sye> wzi, wzi<rtg> wzi2) {
        return new sxy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sxx((sye) this.a.get(), (rtg) this.b.get());
    }
}
