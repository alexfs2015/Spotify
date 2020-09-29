package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: rgi reason: default package */
public final class rgi {
    private final jvx a;
    private final jwo b;
    private final lbi c;
    private final rep d;

    public rgi(jvx jvx, jwo jwo, lbi lbi, rep rep) {
        this.a = jvx;
        this.b = jwo;
        this.c = lbi;
        this.d = rep;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return bool.booleanValue() ? Observable.b(Boolean.TRUE) : Observable.b(bool).c(15000, TimeUnit.MILLISECONDS, this.d.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue() || !bool3.booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(jvy jvy) {
        return Boolean.valueOf(jvy.a().mIsOffline && (jvy.b() || jvy.c()));
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a.a.e(jvy.d().a()).c((Function<? super T, ? extends R>) $$Lambda$rgi$XUj48qyg5x0dkRcGTf5uuj5km0.INSTANCE).a(Functions.a()), (ObservableSource<? extends T2>) this.b.n.c((Function<? super T, ? extends R>) $$Lambda$3sIjhED2JERu8RZuH2n5vKP5GI.INSTANCE).e(Boolean.FALSE).a(Functions.a()), (ObservableSource<? extends T3>) this.c.a.e(new c()).c((Function<? super T, ? extends R>) $$Lambda$a_SACf1ZhcnjGJO9pdXOVduWmO4.INSTANCE).a(Functions.a()).h(new $$Lambda$rgi$_f09qhrkmQ1ICeqV4KRXgvrQMF8(this)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$rgi$CJsiKgc0VsAAMphU3OOb9fTwXng.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$rgi$9TieVVeVcFpj4APPvyYJan04eEI.INSTANCE).e(Boolean.FALSE).a(Functions.a());
    }
}
