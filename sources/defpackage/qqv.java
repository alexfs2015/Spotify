package defpackage;

/* renamed from: qqv reason: default package */
public final class qqv implements wig<qqu> {
    private final wzi<qqx> a;
    private final wzi<qrg> b;
    private final wzi<qqs> c;

    private qqv(wzi<qqx> wzi, wzi<qrg> wzi2, wzi<qqs> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qqv a(wzi<qqx> wzi, wzi<qrg> wzi2, wzi<qqs> wzi3) {
        return new qqv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qqu((qqx) this.a.get(), (qrg) this.b.get(), (qqs) this.c.get());
    }
}
