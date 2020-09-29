package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/* renamed from: fou reason: default package */
public abstract class fou<T> extends Observable<T> implements Consumer<T> {
    public abstract void accept(T t);
}
