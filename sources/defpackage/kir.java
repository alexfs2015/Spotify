package defpackage;

/* renamed from: kir reason: default package */
public final class kir implements vua<kiq> {
    private final wlc<uxt> a;

    private kir(wlc<uxt> wlc) {
        this.a = wlc;
    }

    public static kir a(wlc<uxt> wlc) {
        return new kir(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kiq((uxt) this.a.get());
    }
}
