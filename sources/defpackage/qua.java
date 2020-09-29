package defpackage;

/* renamed from: qua reason: default package */
public final class qua implements wig<qtz> {
    private final wzi<quk> a;
    private final wzi<quk> b;

    private qua(wzi<quk> wzi, wzi<quk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qua a(wzi<quk> wzi, wzi<quk> wzi2) {
        return new qua(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qtz((quk) this.a.get(), (quk) this.b.get());
    }
}
