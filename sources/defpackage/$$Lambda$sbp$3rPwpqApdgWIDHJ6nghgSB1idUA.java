package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$sbp$3rPwpqApdgWIDHJ6nghgSB1idUA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$sbp$3rPwpqApdgWIDHJ6nghgSB1idUA implements ObservableTransformer {
    private final /* synthetic */ sbh f$0;

    public /* synthetic */ $$Lambda$sbp$3rPwpqApdgWIDHJ6nghgSB1idUA(sbh sbh) {
        this.f$0 = sbh;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$sbp$hNxHB50i3yVprQ82HuziBOUt8I<Object,Object>(this.f$0), false);
    }
}
