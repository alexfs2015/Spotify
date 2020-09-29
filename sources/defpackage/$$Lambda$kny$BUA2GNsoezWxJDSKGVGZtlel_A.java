package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$kny$BUA2GNsoezWxJDSKGVG-Ztlel_A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$BUA2GNsoezWxJDSKGVGZtlel_A implements ObservableTransformer {
    private final /* synthetic */ vos f$0;
    private final /* synthetic */ Flowable f$1;
    private final /* synthetic */ ObjectMapper f$2;

    public /* synthetic */ $$Lambda$kny$BUA2GNsoezWxJDSKGVGZtlel_A(vos vos, Flowable flowable, ObjectMapper objectMapper) {
        this.f$0 = vos;
        this.f$1 = flowable;
        this.f$2 = objectMapper;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$kny$TcdeYjlpvq9udIEOZQGh3UM5I0k(this.f$0, this.f$1, this.f$2));
    }
}
