package defpackage;

/* renamed from: rmi reason: default package */
public final class rmi implements vua<rmh> {
    private final wlc<jrs> a;
    private final wlc<rlp> b;
    private final wlc<hvl> c;
    private final wlc<rli> d;
    private final wlc<Boolean> e;

    private rmi(wlc<jrs> wlc, wlc<rlp> wlc2, wlc<hvl> wlc3, wlc<rli> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rmi a(wlc<jrs> wlc, wlc<rlp> wlc2, wlc<hvl> wlc3, wlc<rli> wlc4, wlc<Boolean> wlc5) {
        rmi rmi = new rmi(wlc, wlc2, wlc3, wlc4, wlc5);
        return rmi;
    }

    public final /* synthetic */ Object get() {
        rmh rmh = new rmh((jrs) this.a.get(), (rlp) this.b.get(), (hvl) this.c.get(), (rli) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return rmh;
    }
}
