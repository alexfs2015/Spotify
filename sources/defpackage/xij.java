package defpackage;

/* renamed from: xij reason: default package */
public interface xij<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}
