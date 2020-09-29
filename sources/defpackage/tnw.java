package defpackage;

/* renamed from: tnw reason: default package */
public final class tnw implements vua<tnv> {
    private final wlc<tnc> a;

    private tnw(wlc<tnc> wlc) {
        this.a = wlc;
    }

    public static tnw a(wlc<tnc> wlc) {
        return new tnw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tnv((tnc) this.a.get());
    }
}
