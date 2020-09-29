package defpackage;

/* renamed from: oqw reason: default package */
public final class oqw implements vua<oqv> {
    private final wlc<opb> a;

    private oqw(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static oqw a(wlc<opb> wlc) {
        return new oqw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oqv(this.a);
    }
}
