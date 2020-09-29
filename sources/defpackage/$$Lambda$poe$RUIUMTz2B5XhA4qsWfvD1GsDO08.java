package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$poe$RUIUMTz2B5XhA4qsWfvD1GsDO08 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$poe$RUIUMTz2B5XhA4qsWfvD1GsDO08 implements ObservableTransformer {
    private final /* synthetic */ hec f$0;
    private final /* synthetic */ Consumer f$1;

    public /* synthetic */ $$Lambda$poe$RUIUMTz2B5XhA4qsWfvD1GsDO08(hec hec, Consumer consumer) {
        this.f$0 = hec;
        this.f$1 = consumer;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((ObservableSource<? extends U>) this.f$0.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$iw3Lkjx11k0x3pcVsVf0BveXknU.INSTANCE).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$poe$U61oyNhib8omD202n8oOGKrgxjU<Object,Object>(this.f$1), false).e();
    }
}
