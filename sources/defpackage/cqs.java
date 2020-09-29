package defpackage;

@cfp
/* renamed from: cqs reason: default package */
public final class cqs<T> extends cqt<T> {
    final T a;

    private cqs(T t) {
        this.a = t;
    }

    public static <T> cqs<T> a(T t) {
        return new cqs<>(t);
    }
}
