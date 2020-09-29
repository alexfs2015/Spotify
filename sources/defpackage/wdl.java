package defpackage;

/* renamed from: wdl reason: default package */
public final class wdl implements wig<xii<?>> {
    private final wzi<String> a;
    private final wzi<wdx> b;
    private final wzi<wep> c;
    private final wzi<xii<wot>> d;
    private final wzi<wcu> e;
    private final wzi<xii<weq>> f;

    private wdl(wzi<String> wzi, wzi<wdx> wzi2, wzi<wep> wzi3, wzi<xii<wot>> wzi4, wzi<wcu> wzi5, wzi<xii<weq>> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static wdl a(wzi<String> wzi, wzi<wdx> wzi2, wzi<wep> wzi3, wzi<xii<wot>> wzi4, wzi<wcu> wzi5, wzi<xii<weq>> wzi6) {
        wdl wdl = new wdl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return wdl;
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((String) this.a.get(), (wdx) this.b.get(), (wep) this.c.get(), (xii) this.d.get(), (wcu) this.e.get(), (xii) this.f.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
