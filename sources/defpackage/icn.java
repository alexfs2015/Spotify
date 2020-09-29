package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;

/* renamed from: icn reason: default package */
public interface icn {

    /* renamed from: icn$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Iterable a(ibj ibj) {
            ArrayList arrayList = new ArrayList(0);
            arrayList.add(new g(ibj.a()));
            return arrayList;
        }

        public static Observable<ibm> a(hww hww) {
            return hww.a.b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$icn$CkfX4pjQJSrPpcSrXDXbLeDlaY.INSTANCE);
        }
    }
}
