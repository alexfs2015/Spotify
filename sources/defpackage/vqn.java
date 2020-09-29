package defpackage;

/* renamed from: vqn reason: default package */
public final class vqn implements vua<wud<vri>> {
    private final wlc<wud<wan>> a;
    private final wlc<vpn> b;
    private final wlc<vpt> c;

    private vqn(wlc<wud<wan>> wlc, wlc<vpn> wlc2, wlc<vpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static vqn a(wlc<wud<wan>> wlc, wlc<vpn> wlc2, wlc<vpt> wlc3) {
        return new vqn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((wud) this.a.get(), (vpn) this.b.get(), (vpt) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
