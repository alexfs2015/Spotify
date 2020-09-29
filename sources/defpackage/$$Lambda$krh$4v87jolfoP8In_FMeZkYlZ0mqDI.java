package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$krh$4v87jolfoP8In_FMeZkYlZ0mqDI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$4v87jolfoP8In_FMeZkYlZ0mqDI implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;

    public /* synthetic */ $$Lambda$krh$4v87jolfoP8In_FMeZkYlZ0mqDI(Scheduler scheduler) {
        this.f$0 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$krh$kcqOzaAm4dyJbxlQ8gkH70z8kgM(this.f$0));
    }
}
