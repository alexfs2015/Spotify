package defpackage;

/* renamed from: olq reason: default package */
public final class olq implements vua<olp> {
    private final wlc<opb> a;

    private olq(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static olq a(wlc<opb> wlc) {
        return new olq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new olp(this.a);
    }
}
