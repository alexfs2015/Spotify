package defpackage;

/* renamed from: hbb reason: default package */
public final class hbb implements vua<hba> {
    private final wlc<uxc> a;

    private hbb(wlc<uxc> wlc) {
        this.a = wlc;
    }

    public static hbb a(wlc<uxc> wlc) {
        return new hbb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hba((uxc) this.a.get());
    }
}
