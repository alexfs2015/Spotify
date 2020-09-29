package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* renamed from: fnp reason: default package */
public abstract class fnp<T> extends Observable<T> {
    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public abstract void b(Observer<? super T> observer);

    public final void a(Observer<? super T> observer) {
        b(observer);
        observer.onNext(a());
    }
}
