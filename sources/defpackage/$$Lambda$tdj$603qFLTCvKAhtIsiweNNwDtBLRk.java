package defpackage;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: -$$Lambda$tdj$603qFLTCvKAhtIsiweNNwDtBLRk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tdj$603qFLTCvKAhtIsiweNNwDtBLRk implements FlowableTransformer {
    private final /* synthetic */ Flowable f$0;

    public /* synthetic */ $$Lambda$tdj$603qFLTCvKAhtIsiweNNwDtBLRk(Flowable flowable) {
        this.f$0 = flowable;
    }

    public final xfk apply(Flowable flowable) {
        return Flowable.a((xfk<? extends T1>) flowable, (xfk<? extends T2>) this.f$0, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$tdj$PtsHoipGTiSKlfgqW1GDA0P2Js.INSTANCE).a(Functions.a());
    }
}
