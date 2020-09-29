package defpackage;

/* renamed from: wue reason: default package */
public interface wue<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}
