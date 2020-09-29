package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: mcf reason: default package */
public final class mcf {
    private final mcy a;
    private final mde b;
    private final vvy<hcs> c;

    private mcf(mcy mcy, mde mde, vvy<hcs> vvy) {
        this.a = (mcy) fbp.a(mcy);
        this.b = (mde) fbp.a(mde);
        this.c = (vvy) fbp.a(vvy);
    }

    mcf(mde mde, vvy<hcs> vvy, mcs mcs, FlowableTransformer<xgo<xam>, hcs> flowableTransformer, boolean z) {
        this(new mcy(mcs, flowableTransformer, z), mde, vvy);
    }

    public final Flowable<hcs> a(mce mce) {
        return this.a.a(mce).d((Function<? super Throwable, ? extends T>) $$Lambda$mcf$q5bvY_S7lmZqHkLgnGcSSANHEJo.INSTANCE).c((Function<? super T, ? extends R>) this.b).j().a((ObservableTransformer<? super T, ? extends R>) this.c).a(BackpressureStrategy.LATEST);
    }
}
