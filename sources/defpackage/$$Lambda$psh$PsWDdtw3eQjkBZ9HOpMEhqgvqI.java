package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$psh$PsWDdtw3e-QjkBZ9HOpMEhqgvqI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$PsWDdtw3eQjkBZ9HOpMEhqgvqI implements ObservableTransformer {
    private final /* synthetic */ hgz f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$psh$PsWDdtw3eQjkBZ9HOpMEhqgvqI(hgz hgz, Scheduler scheduler) {
        this.f$0 = hgz;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$psh$uGR9BjvdfvRNrvNq4ROPJDLtGc(this.f$0, this.f$1));
    }
}
