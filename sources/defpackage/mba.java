package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: mba reason: default package */
interface mba {

    /* renamed from: mba$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<mcn> a(hgz hgz) {
            return Observable.a((ObservableSource<? extends T1>) hgz.b(MoatAdEvent.EVENT_TYPE), (ObservableSource<? extends T2>) hgz.b("shows-collection"), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$mba$9QIBWhR4GUC51emePWr_C1HUyj0.INSTANCE).a(Functions.a());
        }

        public static /* synthetic */ mcn a(String str, String str2) {
            return new mcb(str, gvc.a(str2).booleanValue());
        }
    }
}
