package defpackage;

/* renamed from: vub reason: default package */
public final class vub<T> implements vti<T>, vua<T> {
    private final T a;

    public static <T> vua<T> a(T t) {
        return new vub(vuf.a(t, "instance cannot be null"));
    }

    static {
        new vub(null);
    }

    private vub(T t) {
        this.a = t;
    }

    public final T get() {
        return this.a;
    }
}
