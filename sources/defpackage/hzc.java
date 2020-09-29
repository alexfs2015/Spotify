package defpackage;

/* renamed from: hzc reason: default package */
public final class hzc implements vua<hzb> {
    private final wlc<idu> a;

    private hzc(wlc<idu> wlc) {
        this.a = wlc;
    }

    public static hzc a(wlc<idu> wlc) {
        return new hzc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hzb((idu) this.a.get());
    }
}
