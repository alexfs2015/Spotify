package defpackage;

import com.spotify.http.RequestInfo;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableBufferTimed;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ghd reason: default package */
public final class ghd implements ghl {
    public Disposable a = Disposables.b();
    private final PublishSubject<RequestInfo> b;
    private final Observable<List<RequestInfo>> c;
    private final ghc d;

    public ghd(ghc ghc, Scheduler scheduler) {
        this.d = ghc;
        this.b = PublishSubject.a();
        PublishSubject<RequestInfo> publishSubject = this.b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Callable a2 = ArrayListSupplier.a();
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        ObjectHelper.a(a2, "bufferSupplier is null");
        ObjectHelper.a(50, "count");
        ObservableBufferTimed observableBufferTimed = new ObservableBufferTimed(publishSubject, 1, 1, timeUnit, scheduler, a2, 50, false);
        this.c = RxJavaPlugins.a((Observable<T>) observableBufferTimed).a((Predicate<? super T>) $$Lambda$ghd$vIzfjM84nCe4CA5EgNiMbVA1dYU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(List list) {
        return !list.isEmpty();
    }

    public final void a(RequestInfo requestInfo) {
        this.b.onNext(requestInfo);
    }

    public final void a() {
        this.a.bf_();
        Observable<List<RequestInfo>> observable = this.c;
        ghc ghc = this.d;
        ghc.getClass();
        this.a = observable.a((Consumer<? super T>) new $$Lambda$tzoQbUJ1pRvwE7hHjRFlShPUa4o<Object>(ghc), (Consumer<? super Throwable>) $$Lambda$ghd$4ODJoQ92oUvhVz2lfWte3dvFEu4.INSTANCE);
    }
}
