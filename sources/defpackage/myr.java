package defpackage;

/* renamed from: myr reason: default package */
public final class myr implements vua<myq> {
    private final wlc<rgt> a;

    private myr(wlc<rgt> wlc) {
        this.a = wlc;
    }

    public static myr a(wlc<rgt> wlc) {
        return new myr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new myq((rgt) this.a.get());
    }
}
