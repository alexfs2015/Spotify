package defpackage;

@cey
/* renamed from: cqb reason: default package */
public final class cqb<T> extends cqc<T> {
    final T a;

    private cqb(T t) {
        this.a = t;
    }

    public static <T> cqb<T> a(T t) {
        return new cqb<>(t);
    }
}
