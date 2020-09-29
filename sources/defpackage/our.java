package defpackage;

/* renamed from: our reason: default package */
public final class our implements vua<ouq> {
    private final wlc<ouw> a;
    private final wlc<rcn> b;

    private our(wlc<ouw> wlc, wlc<rcn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static our a(wlc<ouw> wlc, wlc<rcn> wlc2) {
        return new our(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ouq((ouw) this.a.get(), (rcn) this.b.get());
    }
}
