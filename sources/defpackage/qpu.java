package defpackage;

/* renamed from: qpu reason: default package */
public final class qpu implements vua<qpt> {
    private final wlc<ghm> a;

    private qpu(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static qpu a(wlc<ghm> wlc) {
        return new qpu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qpt((ghm) this.a.get());
    }
}
