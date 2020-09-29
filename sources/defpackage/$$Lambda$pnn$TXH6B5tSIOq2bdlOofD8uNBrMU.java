package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pnn$TXH6B-5tSIOq2bdlOofD8uNBrMU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pnn$TXH6B5tSIOq2bdlOofD8uNBrMU implements ObservableTransformer {
    private final /* synthetic */ Single f$0;
    private final /* synthetic */ ObjectMapper f$1;

    public /* synthetic */ $$Lambda$pnn$TXH6B5tSIOq2bdlOofD8uNBrMU(Single single, ObjectMapper objectMapper) {
        this.f$0 = single;
        this.f$1 = objectMapper;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$pnn$LomreaExTmqGRIe_3dEj7wGaZE<Object,Object>(this.f$0, this.f$1), false);
    }
}
