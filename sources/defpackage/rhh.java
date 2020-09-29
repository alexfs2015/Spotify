package defpackage;

/* renamed from: rhh reason: default package */
public final class rhh implements vua<rhf> {
    private final wlc<ghm> a;

    private rhh(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static rhh a(wlc<ghm> wlc) {
        return new rhh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rhf((ghm) this.a.get());
    }
}
