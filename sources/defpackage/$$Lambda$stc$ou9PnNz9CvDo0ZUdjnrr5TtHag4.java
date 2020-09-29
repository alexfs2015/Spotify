package defpackage;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: -$$Lambda$stc$ou9PnNz9CvDo0ZUdjnrr5TtHag4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$stc$ou9PnNz9CvDo0ZUdjnrr5TtHag4 implements FlowableTransformer {
    private final /* synthetic */ Flowable f$0;

    public /* synthetic */ $$Lambda$stc$ou9PnNz9CvDo0ZUdjnrr5TtHag4(Flowable flowable) {
        this.f$0 = flowable;
    }

    public final wrf apply(Flowable flowable) {
        return Flowable.a((wrf<? extends T1>) flowable, (wrf<? extends T2>) this.f$0, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$stc$aRoOpubAZJZ_u6Yv5zF2YpXBuA.INSTANCE).a(Functions.a());
    }
}
