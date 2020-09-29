package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: sov reason: default package */
public final class sov implements spg {
    private final spu a;
    private final spi b;
    private final Scheduler c;

    sov(spu spu, spi spi, Scheduler scheduler) {
        this.a = (spu) fbp.a(spu);
        this.b = (spi) fbp.a(spi);
        this.c = (Scheduler) fbp.a(scheduler);
    }

    public final /* synthetic */ Object apply(Object obj) {
        sqo sqo = (sqo) obj;
        return this.a.a(sqo).c().e(10, TimeUnit.SECONDS, this.c).d((Function<? super Throwable, ? extends T>) new $$Lambda$sov$MwtmYDXppBhbvcGKGTWGivUu80<Object,Object>(sqo)).c((Function<? super T, ? extends R>) this.b);
    }
}
