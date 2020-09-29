package defpackage;

/* renamed from: hti reason: default package */
public final class hti implements vua<hth> {
    private final wlc<ved> a;

    private hti(wlc<ved> wlc) {
        this.a = wlc;
    }

    public static hti a(wlc<ved> wlc) {
        return new hti(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hth((ved) this.a.get());
    }
}
