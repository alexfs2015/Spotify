package defpackage;

/* renamed from: lbj reason: default package */
public final class lbj implements wig<lbi> {
    private final wzi<ura> a;
    private final wzi<lbk> b;

    private lbj(wzi<ura> wzi, wzi<lbk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lbj a(wzi<ura> wzi, wzi<lbk> wzi2) {
        return new lbj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lbi((ura) this.a.get(), (lbk) this.b.get());
    }
}
