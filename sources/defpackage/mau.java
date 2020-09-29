package defpackage;

/* renamed from: mau reason: default package */
public final class mau implements vua<mat> {
    private final wlc<mag> a;
    private final wlc<a> b;

    private mau(wlc<mag> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mau a(wlc<mag> wlc, wlc<a> wlc2) {
        return new mau(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mat((mag) this.a.get(), (a) this.b.get());
    }
}
