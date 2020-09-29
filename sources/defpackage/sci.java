package defpackage;

/* renamed from: sci reason: default package */
public final class sci implements vua<sch> {
    private final wlc<scj> a;
    private final wlc<scr> b;
    private final wlc<sca> c;

    private sci(wlc<scj> wlc, wlc<scr> wlc2, wlc<sca> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sci a(wlc<scj> wlc, wlc<scr> wlc2, wlc<sca> wlc3) {
        return new sci(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new sch((scj) this.a.get(), (scr) this.b.get(), (sca) this.c.get());
    }
}
