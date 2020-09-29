package defpackage;

import io.reactivex.FlowableTransformer;

/* renamed from: mcg reason: default package */
public final class mcg implements wig<mcf> {
    private final wzi<mde> a;
    private final wzi<vvy<hcs>> b;
    private final wzi<mcs> c;
    private final wzi<FlowableTransformer<xgo<xam>, hcs>> d;
    private final wzi<Boolean> e;

    private mcg(wzi<mde> wzi, wzi<vvy<hcs>> wzi2, wzi<mcs> wzi3, wzi<FlowableTransformer<xgo<xam>, hcs>> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mcg a(wzi<mde> wzi, wzi<vvy<hcs>> wzi2, wzi<mcs> wzi3, wzi<FlowableTransformer<xgo<xam>, hcs>> wzi4, wzi<Boolean> wzi5) {
        mcg mcg = new mcg(wzi, wzi2, wzi3, wzi4, wzi5);
        return mcg;
    }

    public final /* synthetic */ Object get() {
        mcf mcf = new mcf((mde) this.a.get(), (vvy) this.b.get(), (mcs) this.c.get(), (FlowableTransformer) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return mcf;
    }
}
