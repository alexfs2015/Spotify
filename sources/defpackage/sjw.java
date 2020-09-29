package defpackage;

/* renamed from: sjw reason: default package */
public final class sjw implements vua<sjv> {
    private final wlc<fpt> a;
    private final wlc<rgz> b;
    private final wlc<snx> c;

    private sjw(wlc<fpt> wlc, wlc<rgz> wlc2, wlc<snx> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sjw a(wlc<fpt> wlc, wlc<rgz> wlc2, wlc<snx> wlc3) {
        return new sjw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new sjv((fpt) this.a.get(), (rgz) this.b.get(), (snx) this.c.get());
    }
}
