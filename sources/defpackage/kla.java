package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: kla reason: default package */
public final class kla {
    @SafeVarargs
    public static <E> kjm<E> a(ObservableSource<E>... observableSourceArr) {
        final Observable a = Observable.a((ObservableSource<? extends T>[]) observableSourceArr);
        return new kjm<E>() {
            public final kkf subscribe(final kkn<E> kkn) {
                final Disposable a2 = a.a((Consumer<? super T>) new Consumer<E>() {
                    public final void accept(E e) {
                        kkn.accept(e);
                    }
                }, (Consumer<? super Throwable>) new Consumer<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) {
                        RxJavaPlugins.a((Throwable) obj);
                    }
                });
                return new kkf() {
                    public final void dispose() {
                        a2.bf_();
                    }
                };
            }
        };
    }
}
