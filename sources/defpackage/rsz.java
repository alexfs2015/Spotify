package defpackage;

/* renamed from: rsz reason: default package */
public final class rsz implements vua<rsy> {
    private final wlc<rnd> a;

    private rsz(wlc<rnd> wlc) {
        this.a = wlc;
    }

    public static rsz a(wlc<rnd> wlc) {
        return new rsz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rsy((rnd) this.a.get());
    }
}
