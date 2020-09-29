package defpackage;

/* renamed from: mgn reason: default package */
public final class mgn implements vua<mgm> {
    private final wlc<mhp> a;

    private mgn(wlc<mhp> wlc) {
        this.a = wlc;
    }

    public static mgn a(wlc<mhp> wlc) {
        return new mgn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mgm((mhp) this.a.get());
    }
}
