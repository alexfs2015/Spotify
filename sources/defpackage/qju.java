package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: qju reason: default package */
public interface qju {

    /* renamed from: qju$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<sph> a(String str, hgz hgz) {
            return Observable.a((ObservableSource<? extends T1>) wit.b(hgz.a("country_code")), (ObservableSource<? extends T2>) wit.b(hgz.a(MoatAdEvent.EVENT_TYPE)), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$qju$qhFHHfX5eAN0vaLSl6k1aITJc70<Object,Object,Object>(str));
        }

        public static /* synthetic */ sph a(String str, String str2, String str3) {
            return new sni(str, str2, str3);
        }
    }
}
