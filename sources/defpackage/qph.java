package defpackage;

/* renamed from: qph reason: default package */
public final class qph implements wig<Boolean> {
    private final wzi<fqn> a;

    private qph(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static qph a(wzi<fqn> wzi) {
        return new qph(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf("Enabled".equals((String) ((fqn) this.a.get()).a(qoq.b)));
    }
}
