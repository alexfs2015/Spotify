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

/* renamed from: seh reason: default package */
public final class seh {
    private final rzf a;
    private final ryy b;
    private final rzh c;
    private final Flowable<kxx> d;
    private final Scheduler e;

    public seh(rzf rzf, ryy ryy, rzh rzh, Scheduler scheduler, Observable<kxx> observable) {
        this.a = rzf;
        this.b = ryy;
        this.c = rzh;
        this.e = scheduler;
        this.d = observable.a(BackpressureStrategy.LATEST);
    }

    public final Flowable<gzz> a() {
        return Flowable.a((wrf<? extends T1>) this.a.e(), (wrf<? extends T2>) this.d, (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$seh$W2eqyc2QNWwGBxVlUgHkRDzWuLY<Object,Object,Object>(this)).c(100, TimeUnit.MILLISECONDS, this.e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(List list, kxx kxx) {
        Optional a2 = this.b.a(list);
        if (a2.b()) {
            Logger.a("Search history is loaded with %d items", Integer.valueOf(list.size()));
            return (gzz) a2.c();
        }
        Logger.a("Search history is empty", new Object[0]);
        return this.c.a(kxx.a());
    }
}
