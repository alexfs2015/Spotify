package defpackage;

import io.reactivex.Completable;

/* renamed from: gld reason: default package */
public abstract class gld<T> {
    /* access modifiers changed from: protected */
    public abstract Completable a(T t);

    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b(T t);

    /* access modifiers changed from: 0000 */
    public final glc<T> c(T t) {
        return new gla(a(t), t, b(t), a());
    }
}
