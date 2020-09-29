package defpackage;

/* renamed from: kuh reason: default package */
public final class kuh implements vua<kug> {
    private final wlc<fpt> a;
    private final wlc<kum> b;
    private final wlc<kuq> c;

    private kuh(wlc<fpt> wlc, wlc<kum> wlc2, wlc<kuq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kuh a(wlc<fpt> wlc, wlc<kum> wlc2, wlc<kuq> wlc3) {
        return new kuh(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kug((fpt) this.a.get(), (kum) this.b.get(), (kuq) this.c.get());
    }
}
