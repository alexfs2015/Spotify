package defpackage;

/* renamed from: sxt reason: default package */
public final class sxt implements vua<sxk> {
    private final wlc<fpt> a;
    private final wlc<rgz> b;
    private final wlc<sxm> c;
    private final wlc<sxo> d;

    public static sxk a(fpt fpt, rgz rgz, wlc<sxm> wlc, wlc<sxo> wlc2) {
        return (sxk) vuf.a(CC.a(fpt, rgz, wlc, wlc2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((fpt) this.a.get(), (rgz) this.b.get(), this.c, this.d);
    }
}
