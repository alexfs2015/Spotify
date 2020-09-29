package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.Map;

/* renamed from: hgz reason: default package */
public class hgz {
    public final Observable<Map<String, String>> a;
    public final gcq<List<vvj>> b;

    public hgz(Observable<Map<String, String>> observable) {
        vve vve = new vve(hgz.class.getSimpleName(), observable);
        this.a = Observable.a((ObservableOnSubscribe<T>) vve);
        vve.getClass();
        this.b = new $$Lambda$2vem5WZMcFRBSZ7kGjGsOn6ys(vve);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(String str, Map map) {
        return (String) map.get(str);
    }

    @Deprecated
    public final xii<Map<String, String>> a() {
        return wit.a((ObservableSource<T>) this.a, BackpressureStrategy.BUFFER);
    }

    @Deprecated
    public final xii<String> a(String str) {
        return a().e((xiy<? super T, ? extends R>) new $$Lambda$hgz$7yqnbrkNShuA0jIzx3L8YnspNmo<Object,Object>(str)).b();
    }

    public final Observable<String> b(String str) {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$hgz$xqOLIQeGGUKPghFLg3YfqCKvaIs<Object,Object>(str)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$0BytUNHz5__EpEj3ciOqr9HNVAg.INSTANCE).a(Functions.a());
    }
}
