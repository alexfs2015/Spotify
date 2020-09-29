package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;

/* renamed from: lyx reason: default package */
public final class lyx {
    private final lyr a;
    private final FlowableTransformer<wsj<wmg>, gzz> b;
    private final boolean c;

    lyx(lyr lyr, FlowableTransformer<wsj<wmg>, gzz> flowableTransformer, boolean z) {
        this.a = lyr;
        this.b = flowableTransformer;
        this.c = z;
    }

    public final Flowable<lyh<gzz>> a(lyd lyd) {
        Logger.a("Trying to resolve online browse request: %s", lyd.toString());
        if (this.c) {
            return this.a.b(lyd.a, lyd.b, lyd.c, lyd.d, lyd.e, lyd.f, lyd.g).c().a(this.b).c((Function<? super T, ? extends R>) $$Lambda$SXXcqwPm5lb0EM2NDBLrHlfXWM.INSTANCE);
        }
        return this.a.a(lyd.a, lyd.b, lyd.c, lyd.d, lyd.e, lyd.f, lyd.g).c().c((Function<? super T, ? extends R>) new $$Lambda$lyx$SGiIVzeyKb44xvTYzCKlN2OV_MA<Object,Object>(lyd));
    }
}
