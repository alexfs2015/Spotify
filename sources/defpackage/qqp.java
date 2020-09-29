package defpackage;

/* renamed from: qqp reason: default package */
public final class qqp implements wig<qqo> {
    private final wzi<qqq> a;
    private final wzi<qrg> b;

    private qqp(wzi<qqq> wzi, wzi<qrg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qqp a(wzi<qqq> wzi, wzi<qrg> wzi2) {
        return new qqp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qqo((qqq) this.a.get(), (qrg) this.b.get());
    }
}
