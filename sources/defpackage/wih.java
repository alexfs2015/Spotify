package defpackage;

/* renamed from: wih reason: default package */
public final class wih<T> implements who<T>, wig<T> {
    private final T a;

    static {
        new wih(null);
    }

    private wih(T t) {
        this.a = t;
    }

    public static <T> wig<T> a(T t) {
        return new wih(wil.a(t, "instance cannot be null"));
    }

    public final T get() {
        return this.a;
    }
}
