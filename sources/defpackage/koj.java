package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: koj reason: default package */
public final class koj {
    @SafeVarargs
    public static <E> kmv<E> a(ObservableSource<E>... observableSourceArr) {
        final Observable b = Observable.b((ObservableSource<? extends T>[]) observableSourceArr);
        return new kmv<E>() {
            public final kno subscribe(final knw<E> knw) {
                final Disposable a2 = b.a((Consumer<? super T>) new Consumer<E>() {
                    public final void accept(E e) {
                        knw.accept(e);
                    }
                }, (Consumer<? super Throwable>) new Consumer<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) {
                        RxJavaPlugins.a((Throwable) obj);
                    }
                });
                return new kno() {
                    public final void dispose() {
                        a2.bd_();
                    }
                };
            }
        };
    }
}
