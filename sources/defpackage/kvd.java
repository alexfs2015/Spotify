package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableScan;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: kvd reason: default package */
public final class kvd {
    private final kvf a;

    kvd(kvf kvf) {
        this.a = kvf;
    }

    public final Single<Boolean> a() {
        return this.a.a().c((Consumer<? super Throwable>) $$Lambda$kvd$weUjCTEkw7eftGqjvSBw007jXng.INSTANCE).f($$Lambda$kvd$sVBJcS9RDaCQkYyT_4cDO7EL8OQ.INSTANCE);
    }

    public final Observable<Boolean> b() {
        Observable b = this.a.b();
        $$Lambda$kvd$6omVXNY3xfFizYH8iZAcRD_imTU r1 = $$Lambda$kvd$6omVXNY3xfFizYH8iZAcRD_imTU.INSTANCE;
        ObjectHelper.a(r1, "accumulator is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableScan<T>(b, r1)).a((Consumer<? super Throwable>) $$Lambda$kvd$n5v_D2V0wOtV53_GdSGCkClgQZE.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kvd$g6Tc3_ehMjqWvun1QG7DlHB0iU.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CappedOndemandStatus a(CappedOndemandStatus cappedOndemandStatus, CappedOndemandStatus cappedOndemandStatus2) {
        return cappedOndemandStatus.timestamp() > cappedOndemandStatus2.timestamp() ? cappedOndemandStatus : cappedOndemandStatus2;
    }

    public final Observable<Boolean> a(Boolean bool) {
        Completable completable;
        if (bool.booleanValue()) {
            completable = this.a.c();
        } else {
            completable = this.a.d();
        }
        return completable.a((ObservableSource<T>) Observable.b(bool));
    }
}
