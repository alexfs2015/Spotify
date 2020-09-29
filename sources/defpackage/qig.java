package defpackage;

/* renamed from: qig reason: default package */
public final class qig implements wig<qif> {
    private final wzi<squ> a;
    private final wzi<qiu> b;

    private qig(wzi<squ> wzi, wzi<qiu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qig a(wzi<squ> wzi, wzi<qiu> wzi2) {
        return new qig(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qif((squ) this.a.get(), (qiu) this.b.get());
    }
}
