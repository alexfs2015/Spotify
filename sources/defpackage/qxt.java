package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: qxt reason: default package */
public final class qxt {
    private final jtp a;
    private final jug b;
    private final kxz c;
    private final qwa d;

    public qxt(jtp jtp, jug jug, kxz kxz, qwa qwa) {
        this.a = jtp;
        this.b = jug;
        this.c = kxz;
        this.d = qwa;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue() || !bool3.booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(jtq jtq) {
        return Boolean.valueOf(jtq.a().mIsOffline && (jtq.b() || jtq.c()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (bool.booleanValue()) {
            return Observable.b(Boolean.TRUE);
        }
        return Observable.b(bool).c(15000, TimeUnit.MILLISECONDS, this.d.a());
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a.a.e(jtq.d().a()).c((Function<? super T, ? extends R>) $$Lambda$qxt$l4qMAsk2qPuDiT_mJlucbRdaiA8.INSTANCE).a(Functions.a()), (ObservableSource<? extends T2>) this.b.n.c((Function<? super T, ? extends R>) $$Lambda$3sIjhED2JERu8RZuH2n5vKP5GI.INSTANCE).e(Boolean.FALSE).a(Functions.a()), (ObservableSource<? extends T3>) this.c.a.e(new c()).c((Function<? super T, ? extends R>) $$Lambda$1PRdYXiTIrtX0hmcGNJjUQXK4.INSTANCE).a(Functions.a()).h(new $$Lambda$qxt$1Zyofs45CVq9kgT0ilYvQDerDc(this)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$qxt$kTdqVAPgCRJQwbduC2Xdj0fAHho.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$qxt$kuIWL_H0OkmNMQCdUxA_CTSOuk.INSTANCE).e(Boolean.FALSE).a(Functions.a());
    }
}
