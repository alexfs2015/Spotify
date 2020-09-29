package defpackage;

/* renamed from: wdo reason: default package */
public final class wdo implements wig<xii<weq>> {
    private final wzi<xii<wot>> a;
    private final wzi<wco> b;
    private final wzi<wcu> c;

    private wdo(wzi<xii<wot>> wzi, wzi<wco> wzi2, wzi<wcu> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static wdo a(wzi<xii<wot>> wzi, wzi<wco> wzi2, wzi<wcu> wzi3) {
        return new wdo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((xii) this.a.get(), (wco) this.b.get(), (wcu) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
