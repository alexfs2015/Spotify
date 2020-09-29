package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import java.util.List;

/* renamed from: mcq reason: default package */
public final class mcq implements FlowableTransformer<hcs, hcs> {
    /* access modifiers changed from: private */
    public static /* synthetic */ hcm a(hcm hcm) {
        if (!"find:categoryCard".equals(hcm.componentId().id())) {
            return hcm;
        }
        return hcm.toBuilder().a("find:card", hcm.componentId().category()).a();
    }

    /* access modifiers changed from: private */
    public static hcs a(hcs hcs) {
        return hcs.toBuilder().a((List<? extends hcm>) ImmutableList.a(fcp.a((Iterable<E>) hcs.body()).a((Function<? super E, T>) $$Lambda$mcq$ROaoVt4EOqRa_GDQSP5OOvqg2jg.INSTANCE).a())).a();
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return flowable.c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$mcq$M3mWMhsehz8cwGZCKjxKl9V4m1o.INSTANCE);
    }
}
