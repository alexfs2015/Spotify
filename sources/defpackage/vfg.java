package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;

/* renamed from: vfg reason: default package */
public final class vfg<T> implements ObservableTransformer<vez<T>, vez<T>> {
    private final Single<NetworkErrorReason> a;

    public vfg(Single<NetworkErrorReason> single) {
        this.a = single;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(c cVar) {
        NetworkErrorReason networkErrorReason = cVar.a;
        return networkErrorReason != NetworkErrorReason.UNKNOWN ? Single.b(vez.a(networkErrorReason)) : this.a.f($$Lambda$BnFNGIZBcxCXe1Fo2RnLCKRVaPE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(vez vez) {
        return (Single) vez.a($$Lambda$vfg$usheeINC_kBZo37U_rTKNwcMJ_E.INSTANCE, $$Lambda$vfg$3YhybaJxKggneecK86X3VaGYrkA.INSTANCE, $$Lambda$vfg$Z_h18zvIehoiRx7UTsmDfMbs8s.INSTANCE, new $$Lambda$vfg$oohF3KCjeANPPWsglwwQaTEKi8U(this), $$Lambda$vfg$cIsxjIzWYFBGSzsqeZIC_v49RJc.INSTANCE);
    }

    public final ObservableSource<vez<T>> apply(Observable<vez<T>> observable) {
        return observable.j(new $$Lambda$vfg$zrogYKT80zRBDZlFTVVeA99Fgg(this));
    }
}
