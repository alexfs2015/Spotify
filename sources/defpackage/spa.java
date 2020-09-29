package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: spa reason: default package */
public final class spa implements spg {
    private final snv a;
    private final snk b;
    private final Scheduler c;
    private final snn d;

    public spa(snv snv, snk snk, Scheduler scheduler, snn snn) {
        this.a = (snv) fbp.a(snv);
        this.b = (snk) fbp.a(snk);
        this.c = (Scheduler) fbp.a(scheduler);
        this.d = snn;
    }

    public final /* synthetic */ Object apply(Object obj) {
        sqo sqo = (sqo) obj;
        return Flowable.b((xfk<? extends T1>) this.d.a(sqo).c().e(32, TimeUnit.SECONDS, this.c).d((Function<? super Throwable, ? extends T>) new $$Lambda$spa$S7WqoaRuZ19bkbvNeGVeOlS6pfI<Object,Object>(sqo)), (xfk<? extends T2>) this.a.a(sqo).c().e(3, TimeUnit.SECONDS, this.c).d((Function<? super Throwable, ? extends T>) new $$Lambda$spa$di_tX13ZeQV78UECuTIuIp3L2eU<Object,Object>(sqo)), (BiFunction<? super T1, ? super T2, ? extends R>) this.b);
    }
}
