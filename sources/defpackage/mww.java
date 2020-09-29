package defpackage;

/* renamed from: mww reason: default package */
public final class mww implements vua<mwv> {
    private final wlc<fpt> a;
    private final wlc<twu> b;
    private final wlc<rfs> c;

    private mww(wlc<fpt> wlc, wlc<twu> wlc2, wlc<rfs> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mww a(wlc<fpt> wlc, wlc<twu> wlc2, wlc<rfs> wlc3) {
        return new mww(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mwv((fpt) this.a.get(), (twu) this.b.get(), (rfs) this.c.get());
    }
}
