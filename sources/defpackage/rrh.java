package defpackage;

/* renamed from: rrh reason: default package */
public final class rrh implements vua<rrg> {
    private final wlc<hed> a;

    private rrh(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static rrh a(wlc<hed> wlc) {
        return new rrh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rrg((hed) this.a.get());
    }
}
