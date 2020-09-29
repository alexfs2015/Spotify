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

/* renamed from: hed reason: default package */
public class hed {
    public final Observable<Map<String, String>> a;
    public final gbs<List<vie>> b;

    public hed(Observable<Map<String, String>> observable) {
        vhz vhz = new vhz(hed.class.getSimpleName(), observable);
        this.a = Observable.a((ObservableOnSubscribe<T>) vhz);
        vhz.getClass();
        this.b = new $$Lambda$BuNwhbsTb4KdGOz9_ch31bpJKQ0(vhz);
    }

    @Deprecated
    public final wud<Map<String, String>> a() {
        return vun.a((ObservableSource<T>) this.a, BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(String str, Map map) {
        return (String) map.get(str);
    }

    @Deprecated
    public final wud<String> a(String str) {
        return a().f(new $$Lambda$hed$VsFUfZc7qUd_rwuAqPdPzKe0aLU(str)).b();
    }

    public final Observable<String> b(String str) {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$hed$j6pLcJrSO6F5_Qh2aIpa6SiQP84<Object,Object>(str)).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$0BytUNHz5__EpEj3ciOqr9HNVAg.INSTANCE).a(Functions.a());
    }
}
