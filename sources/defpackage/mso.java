package defpackage;

/* renamed from: mso reason: default package */
public final class mso implements vua<msn> {
    private final wlc<gup> a;
    private final wlc<gur> b;
    private final wlc<msm> c;
    private final wlc<gum> d;

    private mso(wlc<gup> wlc, wlc<gur> wlc2, wlc<msm> wlc3, wlc<gum> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mso a(wlc<gup> wlc, wlc<gur> wlc2, wlc<msm> wlc3, wlc<gum> wlc4) {
        return new mso(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new msn((gup) this.a.get(), (gur) this.b.get(), (msm) this.c.get(), (gum) this.d.get());
    }
}
