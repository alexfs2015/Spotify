package defpackage;

/* renamed from: him reason: default package */
public final class him implements vua<hil> {
    private final wlc<jzf> a;
    private final wlc<jyh> b;
    private final wlc<jrp> c;

    private him(wlc<jzf> wlc, wlc<jyh> wlc2, wlc<jrp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static him a(wlc<jzf> wlc, wlc<jyh> wlc2, wlc<jrp> wlc3) {
        return new him(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hil((jzf) this.a.get(), (jyh) this.b.get(), (jrp) this.c.get());
    }
}
