package defpackage;

/* renamed from: vqk reason: default package */
public final class vqk implements vua<wud<?>> {
    private final wlc<String> a;
    private final wlc<vqp> b;
    private final wlc<vrh> c;
    private final wlc<wud<wan>> d;
    private final wlc<vpt> e;
    private final wlc<wud<vri>> f;

    private vqk(wlc<String> wlc, wlc<vqp> wlc2, wlc<vrh> wlc3, wlc<wud<wan>> wlc4, wlc<vpt> wlc5, wlc<wud<vri>> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static vqk a(wlc<String> wlc, wlc<vqp> wlc2, wlc<vrh> wlc3, wlc<wud<wan>> wlc4, wlc<vpt> wlc5, wlc<wud<vri>> wlc6) {
        vqk vqk = new vqk(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return vqk;
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((String) this.a.get(), (vqp) this.b.get(), (vrh) this.c.get(), (wud) this.d.get(), (vpt) this.e.get(), (wud) this.f.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
