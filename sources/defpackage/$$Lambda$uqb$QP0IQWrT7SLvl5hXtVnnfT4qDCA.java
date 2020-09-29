package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;

/* renamed from: -$$Lambda$uqb$QP0IQWrT7SLvl5hXtVnnfT4qDCA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uqb$QP0IQWrT7SLvl5hXtVnnfT4qDCA implements CompletableTransformer {
    private final /* synthetic */ via f$0;
    private final /* synthetic */ upt f$1;

    public /* synthetic */ $$Lambda$uqb$QP0IQWrT7SLvl5hXtVnnfT4qDCA(via via, upt upt) {
        this.f$0 = via;
        this.f$1 = upt;
    }

    public final CompletableSource apply(Completable completable) {
        return uqb.a(this.f$0, this.f$1, completable);
    }
}
