package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: qaw reason: default package */
public interface qaw {

    /* renamed from: qaw$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<sfa> a(String str, hed hed) {
            return Observable.a((ObservableSource<? extends T1>) vun.b(hed.a("country_code")), (ObservableSource<? extends T2>) vun.b(hed.a(MoatAdEvent.EVENT_TYPE)), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$qaw$PlTMX3mfWOm3loj78RXyrztpQao<Object,Object,Object>(str));
        }

        public static /* synthetic */ sfa a(String str, String str2, String str3) {
            return new sdb(str, str2, str3);
        }
    }
}
