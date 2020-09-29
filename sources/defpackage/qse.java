package defpackage;

/* renamed from: qse reason: default package */
public final class qse implements wig<qsd> {
    private final wzi<qtb> a;
    private final wzi<qrj> b;

    private qse(wzi<qtb> wzi, wzi<qrj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qse a(wzi<qtb> wzi, wzi<qrj> wzi2) {
        return new qse(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qsd((qtb) this.a.get(), (qrj) this.b.get());
    }
}
