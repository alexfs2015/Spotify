package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* renamed from: vvs reason: default package */
public final class vvs implements Function<Flowable<Throwable>, xfk<Object>> {
    private final int a;
    private final long b;

    vvs(int i, long j) {
        this.a = i;
        this.b = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(ho hoVar) {
        Throwable th = (Throwable) fbp.a(hoVar.a);
        long intValue = (long) ((Integer) fbp.a(hoVar.b)).intValue();
        Logger.b("Failed %d attempt with error: %s, retrying...", Long.valueOf(intValue), th.getMessage());
        return intValue == ((long) this.a) ? Flowable.a(th) : Flowable.b(this.b * intValue, TimeUnit.MILLISECONDS);
    }

    public final /* synthetic */ Object apply(Object obj) {
        Flowable flowable = (Flowable) obj;
        Flowable a2 = Flowable.a(1, this.a + 1);
        $$Lambda$tJNt1JtOujgek_HyzHIYtfQnhRI r1 = $$Lambda$tJNt1JtOujgek_HyzHIYtfQnhRI.INSTANCE;
        ObjectHelper.a(a2, "other is null");
        return Flowable.b((xfk<? extends T1>) flowable, (xfk<? extends T2>) a2, (BiFunction<? super T1, ? super T2, ? extends R>) r1).b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$vvs$Uo4igHV6L10q6_w27Gsv370jJLQ<Object,Object>(this));
    }
}
