package defpackage;

/* renamed from: map reason: default package */
public final class map implements vua<mao> {
    private final wlc<mat> a;
    private final wlc<a> b;

    private map(wlc<mat> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static map a(wlc<mat> wlc, wlc<a> wlc2) {
        return new map(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mao((mat) this.a.get(), (a) this.b.get());
    }
}
