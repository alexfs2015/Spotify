package defpackage;

/* renamed from: nfk reason: default package */
public final class nfk implements vua<ndq> {
    private final wlc<ghm> a;

    private nfk(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static nfk a(wlc<ghm> wlc) {
        return new nfk(wlc);
    }

    public static ndq a(ghm ghm) {
        return (ndq) vuf.a(CC.a(ghm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ghm) this.a.get());
    }
}
