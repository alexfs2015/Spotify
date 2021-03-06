package defpackage;

import com.spotify.mobius.rx2.UnrecoverableIncomingException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Consumer;

/* renamed from: klc reason: default package */
final class klc<E, M> implements ObservableTransformer<E, M> {
    /* access modifiers changed from: private */
    public final c<M, E, ?> a;
    /* access modifiers changed from: private */
    public final M b;

    klc(c<M, E, ?> cVar, M m) {
        this.a = cVar;
        this.b = m;
    }

    public final ObservableSource<M> apply(final Observable<E> observable) {
        return Observable.a((ObservableOnSubscribe<T>) new ObservableOnSubscribe<M>() {
            public final void subscribe(final ObservableEmitter<M> observableEmitter) {
                final kju a2 = klc.this.a.a(klc.this.b);
                a2.a((kkn<M>) new kkn<M>() {
                    public final void accept(M m) {
                        observableEmitter.a(m);
                    }
                });
                final Disposable a3 = observable.a((Consumer<? super T>) new Consumer<E>() {
                    public final void accept(E e) {
                        a2.a(e);
                    }
                }, (Consumer<? super Throwable>) new Consumer<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) {
                        observableEmitter.a((Throwable) new UnrecoverableIncomingException((Throwable) obj));
                    }
                });
                observableEmitter.a((Cancellable) new Cancellable() {
                    public final void cancel() {
                        a2.dispose();
                        a3.bf_();
                    }
                });
            }
        });
    }
}
