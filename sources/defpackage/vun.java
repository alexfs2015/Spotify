package defpackage;

import hu.akarnokd.rxjava.interop.FlowableV2ToObservableV1;
import hu.akarnokd.rxjava.interop.SingleV2ToSingleV1;
import io.reactivex.BackpressureStrategy;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;

/* renamed from: vun reason: default package */
public final class vun {
    public static <T> Flowable<T> a(wud<T> wud) {
        ObjectHelper.a(wud, "source is null");
        return new vul(wud);
    }

    public static <T> Observable<T> b(wud<T> wud) {
        ObjectHelper.a(wud, "source is null");
        return new vum(wud);
    }

    public static <T> Single<T> a(wuh<T> wuh) {
        ObjectHelper.a(wuh, "source is null");
        return new vup(wuh);
    }

    public static <T, R> FlowableTransformer<T, R> a(final c<T, R> cVar) {
        ObjectHelper.a(cVar, "transformer is null");
        return new FlowableTransformer<T, R>() {
            public final wrf<R> apply(Flowable<T> flowable) {
                return vun.a((wud) cVar.call(vun.a((wrf<T>) flowable)));
            }
        };
    }

    public static <T, R> ObservableTransformer<T, R> a(final c<T, R> cVar, final BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(cVar, "transformer is null");
        return new ObservableTransformer<T, R>() {
            public final ObservableSource<R> apply(Observable<T> observable) {
                return vun.b((wud) cVar.call(vun.a((ObservableSource<T>) observable, backpressureStrategy)));
            }
        };
    }

    public static <T> wud<T> a(wrf<T> wrf) {
        ObjectHelper.a(wrf, "source is null");
        return wud.b((a<T>) new FlowableV2ToObservableV1<T>(wrf));
    }

    public static <T> wud<T> a(ObservableSource<T> observableSource, BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(observableSource, "source is null");
        ObjectHelper.a(backpressureStrategy, "strategy is null");
        return a((wrf<T>) Observable.b(observableSource).a(backpressureStrategy));
    }

    public static <T> wuh<T> a(SingleSource<T> singleSource) {
        ObjectHelper.a(singleSource, "source is null");
        return wuh.a((a<T>) new SingleV2ToSingleV1<T>(singleSource));
    }

    public static wub a(CompletableSource completableSource) {
        ObjectHelper.a(completableSource, "source is null");
        return wub.a((a) new vuj(completableSource));
    }

    public static <T, R> c<T, R> a(final ObservableTransformer<T, R> observableTransformer, final BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(observableTransformer, "transformer is null");
        return new c<T, R>() {
            public final /* synthetic */ Object call(Object obj) {
                return vun.a(observableTransformer.apply(vun.b((wud) obj)), backpressureStrategy);
            }
        };
    }

    public static wuk a(Disposable disposable) {
        ObjectHelper.a(disposable, "disposable is null");
        return new vuk(disposable);
    }

    public static wug a(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return new vuo(scheduler);
    }
}
