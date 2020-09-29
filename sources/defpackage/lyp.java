package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import java.util.List;

/* renamed from: lyp reason: default package */
public final class lyp implements FlowableTransformer<gzz, gzz> {
    /* access modifiers changed from: private */
    public static gzz a(gzz gzz) {
        return gzz.toBuilder().a((List<? extends gzt>) ImmutableList.a(fbx.a((Iterable<E>) gzz.body()).a((Function<? super E, T>) $$Lambda$lyp$7QvlBKpFY1w4N1DLlynu_wbP3jM.INSTANCE).a())).a();
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return flowable.c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$lyp$qRoLmEDOAWtTV_lbFtJohDpTqQg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(gzt gzt) {
        if (!"find:categoryCard".equals(gzt.componentId().id())) {
            return gzt;
        }
        return gzt.toBuilder().a("find:card", gzt.componentId().category()).a();
    }
}
