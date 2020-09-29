package defpackage;

/* renamed from: hcn reason: default package */
public final class hcn implements vua<Integer> {
    private final wlc<Integer> a;

    private hcn(wlc<Integer> wlc) {
        this.a = wlc;
    }

    public static hcn a(wlc<Integer> wlc) {
        return new hcn(wlc);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Integer) this.a.get()).intValue() << 1);
    }
}
