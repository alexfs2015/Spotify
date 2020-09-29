package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ryw reason: default package */
public final class ryw {
    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(ho hoVar, ho hoVar2) {
        String str = (String) hoVar.a;
        String str2 = (String) hoVar.b;
        if (str == null) {
            str = (String) hoVar2.a;
        }
        if (str2 == null) {
            str2 = (String) hoVar2.b;
        }
        return new ho(str, str2);
    }

    private static Observable<ho<String, String>> a() {
        return Observable.b(ho.a(null, null));
    }

    public static Observable<ho<String, String>> a(Fragment fragment) {
        return Observable.a((ObservableSource<? extends T1>) new $$Lambda$ryw$ySia2dH8pIb7V0AjkeNs2sKTbP8<Object>(fragment), (ObservableSource<? extends T2>) fragment instanceof jqx ? ((jqx) fragment).af().a.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ryw$Gj3zM0GzBluB0TzbKcvErBdpLq8.INSTANCE, false).f((ObservableSource<? extends T>) a()) : a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ryw$IMvsAqDUJHUUeui9u56qqtQMjIc.INSTANCE).a((Predicate<? super T>) $$Lambda$ryw$loHmJlNONM5SET3ILOKPSgxDagY.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(rmb rmb) {
        if (!(rmb instanceof rmc)) {
            return rmb instanceof a ? Observable.b(new ho(null, ((a) rmb).a())) : a();
        }
        rmc rmc = (rmc) rmb;
        return Observable.b(new ho(rmc.a(), rmc.b()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Fragment fragment, Observer observer) {
        String str = null;
        Object a = fragment instanceof uqq ? ((uqq) fragment).aj().a() : null;
        if (fragment instanceof a) {
            str = ((a) fragment).ae_().toString();
        }
        observer.onNext(new ho(a, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ho hoVar) {
        return (hoVar.a == null || hoVar.b == null) ? false : true;
    }
}
