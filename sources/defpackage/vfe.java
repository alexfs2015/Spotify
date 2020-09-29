package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Predicate;

/* renamed from: vfe reason: default package */
public final class vfe<T> implements ObservableTransformer<vez<T>, vez<T>> {
    private final Observable<gcl> a;

    public vfe(Observable<gcl> observable) {
        this.a = observable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Observable observable, vfc vfc) {
        return observable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(Optional optional, a aVar) {
        if (!((Boolean) optional.a((Function<? super T, V>) $$Lambda$ZBj5Bq6AeUwBrxd2KZW7ozLLcPo.INSTANCE).a(Boolean.FALSE)).booleanValue()) {
            return kng.e();
        }
        return kng.a(kmt.a(new a()));
    }

    /* access modifiers changed from: private */
    public kng<Optional<vez<T>>, vfc> a(Optional<vez<T>> optional, vfd<T> vfd) {
        return (kng) vfd.a($$Lambda$vfe$uOSdFjTaq67eImAVOzKlcBcehNI.INSTANCE, $$Lambda$vfe$jZeF9efZ2aHBvcMC_kg3qmXZag4.INSTANCE, new $$Lambda$vfe$kw40AYV5B1CZoV2AFpcASAeOKI(optional));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vfd a(gcl gcl) {
        return new a();
    }

    public final ObservableSource<vez<T>> apply(Observable<vez<T>> observable) {
        return Observable.c().e(new b()).a(kok.a((c<M, E, F>) kok.a((kni<M, E, F>) new $$Lambda$vfe$oKBKC2eQjGAGBhWRy4D1z2bLFlU<M,E,F>(this), (ObservableTransformer<F, E>) new $$Lambda$vfe$3JAg_RBhMN9zrpfUgDqJK54aTvQ<F,E>(observable)).a(koj.a(this.a.c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$vfe$RiW3jsNyqBlDIDxpKGGhbYnUFvY.INSTANCE))).a((kny<koe>) $$Lambda$XfALRDoDkDjApRTyrLX7lBHsWU8.INSTANCE).b($$Lambda$XfALRDoDkDjApRTyrLX7lBHsWU8.INSTANCE), Optional.e())).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$2ZMHVRwAETYmJ4aGI_rZ6BLEMI.INSTANCE);
    }
}
