package defpackage;

/* renamed from: srw reason: default package */
public final class srw implements vua<srv> {
    private final wlc<urp> a;

    private srw(wlc<urp> wlc) {
        this.a = wlc;
    }

    public static srw a(wlc<urp> wlc) {
        return new srw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new srv((urp) this.a.get());
    }
}
