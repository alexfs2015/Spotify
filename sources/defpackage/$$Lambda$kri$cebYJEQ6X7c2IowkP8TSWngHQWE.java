package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kri$cebYJEQ6X7c2IowkP8TSWngHQWE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kri$cebYJEQ6X7c2IowkP8TSWngHQWE implements Function {
    private final /* synthetic */ Flowable f$0;
    private final /* synthetic */ jtz f$1;
    private final /* synthetic */ iiw f$2;
    private final /* synthetic */ gfk f$3;

    public /* synthetic */ $$Lambda$kri$cebYJEQ6X7c2IowkP8TSWngHQWE(Flowable flowable, jtz jtz, iiw iiw, gfk gfk) {
        this.f$0 = flowable;
        this.f$1 = jtz;
        this.f$2 = iiw;
        this.f$3 = gfk;
    }

    public final Object apply(Object obj) {
        return this.f$0.j().c(1).b((Consumer<? super T>) new $$Lambda$kri$qJkmB9p604Ka4xJlt7QV3FcVkaU<Object>((f) obj, this.f$1, this.f$2, this.f$3)).g().a((ObservableSource<T>) Observable.c());
    }
}
