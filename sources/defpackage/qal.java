package defpackage;

/* renamed from: qal reason: default package */
public final class qal implements vua<qak> {
    private final wlc<fpt> a;

    private qal(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static qal a(wlc<fpt> wlc) {
        return new qal(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qak((fpt) this.a.get());
    }
}
