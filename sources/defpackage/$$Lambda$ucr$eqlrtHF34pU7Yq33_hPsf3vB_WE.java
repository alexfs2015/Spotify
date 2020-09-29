package defpackage;

import android.content.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$eqlrtHF34pU7Yq33_hPsf3vB_WE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$eqlrtHF34pU7Yq33_hPsf3vB_WE implements ObservableTransformer {
    private final /* synthetic */ kyj f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$ucr$eqlrtHF34pU7Yq33_hPsf3vB_WE(kyj kyj, Context context) {
        this.f$0 = kyj;
        this.f$1 = context;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ucr$kFMPacIn8ze5E5llEqQadQGyNkU<Object,Object>(this.f$0, this.f$1), false);
    }
}
