package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: set reason: default package */
public final class set implements sez {
    private final sdo a;
    private final sdd b;
    private final Scheduler c;
    private final sdg d;

    public final /* synthetic */ Object apply(Object obj) {
        sgh sgh = (sgh) obj;
        return Flowable.b((wrf<? extends T1>) this.d.a(sgh).c().e(32, TimeUnit.SECONDS, this.c).d((Function<? super Throwable, ? extends T>) new $$Lambda$set$Hxakcar5u19c77cNhwwLFeoMo<Object,Object>(sgh)), (wrf<? extends T2>) this.a.a(sgh).c().e(3, TimeUnit.SECONDS, this.c).d((Function<? super Throwable, ? extends T>) new $$Lambda$set$QMRl2lvZFFCYJ3fknKTk1PyuJtE<Object,Object>(sgh)), (BiFunction<? super T1, ? super T2, ? extends R>) this.b);
    }

    public set(sdo sdo, sdd sdd, Scheduler scheduler, sdg sdg) {
        this.a = (sdo) fay.a(sdo);
        this.b = (sdd) fay.a(sdd);
        this.c = (Scheduler) fay.a(scheduler);
        this.d = sdg;
    }
}
