package defpackage;

/* renamed from: sxr reason: default package */
public final class sxr implements vua<sxj> {
    private final wlc<kxg> a;
    private final wlc<fpt> b;

    private sxr(wlc<kxg> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sxr a(wlc<kxg> wlc, wlc<fpt> wlc2) {
        return new sxr(wlc, wlc2);
    }

    public static sxj a(kxg kxg, fpt fpt) {
        return (sxj) vuf.a(CC.a(kxg, fpt), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((kxg) this.a.get(), (fpt) this.b.get());
    }
}
