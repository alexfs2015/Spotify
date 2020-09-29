package defpackage;

/* renamed from: udu reason: default package */
public final class udu implements vua<gjf> {
    private final wlc<udv> a;

    private udu(wlc<udv> wlc) {
        this.a = wlc;
    }

    public static udu a(wlc<udv> wlc) {
        return new udu(wlc);
    }

    public static gjf a(udv udv) {
        return (gjf) vuf.a(udv.aj(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((udv) this.a.get());
    }
}
