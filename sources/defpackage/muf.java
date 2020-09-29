package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: muf reason: default package */
public final class muf implements ObservableTransformer<gzz, gzz> {
    private final iqa a;
    private final Scheduler b;
    private final String c;

    public muf(iqa iqa, Scheduler scheduler, String str) {
        this.a = iqa;
        this.b = scheduler;
        this.c = str;
    }

    public final ObservableSource<gzz> apply(Observable<gzz> observable) {
        return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) this.a.c(this.c).a(this.b).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$muf$XoXNafYUMe_p3_oVuKqgrz6ntlA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static gzz a(gzz gzz, ImmutableList<String> immutableList) {
        return new hau(new $$Lambda$muf$23BE2Qe5VTN9r5AzzISqbhV3Whs(immutableList)).a(gzz);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(ImmutableList immutableList, gzt gzt) {
        if (!HubsComponentCategory.ROW.mId.equals(gzt.componentId().category()) || !immutableList.contains(gzt.metadata().string("uri", ""))) {
            return null;
        }
        return gzt.toBuilder().f(gwo.a(true)).a();
    }
}
