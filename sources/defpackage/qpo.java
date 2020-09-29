package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.speakercompanion.model.EntityFeedback;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.observable.ObservableElementAtMaybe;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: qpo reason: default package */
public final class qpo implements Consumer<EntityFeedback>, a {
    /* access modifiers changed from: private */
    public Disposable a;
    private b b;

    public qpo(qov qov, Scheduler scheduler, a aVar, Observable<String> observable, boolean z) {
        final boolean z2 = z;
        final Observable<String> observable2 = observable;
        final qov qov2 = qov;
        final Scheduler scheduler2 = scheduler;
        AnonymousClass1 r0 = new c() {
            public final void a() {
                if (qpo.this.a != null && !qpo.this.a.b()) {
                    qpo.this.a.bd_();
                }
            }

            public final void c() {
                if (z2) {
                    qpo qpo = qpo.this;
                    Maybe a2 = qpo.a(observable2, qov2, scheduler2);
                    qpo qpo2 = qpo.this;
                    $$Lambda$qpo$1$cFhT8YKX2z_q4PQJ1vsJX98jak8 r3 = $$Lambda$qpo$1$cFhT8YKX2z_q4PQJ1vsJX98jak8.INSTANCE;
                    Action action = Functions.b;
                    ObjectHelper.a(qpo2, "onSuccess is null");
                    ObjectHelper.a(r3, "onError is null");
                    ObjectHelper.a(action, "onComplete is null");
                    MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(qpo2, r3, action);
                    a2.a((MaybeObserver<? super T>) maybeCallbackObserver);
                    qpo.a = maybeCallbackObserver;
                }
            }
        };
        aVar.a(r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(String str) {
        return this.b != null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(qov qov, String str) {
        return !(qov.a.a != null);
    }

    /* access modifiers changed from: 0000 */
    public final Maybe<EntityFeedback> a(Observable<String> observable, qov qov, Scheduler scheduler) {
        Maybe a2 = RxJavaPlugins.a((Maybe<T>) new ObservableElementAtMaybe<T>(observable.a((Predicate<? super T>) new $$Lambda$qpo$Lyo8csNkb55Kz7l8RDwLbQMxxwI<Object>(this)).a((Predicate<? super T>) new $$Lambda$qpo$81FCm63ZBH5ciXqbyk1zvrzW96Q<Object>(qov)), 0));
        qov.getClass();
        $$Lambda$rkBK4yWzxrllYLpGR5nh5flaLEo r0 = new $$Lambda$rkBK4yWzxrllYLpGR5nh5flaLEo(qov);
        ObjectHelper.a(r0, "mapper is null");
        Maybe a3 = RxJavaPlugins.a((Maybe<T>) new MaybeFlatten<T>(a2, r0)).a((Function<? super T, ? extends R>) $$Lambda$qCOr4yuyGU5sMcHEdSJlJTh8ic.INSTANCE);
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeObserveOn<T>(a3, scheduler));
    }

    public final void a(b bVar) {
        this.b = bVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        this.b.a((EntityFeedback) obj);
    }
}
