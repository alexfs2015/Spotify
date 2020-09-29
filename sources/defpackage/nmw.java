package defpackage;

/* renamed from: nmw reason: default package */
public final class nmw implements vua<nmv> {
    private final wlc<String> a;
    private final wlc<sih> b;
    private final wlc<jjf> c;

    private nmw(wlc<String> wlc, wlc<sih> wlc2, wlc<jjf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nmw a(wlc<String> wlc, wlc<sih> wlc2, wlc<jjf> wlc3) {
        return new nmw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nmv(this.a, this.b, this.c);
    }
}
