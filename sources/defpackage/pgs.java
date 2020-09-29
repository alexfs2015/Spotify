package defpackage;

/* renamed from: pgs reason: default package */
public final class pgs implements vua<pgr> {
    private final wlc<rgz> a;
    private final wlc<vhe> b;

    private pgs(wlc<rgz> wlc, wlc<vhe> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pgs a(wlc<rgz> wlc, wlc<vhe> wlc2) {
        return new pgs(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pgr((rgz) this.a.get(), (vhe) this.b.get());
    }
}
