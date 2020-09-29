package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rhp$c_ALI4gWUmId0UfT6YIjH5scEh8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$c_ALI4gWUmId0UfT6YIjH5scEh8 implements Function {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ rgf f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ $$Lambda$rhp$c_ALI4gWUmId0UfT6YIjH5scEh8(String str, rgf rgf, a aVar) {
        this.f$0 = str;
        this.f$1 = rgf;
        this.f$2 = aVar;
    }

    public final Object apply(Object obj) {
        return Observable.b(((a) obj).a).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$rhp$aF9SfsQR2VXg9KmIwF06_yXgoBo<Object,Object>(this.f$1, this.f$0)).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$rhp$E6VwAptmdXjUIZjsWXHVrbWNyo<Object,Object>(this.f$2, this.f$0, ((a) obj).b)).a((ObservableTransformer<? super T, ? extends R>) $$Lambda$rhp$X7eJ6g9kBKIb0_kyPPilL2T5kJM.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$mLjiYURvRbWXYs1pewfykBrSRrc.INSTANCE);
    }
}
