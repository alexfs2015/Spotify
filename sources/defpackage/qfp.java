package defpackage;

/* renamed from: qfp reason: default package */
public final class qfp implements wig<Boolean> {
    private final wzi<fqn> a;

    private qfp(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static qfp a(wzi<fqn> wzi) {
        return new qfp(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jus.c((fqn) this.a.get()));
    }
}
