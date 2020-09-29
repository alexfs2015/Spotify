package defpackage;

/* renamed from: sof reason: default package */
public final class sof implements wig<soe> {
    private final wzi<skw> a;
    private final wzi<snp> b;
    private final wzi<sqh> c;
    private final wzi<spl> d;

    private sof(wzi<skw> wzi, wzi<snp> wzi2, wzi<sqh> wzi3, wzi<spl> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sof a(wzi<skw> wzi, wzi<snp> wzi2, wzi<sqh> wzi3, wzi<spl> wzi4) {
        return new sof(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new soe((skw) this.a.get(), (snp) this.b.get(), (sqh) this.c.get(), (spl) this.d.get());
    }
}
