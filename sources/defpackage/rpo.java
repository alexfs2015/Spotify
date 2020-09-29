package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: rpo reason: default package */
public final class rpo {
    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ho hoVar) {
        return (hoVar.a == null || hoVar.b == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(rdd rdd) {
        if (rdd instanceof rde) {
            rde rde = (rde) rdd;
            return Observable.b(new ho(rde.a(), rde.b()));
        } else if (rdd instanceof a) {
            return Observable.b(new ho(null, ((a) rdd).a()));
        } else {
            return a();
        }
    }

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
        Observable observable;
        $$Lambda$rpo$fPPNzn7nBaJn5HpFQHzjDReDVwA r0 = new $$Lambda$rpo$fPPNzn7nBaJn5HpFQHzjDReDVwA(fragment);
        if (fragment instanceof jol) {
            observable = ((jol) fragment).af().a.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$rpo$kyngQadJE5eflBv4L4yxqCL2Os.INSTANCE, false).f((ObservableSource<? extends T>) a());
        } else {
            observable = a();
        }
        return Observable.a((ObservableSource<? extends T1>) r0, (ObservableSource<? extends T2>) observable, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rpo$lCjaXy7PQX7wtesG1ZmIh4a6tKc.INSTANCE).a((Predicate<? super T>) $$Lambda$rpo$Zr4vPbvsB9gRUR7iHFhOcSJN8.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Fragment fragment, Observer observer) {
        String str = null;
        Object a = fragment instanceof udv ? ((udv) fragment).aj().a() : null;
        if (fragment instanceof a) {
            str = ((a) fragment).ae_().toString();
        }
        observer.onNext(new ho(a, str));
    }
}
