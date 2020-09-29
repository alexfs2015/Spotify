package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rfb$9PWCK0YrwWvbqOwukP-J8O-Qoek reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rfb$9PWCK0YrwWvbqOwukPJ8OQoek implements ObservableTransformer {
    private final /* synthetic */ rha f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$rfb$9PWCK0YrwWvbqOwukPJ8OQoek(rha rha, Scheduler scheduler) {
        this.f$0 = rha;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$rfb$XkPhRWM68HDi8zwTkGVt2VqsUTo(this.f$0)).c((Function<? super T, ? extends R>) $$Lambda$P1Av2B4M4TIbEeMyOnUWkqq2MWg.INSTANCE).a(this.f$1);
    }
}
