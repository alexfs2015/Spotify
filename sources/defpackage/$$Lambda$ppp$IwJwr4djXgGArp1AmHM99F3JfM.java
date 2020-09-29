package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ppp$IwJ-wr4djXgGArp1AmHM99F3JfM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ppp$IwJwr4djXgGArp1AmHM99F3JfM implements ObservableTransformer {
    private final /* synthetic */ hec f$0;
    private final /* synthetic */ prr f$1;
    private final /* synthetic */ psi f$2;
    private final /* synthetic */ psg f$3;

    public /* synthetic */ $$Lambda$ppp$IwJwr4djXgGArp1AmHM99F3JfM(hec hec, prr prr, psi psi, psg psg) {
        this.f$0 = hec;
        this.f$1 = prr;
        this.f$2 = psi;
        this.f$3 = psg;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ppp$Jm2FgD4YBvsxOA348JvGJdOMXuo<Object,Object>(this.f$0, this.f$1, this.f$2, this.f$3), false);
    }
}
