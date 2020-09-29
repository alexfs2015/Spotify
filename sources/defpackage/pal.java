package defpackage;

/* renamed from: pal reason: default package */
public final class pal implements vua<pak> {
    private final wlc<pam> a;
    private final wlc<pao> b;
    private final wlc<jrp> c;
    private final wlc<jro> d;
    private final wlc<String> e;

    private pal(wlc<pam> wlc, wlc<pao> wlc2, wlc<jrp> wlc3, wlc<jro> wlc4, wlc<String> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pal a(wlc<pam> wlc, wlc<pao> wlc2, wlc<jrp> wlc3, wlc<jro> wlc4, wlc<String> wlc5) {
        pal pal = new pal(wlc, wlc2, wlc3, wlc4, wlc5);
        return pal;
    }

    public final /* synthetic */ Object get() {
        pak pak = new pak((pam) this.a.get(), (pao) this.b.get(), (jrp) this.c.get(), (jro) this.d.get(), (String) this.e.get());
        return pak;
    }
}
