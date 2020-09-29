package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;

/* renamed from: icp reason: default package */
public interface icp {

    /* renamed from: icp$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<ibm> a(rkc rkc) {
            return Observable.a((ObservableSource<? extends T1>) rkc.b(), (ObservableSource<? extends T2>) rkc.a(), (ObservableSource<? extends T3>) rkc.c(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$icp$wX0iik0y2sYUeD0SuzqS__4HgQ.INSTANCE).b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$icp$aCaA5p_kxqho5Sq1Cru4IQFRLmw.INSTANCE);
        }

        public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
            return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue() || bool3.booleanValue());
        }

        public static /* synthetic */ Iterable a(Boolean bool) {
            ArrayList arrayList = new ArrayList(0);
            arrayList.add(new f(bool.booleanValue()));
            return arrayList;
        }
    }
}
