package defpackage;

/* renamed from: rqc reason: default package */
public final class rqc implements vua<rqb> {
    private final wlc<Boolean> a;

    private rqc(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static rqc a(wlc<Boolean> wlc) {
        return new rqc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rqb(this.a);
    }
}
