package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$rhp$UwdElxgJ7RDIXW6ZdkF86Cm6T-U reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$UwdElxgJ7RDIXW6ZdkF86Cm6TU implements ObservableTransformer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ rgf f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ $$Lambda$rhp$UwdElxgJ7RDIXW6ZdkF86Cm6TU(String str, rgf rgf, a aVar) {
        this.f$0 = str;
        this.f$1 = rgf;
        this.f$2 = aVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$rhp$c_ALI4gWUmId0UfT6YIjH5scEh8(this.f$0, this.f$1, this.f$2));
    }
}
