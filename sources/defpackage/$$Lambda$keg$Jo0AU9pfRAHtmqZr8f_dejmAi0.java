package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$keg$Jo0AU9pfRAH-tmqZr8f_dejmAi0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$keg$Jo0AU9pfRAHtmqZr8f_dejmAi0 implements ObservableTransformer {
    private final /* synthetic */ ker f$0;

    public /* synthetic */ $$Lambda$keg$Jo0AU9pfRAHtmqZr8f_dejmAi0(ker ker) {
        this.f$0 = ker;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$yTefxslj_g5KuXenLfu7fwwfmJw.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$keg$aHebmrWm58wYQ9uno_J4foDl_HU<Object,Object>(this.f$0));
    }
}
