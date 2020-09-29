package defpackage;

/* renamed from: jvu reason: default package */
public final class jvu implements vua<jvt> {
    private final wlc<jph> a;
    private final wlc<uww> b;
    private final wlc<hed> c;

    private jvu(wlc<jph> wlc, wlc<uww> wlc2, wlc<hed> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static jvu a(wlc<jph> wlc, wlc<uww> wlc2, wlc<hed> wlc3) {
        return new jvu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new jvt((jph) this.a.get(), (uww) this.b.get(), (hed) this.c.get());
    }
}
