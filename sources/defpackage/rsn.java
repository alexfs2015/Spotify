package defpackage;

/* renamed from: rsn reason: default package */
public final class rsn implements vua<rsm> {
    private final wlc<rsq> a;

    private rsn(wlc<rsq> wlc) {
        this.a = wlc;
    }

    public static rsn a(wlc<rsq> wlc) {
        return new rsn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rsm((rsq) this.a.get());
    }
}
