package defpackage;

/* renamed from: mju reason: default package */
public final class mju implements vua<mjt> {
    private final wlc<a> a;
    private final wlc<miy> b;

    private mju(wlc<a> wlc, wlc<miy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mju a(wlc<a> wlc, wlc<miy> wlc2) {
        return new mju(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mjt(this.a, this.b);
    }
}
