package defpackage;

/* renamed from: oqd reason: default package */
public final class oqd implements vua<oqc> {
    private final wlc<oqa> a;
    private final wlc<a> b;

    private oqd(wlc<oqa> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oqd a(wlc<oqa> wlc, wlc<a> wlc2) {
        return new oqd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oqc((oqa) this.a.get(), (a) this.b.get());
    }
}
