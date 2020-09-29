package defpackage;

/* renamed from: myt reason: default package */
public final class myt implements vua<mys> {
    private final wlc<jrs> a;
    private final wlc<jro> b;
    private final wlc<uzm> c;
    private final wlc<rgt> d;

    private myt(wlc<jrs> wlc, wlc<jro> wlc2, wlc<uzm> wlc3, wlc<rgt> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static myt a(wlc<jrs> wlc, wlc<jro> wlc2, wlc<uzm> wlc3, wlc<rgt> wlc4) {
        return new myt(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mys((jrs) this.a.get(), (jro) this.b.get(), (uzm) this.c.get(), (rgt) this.d.get());
    }
}
