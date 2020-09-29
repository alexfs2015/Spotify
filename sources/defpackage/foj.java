package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* renamed from: foj reason: default package */
public abstract class foj<T> extends Observable<T> {
    /* access modifiers changed from: protected */
    public abstract T a();

    public final void a(Observer<? super T> observer) {
        b(observer);
        observer.onNext(a());
    }

    /* access modifiers changed from: protected */
    public abstract void b(Observer<? super T> observer);
}
