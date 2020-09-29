package defpackage;

/* renamed from: vkr reason: default package */
public final class vkr implements vua<vjy> {
    private final wlc<vnk> a;
    private final wlc<vkq> b;

    private vkr(wlc<vnk> wlc, wlc<vkq> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vkr a(wlc<vnk> wlc, wlc<vkq> wlc2) {
        return new vkr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        vkq vkq = (vkq) this.b.get();
        return (vjy) vuf.a(new vjy((vnk) this.a.get(), new vnd()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
