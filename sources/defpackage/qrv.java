package defpackage;

/* renamed from: qrv reason: default package */
public final class qrv implements wig<qru> {
    private final wzi<qqc> a;
    private final wzi<qss> b;
    private final wzi<qrj> c;
    private final wzi<qsd> d;

    private qrv(wzi<qqc> wzi, wzi<qss> wzi2, wzi<qrj> wzi3, wzi<qsd> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qrv a(wzi<qqc> wzi, wzi<qss> wzi2, wzi<qrj> wzi3, wzi<qsd> wzi4) {
        return new qrv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qru((qqc) this.a.get(), (qss) this.b.get(), (qrj) this.c.get(), (qsd) this.d.get());
    }
}
