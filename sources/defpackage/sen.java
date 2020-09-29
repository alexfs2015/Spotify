package defpackage;

import io.reactivex.FlowableTransformer;

/* renamed from: sen reason: default package */
public final class sen implements vua<sem> {
    private final wlc<seh> a;
    private final wlc<FlowableTransformer<gzz, gzz>> b;

    private sen(wlc<seh> wlc, wlc<FlowableTransformer<gzz, gzz>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sen a(wlc<seh> wlc, wlc<FlowableTransformer<gzz, gzz>> wlc2) {
        return new sen(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sem((seh) this.a.get(), (FlowableTransformer) this.b.get());
    }
}
