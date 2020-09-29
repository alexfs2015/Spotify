package defpackage;

/* renamed from: sdp reason: default package */
public final class sdp implements vua<sdo> {
    private final wlc<sal> a;

    private sdp(wlc<sal> wlc) {
        this.a = wlc;
    }

    public static sdp a(wlc<sal> wlc) {
        return new sdp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sdo((sal) this.a.get());
    }
}
