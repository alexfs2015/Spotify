package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;

/* renamed from: ifc reason: default package */
public interface ifc {

    /* renamed from: ifc$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<idy> a(rti rti) {
            return Observable.a((ObservableSource<? extends T1>) rti.b(), (ObservableSource<? extends T2>) rti.a(), (ObservableSource<? extends T3>) rti.c(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$ifc$oI0LWtTORCsNVkWHAaiPdoqrupc.INSTANCE).b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$ifc$5KoESPTnOdu1f5mnp1xaKghbApU.INSTANCE);
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
