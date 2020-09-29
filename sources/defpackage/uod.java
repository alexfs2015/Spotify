package defpackage;

/* renamed from: uod reason: default package */
public final class uod implements vua<uoc> {
    private final wlc<uok> a;
    private final wlc<fpt> b;

    private uod(wlc<uok> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uod a(wlc<uok> wlc, wlc<fpt> wlc2) {
        return new uod(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uoc((uok) this.a.get(), (fpt) this.b.get());
    }
}
