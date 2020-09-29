package defpackage;

/* renamed from: rkj reason: default package */
public final class rkj implements vua<rki> {
    private final wlc<jsq> a;
    private final wlc<a> b;

    private rkj(wlc<jsq> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rkj a(wlc<jsq> wlc, wlc<a> wlc2) {
        return new rkj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rki((jsq) this.a.get(), (a) this.b.get());
    }
}
