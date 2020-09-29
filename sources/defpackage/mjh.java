package defpackage;

/* renamed from: mjh reason: default package */
public final class mjh implements vua<mjg> {
    private final wlc<mji> a;
    private final wlc<String> b;

    private mjh(wlc<mji> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mjh a(wlc<mji> wlc, wlc<String> wlc2) {
        return new mjh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mjg(this.a, this.b);
    }
}
