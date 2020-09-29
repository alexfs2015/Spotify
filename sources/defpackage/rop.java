package defpackage;

/* renamed from: rop reason: default package */
public final class rop implements vua<roo> {
    private final wlc<rpe> a;

    private rop(wlc<rpe> wlc) {
        this.a = wlc;
    }

    public static rop a(wlc<rpe> wlc) {
        return new rop(wlc);
    }

    public final /* synthetic */ Object get() {
        return new roo((rpe) this.a.get());
    }
}
