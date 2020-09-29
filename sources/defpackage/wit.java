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

/* renamed from: wit reason: default package */
public final class wit {
    public static <T> Flowable<T> a(xii<T> xii) {
        ObjectHelper.a(xii, "source is null");
        return new wir(xii);
    }

    public static <T, R> FlowableTransformer<T, R> a(final c<T, R> cVar) {
        ObjectHelper.a(cVar, "transformer is null");
        return new FlowableTransformer<T, R>() {
            public final xfk<R> apply(Flowable<T> flowable) {
                return wit.a((xii) cVar.call(wit.a((xfk<T>) flowable)));
            }
        };
    }

    public static <T, R> ObservableTransformer<T, R> a(final c<T, R> cVar, final BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(cVar, "transformer is null");
        return new ObservableTransformer<T, R>() {
            public final ObservableSource<R> apply(Observable<T> observable) {
                return wit.b((xii) cVar.call(wit.a((ObservableSource<T>) observable, backpressureStrategy)));
            }
        };
    }

    public static <T> Single<T> a(xim<T> xim) {
        ObjectHelper.a(xim, "source is null");
        return new wiv(xim);
    }

    public static xig a(CompletableSource completableSource) {
        ObjectHelper.a(completableSource, "source is null");
        return xig.a((a) new wip(completableSource));
    }

    public static <T, R> c<T, R> a(final ObservableTransformer<T, R> observableTransformer, final BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(observableTransformer, "transformer is null");
        return new c<T, R>() {
            public final /* synthetic */ Object call(Object obj) {
                return wit.a(observableTransformer.apply(wit.b((xii) obj)), backpressureStrategy);
            }
        };
    }

    public static <T> xii<T> a(ObservableSource<T> observableSource, BackpressureStrategy backpressureStrategy) {
        ObjectHelper.a(observableSource, "source is null");
        ObjectHelper.a(backpressureStrategy, "strategy is null");
        return a((xfk<T>) Observable.b(observableSource).a(backpressureStrategy));
    }

    public static <T> xii<T> a(xfk<T> xfk) {
        ObjectHelper.a(xfk, "source is null");
        return xii.b((a<T>) new FlowableV2ToObservableV1<T>(xfk));
    }

    public static xil a(Scheduler scheduler) {
        ObjectHelper.a(scheduler, "scheduler is null");
        return new wiu(scheduler);
    }

    public static <T> xim<T> a(SingleSource<T> singleSource) {
        ObjectHelper.a(singleSource, "source is null");
        return xim.a((a<T>) new SingleV2ToSingleV1<T>(singleSource));
    }

    public static xip a(Disposable disposable) {
        ObjectHelper.a(disposable, "disposable is null");
        return new wiq(disposable);
    }

    public static <T> Observable<T> b(xii<T> xii) {
        ObjectHelper.a(xii, "source is null");
        return new wis(xii);
    }
}
