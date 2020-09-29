package defpackage;

/* renamed from: oaq reason: default package */
public final class oaq implements vua<oap> {
    private final wlc<jro> a;
    private final wlc<vju> b;
    private final wlc<ujc> c;

    private oaq(wlc<jro> wlc, wlc<vju> wlc2, wlc<ujc> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oaq a(wlc<jro> wlc, wlc<vju> wlc2, wlc<ujc> wlc3) {
        return new oaq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new oap((jro) this.a.get(), (vju) this.b.get(), (ujc) this.c.get());
    }
}
