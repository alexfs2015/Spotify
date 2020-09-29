package defpackage;

/* renamed from: gnt reason: default package */
public final class gnt implements vua<gns> {
    private final wlc<gny> a;
    private final wlc<gog> b;

    private gnt(wlc<gny> wlc, wlc<gog> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gnt a(wlc<gny> wlc, wlc<gog> wlc2) {
        return new gnt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gns((gny) this.a.get(), (gog) this.b.get());
    }
}
