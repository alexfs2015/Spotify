package defpackage;

/* renamed from: mbm reason: default package */
public final class mbm implements vua<mbl> {
    private final wlc<jro> a;

    private mbm(wlc<jro> wlc) {
        this.a = wlc;
    }

    public static mbm a(wlc<jro> wlc) {
        return new mbm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mbl((jro) this.a.get());
    }
}
