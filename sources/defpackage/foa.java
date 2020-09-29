package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/* renamed from: foa reason: default package */
public abstract class foa<T> extends Observable<T> implements Consumer<T> {
    public abstract void accept(T t);
}
