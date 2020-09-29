package defpackage;

/* renamed from: pcz reason: default package */
public final class pcz implements vua<pcy> {
    private final wlc<rnd> a;

    private pcz(wlc<rnd> wlc) {
        this.a = wlc;
    }

    public static pcz a(wlc<rnd> wlc) {
        return new pcz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pcy((rnd) this.a.get());
    }
}
