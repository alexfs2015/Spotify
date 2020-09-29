package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;

/* renamed from: mef reason: default package */
public interface mef {

    /* renamed from: mef$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<Boolean> a(hgy hgy, hgz hgz, ssh ssh, kyk kyk) {
            Observable j = hgy.a().j();
            kyk.getClass();
            return Observable.a((ObservableSource<? extends T1>) j.c((Function<? super T, ? extends R>) new $$Lambda$svJUekI2r8l8V9RsDdUD0YvpdkM<Object,Object>(kyk)), (ObservableSource<? extends T2>) ssh.a(), (ObservableSource<? extends T3>) wit.b(hgz.a("on-demand-trial").e((xiy<? super T, ? extends R>) $$Lambda$mef$nMZmuR7tQ7fnU1kE3fbJlyzFyaQ.INSTANCE)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$mef$ZTfQdG6kWc_2YLq4otTnkeVuPVo.INSTANCE).a(Functions.a());
        }

        public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
            return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue());
        }
    }
}
