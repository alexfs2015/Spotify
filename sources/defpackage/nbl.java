package defpackage;

/* renamed from: nbl reason: default package */
public final class nbl implements wig<nbk> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;

    private nbl(wzi<gwp> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nbl a(wzi<gwp> wzi, wzi<gwr> wzi2) {
        return new nbl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nbk((gwp) this.a.get(), (gwr) this.b.get());
    }
}
