package defpackage;

/* renamed from: lxu reason: default package */
public final class lxu implements vua<lxt> {
    private final wlc<Boolean> a;

    private lxu(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static lxu a(wlc<Boolean> wlc) {
        return new lxu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lxt(((Boolean) this.a.get()).booleanValue());
    }
}
