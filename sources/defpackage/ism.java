package defpackage;

/* renamed from: ism reason: default package */
public final class ism implements vua<gxz> {
    private final wlc<jjf> a;
    private final wlc<udr> b;
    private final wlc<a> c;

    private ism(wlc<jjf> wlc, wlc<udr> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ism a(wlc<jjf> wlc, wlc<udr> wlc2, wlc<a> wlc3) {
        return new ism(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (gxz) vuf.a(new gya((jjf) this.a.get(), (udr) this.b.get(), (a) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
