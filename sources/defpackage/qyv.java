package defpackage;

/* renamed from: qyv reason: default package */
public final class qyv implements wig<qyu> {
    private final wzi<qym> a;
    private final wzi<qyb> b;

    private qyv(wzi<qym> wzi, wzi<qyb> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qyv a(wzi<qym> wzi, wzi<qyb> wzi2) {
        return new qyv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qyu(wif.b(this.a), (qyb) this.b.get());
    }
}
