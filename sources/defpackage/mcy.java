package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;

/* renamed from: mcy reason: default package */
public final class mcy {
    private final mcs a;
    private final FlowableTransformer<xgo<xam>, hcs> b;
    private final boolean c;

    mcy(mcs mcs, FlowableTransformer<xgo<xam>, hcs> flowableTransformer, boolean z) {
        this.a = mcs;
        this.b = flowableTransformer;
        this.c = z;
    }

    public final Flowable<mci<hcs>> a(mce mce) {
        Logger.a("Trying to resolve online browse request: %s", mce.toString());
        return this.c ? this.a.b(mce.a, mce.b, mce.c, mce.d, mce.e, mce.f, mce.g).c().a(this.b).c((Function<? super T, ? extends R>) $$Lambda$l5X2d1e9ApwGWcYVrizlXN6oBE.INSTANCE) : this.a.a(mce.a, mce.b, mce.c, mce.d, mce.e, mce.f, mce.g).c().c((Function<? super T, ? extends R>) new $$Lambda$mcy$jJiksKbjfmxRxcgQo7ohYbNxHqo<Object,Object>(mce));
    }
}
