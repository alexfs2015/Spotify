package defpackage;

import io.reactivex.Completable;

/* renamed from: gjs reason: default package */
public abstract class gjs<T> {
    /* access modifiers changed from: protected */
    public abstract Completable a(T t);

    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b(T t);

    /* access modifiers changed from: 0000 */
    public final gjr<T> c(T t) {
        return new gjp(a(t), t, b(t), a());
    }
}
