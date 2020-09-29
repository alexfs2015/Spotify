package defpackage;

/* renamed from: pxq reason: default package */
public final class pxq implements vua<Integer> {
    private final wlc<fpt> a;

    private pxq(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static pxq a(wlc<fpt> wlc) {
        return new pxq(wlc);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Integer) ((fpt) this.a.get()).a(ses.b)).intValue());
    }
}
