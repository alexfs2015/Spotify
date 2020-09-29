package defpackage;

/* renamed from: rvf reason: default package */
public final class rvf implements vua<rve> {
    private final wlc<hec> a;

    private rvf(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static rvf a(wlc<hec> wlc) {
        return new rvf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rve((hec) this.a.get());
    }
}
