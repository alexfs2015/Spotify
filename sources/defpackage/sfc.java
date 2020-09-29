package defpackage;

/* renamed from: sfc reason: default package */
public final class sfc implements vua<sfb> {
    private final wlc<rzh> a;

    private sfc(wlc<rzh> wlc) {
        this.a = wlc;
    }

    public static sfc a(wlc<rzh> wlc) {
        return new sfc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sfb((rzh) this.a.get());
    }
}
