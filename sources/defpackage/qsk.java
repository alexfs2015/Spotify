package defpackage;

/* renamed from: qsk reason: default package */
public final class qsk implements wig<qsj> {
    private final wzi<qqc> a;
    private final wzi<qss> b;
    private final wzi<qrj> c;
    private final wzi<qsd> d;

    private qsk(wzi<qqc> wzi, wzi<qss> wzi2, wzi<qrj> wzi3, wzi<qsd> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qsk a(wzi<qqc> wzi, wzi<qss> wzi2, wzi<qrj> wzi3, wzi<qsd> wzi4) {
        return new qsk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qsj((qqc) this.a.get(), (qss) this.b.get(), (qrj) this.c.get(), (qsd) this.d.get());
    }
}
