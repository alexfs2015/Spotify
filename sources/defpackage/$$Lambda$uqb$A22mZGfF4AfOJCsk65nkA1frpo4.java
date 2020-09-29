package defpackage;

import io.reactivex.CompletableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uqb$A22mZGfF4AfOJCsk65nkA1frpo4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uqb$A22mZGfF4AfOJCsk65nkA1frpo4 implements Function {
    private final /* synthetic */ unp f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ via f$2;
    private final /* synthetic */ upt f$3;

    public /* synthetic */ $$Lambda$uqb$A22mZGfF4AfOJCsk65nkA1frpo4(unp unp, Scheduler scheduler, via via, upt upt) {
        this.f$0 = unp;
        this.f$1 = scheduler;
        this.f$2 = via;
        this.f$3 = upt;
    }

    public final Object apply(Object obj) {
        return this.f$0.b().a(this.f$1).a((CompletableTransformer) new $$Lambda$uqb$QP0IQWrT7SLvl5hXtVnnfT4qDCA(this.f$2, this.f$3)).a((ObservableSource<T>) Observable.c());
    }
}
