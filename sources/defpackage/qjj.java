package defpackage;

/* renamed from: qjj reason: default package */
public final class qjj implements wig<qji> {
    private final wzi<fqn> a;

    private qjj(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static qjj a(wzi<fqn> wzi) {
        return new qjj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qji((fqn) this.a.get());
    }
}
