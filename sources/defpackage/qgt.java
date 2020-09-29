package defpackage;

/* renamed from: qgt reason: default package */
public final class qgt implements vua<Boolean> {
    private final wlc<fpt> a;

    private qgt(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static qgt a(wlc<fpt> wlc) {
        return new qgt(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf("Enabled".equals((String) ((fpt) this.a.get()).a(qgc.b)));
    }
}
