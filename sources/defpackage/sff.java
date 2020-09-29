package defpackage;

/* renamed from: sff reason: default package */
public final class sff implements vua<sfe> {
    private final wlc<sfw> a;
    private final wlc<sga> b;

    private sff(wlc<sfw> wlc, wlc<sga> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sff a(wlc<sfw> wlc, wlc<sga> wlc2) {
        return new sff(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sfe((sfw) this.a.get(), (sga) this.b.get());
    }
}
