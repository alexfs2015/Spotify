package defpackage;

import io.reactivex.FlowableTransformer;

/* renamed from: lyf reason: default package */
public final class lyf implements vua<lye> {
    private final wlc<lzd> a;
    private final wlc<vit<gzz>> b;
    private final wlc<lyr> c;
    private final wlc<FlowableTransformer<wsj<wmg>, gzz>> d;
    private final wlc<Boolean> e;

    private lyf(wlc<lzd> wlc, wlc<vit<gzz>> wlc2, wlc<lyr> wlc3, wlc<FlowableTransformer<wsj<wmg>, gzz>> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lyf a(wlc<lzd> wlc, wlc<vit<gzz>> wlc2, wlc<lyr> wlc3, wlc<FlowableTransformer<wsj<wmg>, gzz>> wlc4, wlc<Boolean> wlc5) {
        lyf lyf = new lyf(wlc, wlc2, wlc3, wlc4, wlc5);
        return lyf;
    }

    public final /* synthetic */ Object get() {
        lye lye = new lye((lzd) this.a.get(), (vit) this.b.get(), (lyr) this.c.get(), (FlowableTransformer) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return lye;
    }
}
