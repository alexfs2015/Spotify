package defpackage;

/* renamed from: tbw reason: default package */
public final class tbw implements vua<tbv> {
    private final wlc<tbg> a;

    private tbw(wlc<tbg> wlc) {
        this.a = wlc;
    }

    public static tbw a(wlc<tbg> wlc) {
        return new tbw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tbv((tbg) this.a.get());
    }
}
