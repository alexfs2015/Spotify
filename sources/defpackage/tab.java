package defpackage;

/* renamed from: tab reason: default package */
public final class tab implements vua<szx> {
    private final wlc<fpt> a;
    private final wlc<rgz> b;
    private final wlc<szs> c;
    private final wlc<szu> d;

    public static szx a(fpt fpt, rgz rgz, wlc<szs> wlc, wlc<szu> wlc2) {
        return (szx) vuf.a(CC.a(fpt, rgz, wlc, wlc2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((fpt) this.a.get(), (rgz) this.b.get(), this.c, this.d);
    }
}
