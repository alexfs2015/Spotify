package defpackage;

/* renamed from: pbw reason: default package */
public final class pbw implements vua<pbv> {
    private final wlc<a> a;
    private final wlc<a> b;
    private final wlc<a> c;
    private final wlc<a> d;

    private pbw(wlc<a> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pbw a(wlc<a> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<a> wlc4) {
        return new pbw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pbv((a) this.a.get(), (a) this.b.get(), (a) this.c.get(), (a) this.d.get());
    }
}
