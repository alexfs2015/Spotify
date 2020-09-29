package defpackage;

/* renamed from: hru reason: default package */
public final class hru implements vua<hrt> {
    private final wlc<ioj> a;
    private final wlc<hpb> b;

    private hru(wlc<ioj> wlc, wlc<hpb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hru a(wlc<ioj> wlc, wlc<hpb> wlc2) {
        return new hru(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hrt((ioj) this.a.get(), (hpb) this.b.get());
    }
}
