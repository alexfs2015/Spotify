package defpackage;

/* renamed from: qii reason: default package */
public final class qii implements wig<qih> {
    private final wzi<squ> a;
    private final wzi<qiu> b;

    private qii(wzi<squ> wzi, wzi<qiu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qii a(wzi<squ> wzi, wzi<qiu> wzi2) {
        return new qii(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qih((squ) this.a.get(), (qiu) this.b.get());
    }
}
