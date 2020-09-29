package defpackage;

/* renamed from: man reason: default package */
public final class man implements vua<mam> {
    private final wlc<mao> a;
    private final wlc<mai> b;
    private final wlc<a> c;
    private final wlc<mak> d;

    private man(wlc<mao> wlc, wlc<mai> wlc2, wlc<a> wlc3, wlc<mak> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static man a(wlc<mao> wlc, wlc<mai> wlc2, wlc<a> wlc3, wlc<mak> wlc4) {
        return new man(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mam((mao) this.a.get(), (mai) this.b.get(), (a) this.c.get(), (mak) this.d.get());
    }
}
