package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$cfjSy2mVvfLotav_fUuE9m2ef7s reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$cfjSy2mVvfLotav_fUuE9m2ef7s implements ObservableTransformer {
    private final /* synthetic */ kyj f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$ucr$cfjSy2mVvfLotav_fUuE9m2ef7s(kyj kyj, Context context) {
        this.f$0 = kyj;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ucr$mRfTEUol2vUyf0hEISHBkDPCgU<Object,Object>(this.f$0, this.f$1), false);
    }
}
