package defpackage;

/* renamed from: ise reason: default package */
public final class ise implements vua<isd> {
    private final wlc<ghm> a;

    private ise(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static ise a(wlc<ghm> wlc) {
        return new ise(wlc);
    }

    public final /* synthetic */ Object get() {
        return new isd((ghm) this.a.get());
    }
}
