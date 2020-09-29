package defpackage;

/* renamed from: opc reason: default package */
public final class opc implements vua<opb> {
    private final wlc<jjf> a;
    private final wlc<sih> b;

    private opc(wlc<jjf> wlc, wlc<sih> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static opc a(wlc<jjf> wlc, wlc<sih> wlc2) {
        return new opc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new opb((jjf) this.a.get(), (sih) this.b.get());
    }
}
