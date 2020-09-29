package defpackage;

/* renamed from: mux reason: default package */
public final class mux implements vua<muw> {
    private final wlc<mun> a;
    private final wlc<ioa> b;

    private mux(wlc<mun> wlc, wlc<ioa> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mux a(wlc<mun> wlc, wlc<ioa> wlc2) {
        return new mux(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new muw((mun) this.a.get(), this.b);
    }
}
