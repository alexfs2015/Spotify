package defpackage;

/* renamed from: nbx reason: default package */
public final class nbx implements vua<gxz> {
    private final wlc<jjf> a;
    private final wlc<udr> b;

    private nbx(wlc<jjf> wlc, wlc<udr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nbx a(wlc<jjf> wlc, wlc<udr> wlc2) {
        return new nbx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (gxz) vuf.a(CC.a((jjf) this.a.get(), (udr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
