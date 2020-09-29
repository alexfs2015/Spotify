package defpackage;

/* renamed from: hpu reason: default package */
public final class hpu implements vua<hpt> {
    private final wlc<hqq> a;

    private hpu(wlc<hqq> wlc) {
        this.a = wlc;
    }

    public static hpu a(wlc<hqq> wlc) {
        return new hpu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hpt(vtz.b(this.a));
    }
}
