package defpackage;

/* renamed from: nrv reason: default package */
public final class nrv implements vua<nru> {
    private final wlc<ujk> a;

    private nrv(wlc<ujk> wlc) {
        this.a = wlc;
    }

    public static nrv a(wlc<ujk> wlc) {
        return new nrv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nru((ujk) this.a.get());
    }
}
