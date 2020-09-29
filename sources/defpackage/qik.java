package defpackage;

/* renamed from: qik reason: default package */
public final class qik implements wig<qij> {
    private final wzi<squ> a;
    private final wzi<qiu> b;

    private qik(wzi<squ> wzi, wzi<qiu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qik a(wzi<squ> wzi, wzi<qiu> wzi2) {
        return new qik(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qij((squ) this.a.get(), (qiu) this.b.get());
    }
}
