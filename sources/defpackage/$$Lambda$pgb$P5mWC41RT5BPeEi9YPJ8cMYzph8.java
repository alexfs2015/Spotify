package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pgb$P5mWC41RT5BPeEi9YPJ8cMYzph8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pgb$P5mWC41RT5BPeEi9YPJ8cMYzph8 implements ObservableTransformer {
    private final /* synthetic */ Single f$0;
    private final /* synthetic */ ObjectMapper f$1;

    public /* synthetic */ $$Lambda$pgb$P5mWC41RT5BPeEi9YPJ8cMYzph8(Single single, ObjectMapper objectMapper) {
        this.f$0 = single;
        this.f$1 = objectMapper;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$pgb$5plvxoeiIQna506KOCuypoqGAQ<Object,Object>(this.f$0, this.f$1), false);
    }
}
