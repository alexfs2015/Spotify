package defpackage;

/* renamed from: lxm reason: default package */
public final class lxm implements vua<sie> {
    private final wlc<fpt> a;
    private final wlc<rgz> b;
    private final wlc<shy> c;

    private lxm(wlc<fpt> wlc, wlc<rgz> wlc2, wlc<shy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lxm a(wlc<fpt> wlc, wlc<rgz> wlc2, wlc<shy> wlc3) {
        return new lxm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (sie) vuf.a(((rgz) this.b.get()).a((fpt) this.a.get()) ? (sie) vtz.b(this.c).get() : sie.a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
