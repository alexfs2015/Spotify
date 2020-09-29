package defpackage;

/* renamed from: jul reason: default package */
public final class jul implements vua<juk> {
    private final wlc<Integer> a;
    private final wlc<Integer> b;

    private jul(wlc<Integer> wlc, wlc<Integer> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jul a(wlc<Integer> wlc, wlc<Integer> wlc2) {
        return new jul(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new juk(((Integer) this.a.get()).intValue(), ((Integer) this.b.get()).intValue());
    }
}
