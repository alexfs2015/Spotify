package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.PublishSubject;

/* renamed from: kkz reason: default package */
public final class kkz {
    public static <I, O> kjd<I, O> a(final ObservableTransformer<I, O> observableTransformer) {
        kkr.a(observableTransformer);
        return new kjd<I, O>() {
            public final kje<I> connect(final kkn<O> kkn) {
                final PublishSubject a2 = PublishSubject.a();
                final Disposable a3 = a2.a(observableTransformer).a((Consumer<? super T>) new Consumer<O>() {
                    public final void accept(O o) {
                        kkn.accept(o);
                    }
                }, (Consumer<? super Throwable>) new Consumer<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) {
                        RxJavaPlugins.b().accept((Throwable) obj);
                    }
                }, (Action) new Action() {
                    public final void run() {
                    }
                }, Functions.b());
                return new kje<I>() {
                    public final void accept(I i) {
                        a2.onNext(i);
                    }

                    public final void dispose() {
                        a3.bf_();
                    }
                };
            }
        };
    }
}
