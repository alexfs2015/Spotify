package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: uce reason: default package */
public final class uce {
    public static ObservableTransformer<b, ucb> a(ucf ucf, Scheduler scheduler) {
        return new $$Lambda$uce$jG41eUOQyf02Frw3ik0otOPwyao(ucf, scheduler);
    }

    public static ObservableTransformer<c, ucb> b(ucf ucf, Scheduler scheduler) {
        return new $$Lambda$uce$Hui6vNmtZN0qXkTKwokVsF_MqzQ(ucf, scheduler);
    }

    public static ObservableTransformer<e, ucb> c(ucf ucf, Scheduler scheduler) {
        return new $$Lambda$uce$jJ1ZNdZE06rvCVTMomObps2KSlM(ucf, scheduler);
    }

    public static ObservableTransformer<d, ucb> d(ucf ucf, Scheduler scheduler) {
        return new $$Lambda$uce$xy2worieatZYpCkkzstsS5BA8kY(ucf, scheduler);
    }

    public static ObservableTransformer<f, ucb> e(ucf ucf, Scheduler scheduler) {
        return new $$Lambda$uce$OCsW5F_4Z3VUr1Cc8m7NNVzii0(ucf, scheduler);
    }

    public static ObservableTransformer<a, ucb> f(ucf ucf, Scheduler scheduler) {
        return new $$Lambda$uce$m_Gt2DanXTpRwXOTJ5UwWDZfwk(ucf, scheduler);
    }

    public static ObservableTransformer<g, ucb> a(ucg ucg) {
        return new $$Lambda$uce$oXTjUqUqAQJu5AwzWhVe_f7upek(ucg);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ucg ucg, Observable observable) {
        $$Lambda$uce$x2r4qP7huRddHFC7tsZ7Ui9Y66g r0 = new $$Lambda$uce$x2r4qP7huRddHFC7tsZ7Ui9Y66g(ucg);
        ObjectHelper.a(r0, "mapper is null");
        return RxJavaPlugins.a((Completable) new ObservableSwitchMapCompletable(observable, r0, false)).a((ObservableSource<T>) Observable.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(ucg ucg, g gVar) {
        if (gVar.a) {
            return ucg.a();
        }
        return ucg.b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ucb a(Throwable th) {
        return new i();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ucb a(wsj wsj) {
        return new i();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ucb b(Throwable th) {
        return new i();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ucb b(wsj wsj) {
        return new i();
    }
}
