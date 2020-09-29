package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$ZSWmSJoiY1GwL2-X-EjwJCsJ-bk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$ZSWmSJoiY1GwL2XEjwJCsJbk implements ObservableTransformer {
    private final /* synthetic */ vmu f$0;

    public /* synthetic */ $$Lambda$vlg$ZSWmSJoiY1GwL2XEjwJCsJbk(vmu vmu) {
        this.f$0 = vmu;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$j6pU0QBIm4_T5q_V7IibjO939l4.INSTANCE).a(this.f$0.a()).c((Function<? super T, ? extends R>) $$Lambda$t3wSy8BDTHyFBYI7sHy53gZuoNc.INSTANCE);
    }
}
