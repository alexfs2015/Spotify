package defpackage;

/* renamed from: rvj reason: default package */
public final class rvj implements vua<rvi> {
    private final wlc<ghm> a;

    private rvj(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static rvj a(wlc<ghm> wlc) {
        return new rvj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rvi((ghm) this.a.get());
    }
}
