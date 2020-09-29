package com.spotify.cosmos.android.cosmonaut.atoms;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: com.spotify.cosmos.android.cosmonaut.atoms.-$$Lambda$ResponseTransformers$fDnQqWdgzZjFZUSY3Op1gaQ_UL8 reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ResponseTransformers$fDnQqWdgzZjFZUSY3Op1gaQ_UL8 implements ResponseTransformer {
    public static final /* synthetic */ $$Lambda$ResponseTransformers$fDnQqWdgzZjFZUSY3Op1gaQ_UL8 INSTANCE = new $$Lambda$ResponseTransformers$fDnQqWdgzZjFZUSY3Op1gaQ_UL8();

    private /* synthetic */ $$Lambda$ResponseTransformers$fDnQqWdgzZjFZUSY3Op1gaQ_UL8() {
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$ResponseTransformers$RWlpKdpSTuPQAChwFurKx9FXpTc.INSTANCE);
    }
}
