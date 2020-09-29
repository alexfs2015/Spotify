package defpackage;

/* renamed from: iec reason: default package */
public final class iec implements vua<ieb> {
    private final wlc<iep> a;

    private iec(wlc<iep> wlc) {
        this.a = wlc;
    }

    public static iec a(wlc<iep> wlc) {
        return new iec(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ieb((iep) this.a.get());
    }
}
