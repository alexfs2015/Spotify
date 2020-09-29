package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* renamed from: vin reason: default package */
public final class vin implements Function<Flowable<Throwable>, wrf<Object>> {
    private final int a;
    private final long b;

    public final /* synthetic */ Object apply(Object obj) {
        Flowable flowable = (Flowable) obj;
        Flowable a2 = Flowable.a(1, this.a + 1);
        $$Lambda$tJNt1JtOujgek_HyzHIYtfQnhRI r1 = $$Lambda$tJNt1JtOujgek_HyzHIYtfQnhRI.INSTANCE;
        ObjectHelper.a(a2, "other is null");
        return Flowable.b((wrf<? extends T1>) flowable, (wrf<? extends T2>) a2, (BiFunction<? super T1, ? super T2, ? extends R>) r1).b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$vin$0NxfZYAX7768dqydpjkmVZRgMx0<Object,Object>(this));
    }

    vin(int i, long j) {
        this.a = i;
        this.b = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(ho hoVar) {
        Throwable th = (Throwable) fay.a(hoVar.a);
        long intValue = (long) ((Integer) fay.a(hoVar.b)).intValue();
        Logger.b("Failed %d attempt with error: %s, retrying...", Long.valueOf(intValue), th.getMessage());
        if (intValue == ((long) this.a)) {
            return Flowable.a(th);
        }
        return Flowable.b(this.b * intValue, TimeUnit.MILLISECONDS);
    }
}
