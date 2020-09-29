package defpackage;

/* renamed from: qsa reason: default package */
public final class qsa implements wig<qrz> {
    private final wzi<qrj> a;
    private final wzi<qsz> b;

    private qsa(wzi<qrj> wzi, wzi<qsz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qsa a(wzi<qrj> wzi, wzi<qsz> wzi2) {
        return new qsa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qrz((qrj) this.a.get(), (qsz) this.b.get());
    }
}
