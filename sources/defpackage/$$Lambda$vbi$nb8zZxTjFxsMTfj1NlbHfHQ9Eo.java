package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vbi$nb8zZxTjFxsMT-fj1NlbHfHQ9Eo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vbi$nb8zZxTjFxsMTfj1NlbHfHQ9Eo implements ObservableTransformer {
    private final /* synthetic */ vbu f$0;

    public /* synthetic */ $$Lambda$vbi$nb8zZxTjFxsMTfj1NlbHfHQ9Eo(vbu vbu) {
        this.f$0 = vbu;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vbi$rPFeTgpEYqaj4uWeBCDqfSJPcLg<Object,Object>(this.f$0), false);
    }
}
