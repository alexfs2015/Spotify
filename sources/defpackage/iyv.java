package defpackage;

/* renamed from: iyv reason: default package */
public final class iyv implements wig<iyu> {
    private final wzi<miy> a;
    private final wzi<mmx> b;
    private final wzi<mna> c;

    private iyv(wzi<miy> wzi, wzi<mmx> wzi2, wzi<mna> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iyv a(wzi<miy> wzi, wzi<mmx> wzi2, wzi<mna> wzi3) {
        return new iyv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new iyu((miy) this.a.get(), (mmx) this.b.get(), (mna) this.c.get());
    }
}
