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

/* renamed from: qha reason: default package */
public final class qha implements Consumer<EntityFeedback>, a {
    /* access modifiers changed from: private */
    public Disposable a;
    private b b;

    public final /* synthetic */ void accept(Object obj) {
        this.b.a((EntityFeedback) obj);
    }

    public qha(qgh qgh, Scheduler scheduler, a aVar, Observable<String> observable, boolean z) {
        final boolean z2 = z;
        final Observable<String> observable2 = observable;
        final qgh qgh2 = qgh;
        final Scheduler scheduler2 = scheduler;
        AnonymousClass1 r0 = new c() {
            public final void c() {
                if (z2) {
                    qha qha = qha.this;
                    Maybe a2 = qha.a(observable2, qgh2, scheduler2);
                    qha qha2 = qha.this;
                    $$Lambda$qha$1$MSACRUfU0RlA_EYGo_6fwTJ6Ks r3 = $$Lambda$qha$1$MSACRUfU0RlA_EYGo_6fwTJ6Ks.INSTANCE;
                    Action action = Functions.b;
                    ObjectHelper.a(qha2, "onSuccess is null");
                    ObjectHelper.a(r3, "onError is null");
                    ObjectHelper.a(action, "onComplete is null");
                    MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(qha2, r3, action);
                    a2.a((MaybeObserver<? super T>) maybeCallbackObserver);
                    qha.a = maybeCallbackObserver;
                }
            }

            public final void a() {
                if (qha.this.a != null && !qha.this.a.b()) {
                    qha.this.a.bf_();
                }
            }
        };
        aVar.a(r0);
    }

    public final void a(b bVar) {
        this.b = bVar;
    }

    /* access modifiers changed from: 0000 */
    public final Maybe<EntityFeedback> a(Observable<String> observable, qgh qgh, Scheduler scheduler) {
        Maybe a2 = RxJavaPlugins.a((Maybe<T>) new ObservableElementAtMaybe<T>(observable.a((Predicate<? super T>) new $$Lambda$qha$lrHAL9aYwX6kCwi0GQyeCM8F_98<Object>(this)).a((Predicate<? super T>) new $$Lambda$qha$Xyg7uMbg8iP5YmCXwnTmDxS6KVQ<Object>(qgh)), 0));
        qgh.getClass();
        $$Lambda$uMu96M1tRbZn8nJoFZ3W9hcLfY r0 = new $$Lambda$uMu96M1tRbZn8nJoFZ3W9hcLfY(qgh);
        ObjectHelper.a(r0, "mapper is null");
        Maybe a3 = RxJavaPlugins.a((Maybe<T>) new MaybeFlatten<T>(a2, r0)).a((Function<? super T, ? extends R>) $$Lambda$qCOr4yuyGU5sMcHEdSJlJTh8ic.INSTANCE);
        ObjectHelper.a(scheduler, "scheduler is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeObserveOn<T>(a3, scheduler));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(String str) {
        return this.b != null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(qgh qgh, String str) {
        return !(qgh.a.a != null);
    }
}
