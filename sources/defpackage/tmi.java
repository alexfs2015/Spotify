package defpackage;

/* renamed from: tmi reason: default package */
public final class tmi implements vua<tmh> {
    private final wlc<a> a;
    private final wlc<a> b;
    private final wlc<a> c;

    private tmi(wlc<a> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tmi a(wlc<a> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        return new tmi(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tmh(vtz.b(this.a), (a) this.b.get(), (a) this.c.get());
    }
}
