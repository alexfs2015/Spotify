package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: soo reason: default package */
public final class soo {
    private final sit a;
    private final sim b;
    private final siv c;
    private final Flowable<lbg> d;
    private final Scheduler e;

    public soo(sit sit, sim sim, siv siv, Scheduler scheduler, Observable<lbg> observable) {
        this.a = sit;
        this.b = sim;
        this.c = siv;
        this.e = scheduler;
        this.d = observable.a(BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(List list, lbg lbg) {
        Optional a2 = this.b.a(list);
        if (a2.b()) {
            Logger.a("Search history is loaded with %d items", Integer.valueOf(list.size()));
            return (hcs) a2.c();
        }
        Logger.a("Search history is empty", new Object[0]);
        return this.c.a(lbg.a());
    }

    public final Flowable<hcs> a() {
        return Flowable.a((xfk<? extends T1>) this.a.e(), (xfk<? extends T2>) this.d, (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$soo$h8Yc7twQ5ZcsUEzRH_8NB6Mviho<Object,Object,Object>(this)).c(100, TimeUnit.MILLISECONDS, this.e);
    }
}
