package defpackage;

/* renamed from: mbj reason: default package */
public final class mbj implements vua<mbi> {
    private final wlc<max> a;
    private final wlc<sih> b;
    private final wlc<gup> c;

    private mbj(wlc<max> wlc, wlc<sih> wlc2, wlc<gup> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mbj a(wlc<max> wlc, wlc<sih> wlc2, wlc<gup> wlc3) {
        return new mbj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mbi((max) this.a.get(), (sih) this.b.get(), (gup) this.c.get());
    }
}
