package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: mzg reason: default package */
public final class mzg implements ObservableTransformer<hcs, hcs> {
    private final isn a;
    private final Scheduler b;
    private final String c;

    public mzg(isn isn, Scheduler scheduler, String str) {
        this.a = isn;
        this.b = scheduler;
        this.c = str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm a(ImmutableList immutableList, hcm hcm) {
        if (!HubsComponentCategory.ROW.mId.equals(hcm.componentId().category()) || !immutableList.contains(hcm.metadata().string("uri", ""))) {
            return null;
        }
        return hcm.toBuilder().f(gyr.a(true)).a();
    }

    /* access modifiers changed from: private */
    public static hcs a(hcs hcs, ImmutableList<String> immutableList) {
        return new hdn(new $$Lambda$mzg$ge2EZ28Lcwyt9A7ymfshKZIpo74(immutableList)).a(hcs);
    }

    public final ObservableSource<hcs> apply(Observable<hcs> observable) {
        return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) this.a.c(this.c).a(this.b).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$mzg$oBMgPCR2mmTKrwNTKijqSHkTBWI.INSTANCE);
    }
}
