package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: qau reason: default package */
public final class qau implements Function<Observable<? extends Throwable>, Observable<?>> {
    private final int a = 3;
    private final long b = 500;
    private final Scheduler c;

    public qau(Scheduler scheduler) {
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(ho hoVar) {
        return ((Integer) fbp.a(hoVar.b)).intValue() == 3 ? Observable.a((Throwable) hoVar.a) : Observable.a(((long) ((Integer) hoVar.b).intValue()) * 500, TimeUnit.MILLISECONDS, this.c);
    }

    public final /* synthetic */ Object apply(Object obj) {
        return ((Observable) obj).b((ObservableSource<? extends U>) Observable.a(1, 4), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$4kJN0FhkvPuD0KJJuzsZkDLEsDE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qau$R1GtYMfXnZysCHFchbX8PWJykBc<Object,Object>(this), false);
    }
}
