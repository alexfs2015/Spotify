package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;

/* renamed from: mac reason: default package */
public interface mac {

    /* renamed from: mac$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<Boolean> a(hec hec, hed hed, sia sia, kvb kvb) {
            Observable j = hec.a().j();
            kvb.getClass();
            return Observable.a((ObservableSource<? extends T1>) j.c((Function<? super T, ? extends R>) new $$Lambda$OOayX3ru77NlCKA6lpW6Doo15s<Object,Object>(kvb)), (ObservableSource<? extends T2>) sia.a(), (ObservableSource<? extends T3>) vun.b(hed.a("on-demand-trial").f($$Lambda$mac$03lz0zMVFaZK8t_QUvg2mEfr3dM.INSTANCE)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$mac$W7Ip3DEjsCyJ85902psGtlWdkw.INSTANCE).a(Functions.a());
        }

        public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
            return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue());
        }
    }
}
